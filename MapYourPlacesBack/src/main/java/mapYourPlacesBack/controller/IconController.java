package mapYourPlacesBack.controller;

import mapYourPlacesBack.entity.Icon;
import mapYourPlacesBack.repository.IconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/icon")
public class IconController {

    @Autowired
    private IconRepository iconRepository;

    @GetMapping(value = "/all", produces = "application/json") // localhost:8080/api/icon/all
    public ResponseEntity<List<Icon>> getAllIcons() {
        return new ResponseEntity<>(iconRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json") // localhost:8080/api/icon/1
    public ResponseEntity<Icon> getIconById(@PathVariable Long id) {
        return new ResponseEntity<>(iconRepository.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(value = "/create", produces = "application/json") // localhost:8080/api/icon/create
    public ResponseEntity<Icon> createIcon(@RequestBody Icon icon) {
        return new ResponseEntity<>(iconRepository.save(icon), HttpStatus.OK);
    }

    @PutMapping(value = "/update", produces = "application/json") // localhost:8080/api/icon/update
    public ResponseEntity<Icon> updateIcon(@RequestBody Icon icon) {
        return new ResponseEntity<>(iconRepository.save(icon), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}") // localhost:8080/api/icon/delete/1
    public void deleteIcon(@PathVariable Long id) {
        iconRepository.deleteById(id);
    }

}
