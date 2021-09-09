package org.example.api.controller;

import org.example.api.domain.Tutorial;
import org.example.api.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {

    @Autowired
    private TutorialRepository tutorialRepository;

    @GetMapping("")
    public List<Tutorial> getAllTutorials(@RequestParam(required = false) String title) {
        List<Tutorial> tutorials = new ArrayList<>();

        if (!StringUtils.isEmpty(title)) {
            tutorials = tutorialRepository.findByTitleContaining(title);
        } else {
            tutorials = tutorialRepository.findAll();
        }

        return tutorials;
    }

    @GetMapping("/{id}")
    public Tutorial getTutorialById(@PathVariable("id") long id) {
        Optional<Tutorial> tutorial = tutorialRepository.findById(id);

        if (tutorial.isPresent()) {
            return tutorial.get();
        } else {
            return null;
        }
    }

    @PostMapping("")
    public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
        Tutorial result = tutorialRepository.save(tutorial);

        return result;
    }

    @GetMapping("/published")
    public List<Tutorial> findByPublished() {
        List<Tutorial> tutorials = tutorialRepository.findByPublished(true);

        return tutorials;
    }

}
