package com.techmex.techmex.Data.Providers.Impl;


import com.techmex.techmex.Data.Dao.ICategoriasDao;
import com.techmex.techmex.Data.Dao.IProductosDao;

import com.techmex.techmex.Data.Entities.CategoriasModel;
import com.techmex.techmex.Data.Entities.ProductosModel;
import com.techmex.techmex.Data.Entities.enums.UserRole;
import com.techmex.techmex.Data.Providers.IProductosProvider;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;

import com.techmex.techmex.Dtos.ProductosDto;
import com.techmex.techmex.Util.Security.SecurityContextHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class ProductosProvider implements IProductosProvider {
    private final IProductosDao iProductosDao;
    private final IMapper<ProductosModel, ProductosDto> mapperProductos;
    private final ICategoriasDao iCategoriasDao;

    private final SecurityContextHelper securityContextHelper;

    @Override
    public List<ProductosDto> getProductos() {

        UserRole rol = securityContextHelper.getUser().getRol();

        if(rol != UserRole.ADMIN) {
            return null;
        }

        return iProductosDao.findAll().stream()
                .map(mapperProductos::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductosDto getProductosId(Integer id) {
        return iProductosDao.findById(id)
                .map(mapperProductos::mapToDto)
                .orElse(null);
    }

    @Override
    public ProductosDto insertProductos(String nombre, Integer precio, Integer categoria_id, String imagen, String descripcion) {

       CategoriasModel categoria = iCategoriasDao.findById(categoria_id).orElse(null);
       ProductosModel producto = ProductosModel.builder()
                .nombre(nombre)
                .precio(precio)
                .categoria(categoria)
                .imagen(imagen)
                .descripcion(descripcion)
                .build();

        iProductosDao.save(producto);
        return mapperProductos.mapToDto(producto);
    }

    @Override
    public ProductosDto updateProductos(Integer id, String nombre, Integer precio, Integer categoria_id, String imagen, String descripcion) {

        CategoriasModel categoria = iCategoriasDao.findById(categoria_id).orElse(null);
        ProductosModel producto = iProductosDao.findById(id).orElse(null);

        producto = producto.builder()
                .producto_id(id)
                .nombre(nombre)
                .precio(precio)
                .categoria(categoria)
                .imagen(imagen  )
                .descripcion(descripcion)
                .build();

        iProductosDao.save(producto);

        return mapperProductos.mapToDto(producto);

    }

    @Override
    public void deleteProductosId(Integer id) {

        if(!iProductosDao.existsById(id)){

            throw new RuntimeException("USUARIO NO EXISTE");
        }
        iProductosDao.deleteById(id);
    }
}
