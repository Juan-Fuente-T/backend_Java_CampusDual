package com.campusdual.appmazing_2024.api;

import com.campusdual.appmazing_2024.model.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    //CRUD Operations
    ProductDTO queryProduct(ProductDTO productDTO);

    List<ProductDTO> queryAllProducts();

    int insertProduct(ProductDTO productDTO);

    int updateProduct(ProductDTO productDTO);

    int deleteProduct(ProductDTO productDTO);

}
