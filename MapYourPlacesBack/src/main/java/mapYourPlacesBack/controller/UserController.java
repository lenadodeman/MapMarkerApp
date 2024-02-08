package mapYourPlacesBack.controller;

import mapYourPlacesBack.entity.User;
import mapYourPlacesBack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/all", produces = "application/json") // localhost:8080/api/user/all
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json") // localhost:8080/api/user/1
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userRepository.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(value = "/create", produces = "application/json") // localhost:8080/api/user/create
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    @PutMapping(value = "/update", produces = "application/json") // localhost:8080/api/user/update
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}") // localhost:8080/api/user/delete/1
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
