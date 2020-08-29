package pl.sda.shop.products;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
class ProductController {

    private ProductService service;

    ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products/{id}")
    @ResponseBody
    ResponseEntity getProduct(@PathVariable("id") Long id) {
        try {
            Product product = service.getProductById(id);
            return new ResponseEntity(product, null, HttpStatus.OK);
        } catch (NoSuchProductException e) {
            return new ResponseEntity(e.getMessage(), null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/products")
    ResponseEntity saveProduct(@RequestBody Product product ) {
        Product savedProduct = service.save(product);
        return new ResponseEntity(savedProduct, null, HttpStatus.OK);
    }
}
