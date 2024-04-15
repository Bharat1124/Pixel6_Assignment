package com.example.demo.Service;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.AnimalEntity;

public interface AnimalService {
	 void saveAnimal(AnimalEntity animal, MultipartFile imageFile);
}
