package pl.sda.shop.products;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
class OrderController {

    private OrderRepository repository;

    OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("order/{id}")
    @ResponseBody
    ResponseEntity getOrder(@PathVariable("id") Long id) {
        try {
            Order order = repository.getOne(id);
            return new ResponseEntity(order, null, HttpStatus.OK);
        } catch (NoSuchProductException e) {
            return new ResponseEntity(e.getMessage(), null, HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/orders")
    ResponseEntity saveProduct(@RequestBody Order order) {
        Order savedOrder = repository.save(order);
        return new ResponseEntity(savedOrder, null, HttpStatus.OK);
    }
}