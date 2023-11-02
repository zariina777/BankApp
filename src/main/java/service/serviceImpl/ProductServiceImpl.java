package service.serviceImpl;

import DTO.ProductDTO;
import lombok.RequiredArgsConstructor;
import mapper.ProductMapper;
import org.springframework.stereotype.Service;
import repository.ProductRepository;
import service.ProductService;

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
