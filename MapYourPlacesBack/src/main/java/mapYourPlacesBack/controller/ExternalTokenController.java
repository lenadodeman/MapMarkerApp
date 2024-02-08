package mapYourPlacesBack.controller;

import mapYourPlacesBack.entity.ExternalToken;
import mapYourPlacesBack.repository.ExternalTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/externalToken")
public class ExternalTokenController {

    @Autowired
    private ExternalTokenRepository externalTokenRepository;

    @GetMapping(value = "/all", produces = "application/json") // localhost:8080/api/externalToken/all
    public ResponseEntity<List<ExternalToken>> getAllExternalTokens() {
        return new ResponseEntity<>(externalTokenRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json") // localhost:8080/api/externalToken/1
    public ResponseEntity<ExternalToken> getExternalTokenById(@PathVariable Long id) {
        return new ResponseEntity<>(externalTokenRepository.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(value = "/create", produces = "application/json") // localhost:8080/api/externalToken/create
    public ResponseEntity<ExternalToken> createExternalToken(@RequestBody ExternalToken externalToken) {
        return new ResponseEntity<>(externalTokenRepository.save(externalToken), HttpStatus.OK);
    }

    @PutMapping(value = "/update", produces = "application/json") // localhost:8080/api/externalToken/update
    public ResponseEntity<ExternalToken> updateExternalToken(@RequestBody ExternalToken externalToken) {
        return new ResponseEntity<>(externalTokenRepository.save(externalToken), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}") // localhost:8080/api/externalToken/delete/1
    public void deleteExternalToken(@PathVariable Long id) {
        externalTokenRepository.deleteById(id);
    }
}
