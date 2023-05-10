package com.techmex.techmex.Data.Providers;
import com.techmex.techmex.Dtos.ProductosDto;

import java.util.List;

public interface IProductosProvider {
    List<ProductosDto> getProductos();
    ProductosDto getProductosId(Integer id);
    ProductosDto insertProductos(String nombre,Integer precio, Integer categoria_id,String imagen, String descripcion);
    ProductosDto updateProductos(Integer id,String nombre,Integer precio,  Integer categoria_id,String imagen, String descripcion);
    void deleteProductosId(Integer id);
}
