package com.techmex.techmex.Core.Services.Impl;

import com.techmex.techmex.Core.Services.IProductosService;
import com.techmex.techmex.Data.Providers.IProductosProvider;
import com.techmex.techmex.Dtos.ProductosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductosService implements IProductosService {

    private final IProductosProvider productosProvider;
    @Override
    public List<ProductosDto> getProductos() {
        return productosProvider.getProductos();
    }

    @Override
    public ProductosDto getProductosId(Integer id) {
        return productosProvider.getProductosId(id);
    }

    @Override
    public ProductosDto insertProductos(String nombre, Integer precio, Integer categoria_id, String imagen, String descripcion) {
        return productosProvider.insertProductos(nombre, precio, categoria_id, imagen, descripcion);
    }

    @Override
    public ProductosDto updateProductos(Integer id, String nombre, Integer precio, Integer categoria_id, String imagen, String descripcion) {
        return productosProvider.updateProductos(id, nombre, precio, categoria_id, imagen, descripcion);
    }

    @Override
    public void deleteProductosId(Integer id) {
        productosProvider.deleteProductosId(id);
    }
}
