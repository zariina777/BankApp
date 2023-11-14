package com.example.bankapp.service;

import com.example.bankapp.DTO.ProductDTO;

import java.util.UUID;

public interface ProductService {
    ProductDTO findProductById(UUID id);

    void deleteProductById(UUID uuid);

    ProductDTO getProductById(UUID id);
}
