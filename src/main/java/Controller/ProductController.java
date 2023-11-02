package Controller;

import DTO.AccountDTO;
import DTO.CustomerDTO;
import DTO.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProductService;

import java.util.UUID;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findProductById(@PathVariable("id") UUID id){
        return new ResponseEntity<>(productService.findProductById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{string}")
    public void deleteProductById(@PathVariable UUID uuid) {
        productService.deleteProductById(uuid);
    }


}
