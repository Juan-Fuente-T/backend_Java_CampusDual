package com.campusdual.appmazing_2024.model.dto.dtomapper;

import com.campusdual.appmazing_2024.model.Product;
import com.campusdual.appmazing_2024.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO productdto);
    List<ProductDTO> toDTOList(List<Product> products);
}
