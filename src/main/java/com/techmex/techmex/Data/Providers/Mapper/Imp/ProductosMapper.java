package com.techmex.techmex.Data.Providers.Mapper.Imp;

import com.techmex.techmex.Data.Entities.ProductosModel;
import com.techmex.techmex.Data.Providers.Mapper.IMapper;
import com.techmex.techmex.Dtos.ProductosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductosMapper implements IMapper<ProductosModel, ProductosDto> {
    @Override
    public ProductosDto mapToDto(ProductosModel productosModel) {
        return ProductosDto.builder()
                .producto_id(productosModel.getProducto_id())
                .nombre(productosModel.getNombre())
                .precio(productosModel.getPrecio())
                .categoria_id((productosModel.getCategoria()==null)? null:productosModel.getCategoria().getCategoria_id())
                .imagen(productosModel.getImagen())
                .descripcion(productosModel.getDescripcion())
                .build();
    }

    @Override
    public ProductosModel mapToEntity(ProductosDto productosDto) {
        return null;
    }
}
