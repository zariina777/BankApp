package com.example.bankapp.mapper;

import com.example.bankapp.DTO.ProductDTO;
import com.example.bankapp.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Named("toDto")
    ProductDTO ToDTO(Product product);
}
