package com.techmex.techmex.Core.Services;
import com.techmex.techmex.Dtos.ProductosDto;

import java.util.List;

public interface IProductosService {
    List<ProductosDto> getProductos();
    ProductosDto getProductosId(Integer id);
    ProductosDto insertProductos(String nombre,Integer precio, Integer categoria_id,String imagen, String descripcion);
    ProductosDto updateProductos(Integer id,String nombre,Integer precio,  Integer categoria_id,String imagen, String descripcion);
    void deleteProductosId(Integer id);
}
