package mapYourPlacesBack.controller;

import mapYourPlacesBack.entity.Tag;
import mapYourPlacesBack.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tags")
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    @GetMapping(value = "/all", produces = "application/json") // localhost:8080/api/tag/all
    public ResponseEntity<List<Tag>> getAllTags() {
        return new ResponseEntity<>(tagRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json") // localhost:8080/api/tag/1
    public ResponseEntity<Tag> getTagById(@PathVariable Long id) {
        return new ResponseEntity<>(tagRepository.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(value = "/create", produces = "application/json") // localhost:8080/api/tag/create
    public ResponseEntity<Tag> createTag(@RequestBody Tag tag) {
        return new ResponseEntity<>(tagRepository.save(tag), HttpStatus.OK);
    }

    @PutMapping(value = "/update", produces = "application/json") // localhost:8080/api/tag/update
    public ResponseEntity<Tag> updateTag(@RequestBody Tag tag) {
        return new ResponseEntity<>(tagRepository.save(tag), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}") // localhost:8080/api/tag/delete/1
    public void deleteTag(@PathVariable Long id) {
        tagRepository.deleteById(id);
    }


}
