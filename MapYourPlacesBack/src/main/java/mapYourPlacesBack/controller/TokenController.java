package mapYourPlacesBack.controller;


import mapYourPlacesBack.entity.Token;
import mapYourPlacesBack.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/token")
public class TokenController {

    @Autowired
    private TokenRepository tokenRepository;


    @GetMapping(value = "/all", produces = "application/json") // localhost:8080/api/token/all
    public ResponseEntity<List<Token>> getAllTokens() {
        return new ResponseEntity<>(tokenRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json") // localhost:8080/api/token/1
    public ResponseEntity<Token> getTokenById(@PathVariable Long id) {
        return new ResponseEntity<>(tokenRepository.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(value = "/create", produces = "application/json") // localhost:8080/api/token/create
    public ResponseEntity<Token> createToken(@RequestBody Token token) {
        return new ResponseEntity<>(tokenRepository.save(token), HttpStatus.OK);
    }

    @PutMapping(value = "/update", produces = "application/json") // localhost:8080/api/token/update
    public ResponseEntity<Token> updateToken(@RequestBody Token token) {
        return new ResponseEntity<>(tokenRepository.save(token), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}") // localhost:8080/api/token/delete/1
    public void deleteToken(@PathVariable Long id) {
        tokenRepository.deleteById(id);
    }
}
