package pl.sda.shop.products;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
class UserController {

        private UserRepository base;

        UserController(UserRepository base) {
            this.base = base;
        }
        @GetMapping("users/{id}")
        @ResponseBody
        ResponseEntity getOrder(@PathVariable("id") Long id) {
            try {
                User user = base.findById(id).get();
                return new ResponseEntity(user, null, HttpStatus.OK);
            } catch (NoSuchProductException e) {
                return new ResponseEntity(e.getMessage(), null, HttpStatus.NOT_FOUND);
            }

        }

        @PostMapping("/users")
        ResponseEntity saveProduct(@RequestBody User user) {
            User savedOrder = base.save(user);
            return new ResponseEntity(savedOrder, null, HttpStatus.OK);
        }
}
