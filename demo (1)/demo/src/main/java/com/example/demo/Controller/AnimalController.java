package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Service.AnimalService;
import com.example.demo.entity.AnimalEntity;

@Controller
@RequestMapping("/")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animal")
    public String showAnimalForm(Model model) {
        model.addAttribute("animal", new AnimalEntity());
        return "animalForm";
    }

    @PostMapping("/animal")
    public String submitAnimalForm(@ModelAttribute AnimalEntity animal, @RequestParam("image") MultipartFile imageFile, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", "There are errors in the form");
            return "animalForm";
        }

        animalService.saveAnimal(animal, imageFile);
        model.addAttribute("success", "Animal information submitted successfully");
        return "animalForm";
    }
}

