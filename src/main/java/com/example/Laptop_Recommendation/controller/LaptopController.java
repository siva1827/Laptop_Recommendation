package com.example.Laptop_Recommendation.controller;

import com.example.Laptop_Recommendation.exception.LaptopNotFoundException;
import com.example.Laptop_Recommendation.model.Laptop;
import com.example.Laptop_Recommendation.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping("/laptops/recommend")
    public List<Laptop> recommendLaptops(@RequestParam double budget) throws LaptopNotFoundException {
        return laptopService.recommendLaptops(budget);
    }
}
