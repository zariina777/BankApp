package com.example.bankapp.service.serviceImpl;

import com.example.bankapp.DTO.ProductDTO;
import lombok.RequiredArgsConstructor;
import com.example.bankapp.mapper.ProductMapper;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.ProductRepository;
import com.example.bankapp.service.ProductService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ProductDTO findProductById(UUID id) {
        return null;
    }

    @Override
    public void deleteProductById(UUID uuid) {

    }
    @Override
    public ProductDTO getProductById(UUID id) {
        return null;
    }
}
