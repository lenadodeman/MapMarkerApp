package mapYourPlacesBack.controller;


import mapYourPlacesBack.entity.Localisation;
import mapYourPlacesBack.repository.LocalisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/localisation")
public class LocalisationController {

    @Autowired
    private LocalisationRepository localisationRepository;

    @GetMapping(value="/all", produces = "application/json") // localhost:8080/api/localisation/all
    public ResponseEntity<List<Localisation>> getAllLocalisations() {
        return new ResponseEntity<>(localisationRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}", produces = "application/json") // localhost:8080/api/localisation/1
    public ResponseEntity<Localisation> getLocalisationById(@PathVariable Long id) {
        return new ResponseEntity<>(localisationRepository.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(value="/create", produces = "application/json") // localhost:8080/api/localisation/create
    public ResponseEntity<Localisation> createLocalisation(@RequestBody Localisation localisation) {
        return new ResponseEntity<>(localisationRepository.save(localisation), HttpStatus.OK);
    }

    @PostMapping(value="/update", produces = "application/json") // localhost:8080/api/localisation/update
    public ResponseEntity<Localisation> updateLocalisation(@RequestBody Localisation localisation) {
        return new ResponseEntity<>(localisationRepository.save(localisation), HttpStatus.OK);
    }

    @PostMapping(value="/delete/{id}") // localhost:8080/api/localisation/delete/1
    public void deleteLocalisation(@PathVariable Long id) {
        localisationRepository.deleteById(id);
    }

}
