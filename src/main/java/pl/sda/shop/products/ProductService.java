package pl.sda.shop.products;

import org.springframework.stereotype.Service;

@Service
class ProductService {
    private ProductRepository repository;

    ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    Product getProductById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchProductException("Nie ma takiego produktu!"));
    }

    Product save(Product product) {
        return repository.save(product);
    }

}
