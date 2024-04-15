package com.example.demo.Service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Repo.AnimalRepo;
import com.example.demo.entity.AnimalEntity;

@Service
public class AnimalServiceImpel implements AnimalService {
    private final AnimalRepo animalRepository;

    public AnimalServiceImpel(AnimalRepo animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public void saveAnimal(AnimalEntity animal, MultipartFile imageFile) {
        try {
            animal.setImage(imageFile.getBytes());
            animalRepository.save(animal);
        } catch (IOException e) {
             e.printStackTrace();
        }
    }
}