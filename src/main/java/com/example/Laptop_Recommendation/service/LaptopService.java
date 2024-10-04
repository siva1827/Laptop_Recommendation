package com.example.Laptop_Recommendation.service;

import com.example.Laptop_Recommendation.exception.LaptopNotFoundException;
import com.example.Laptop_Recommendation.model.Laptop;
import com.example.Laptop_Recommendation.repo.LaptopRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private JPAStreamer jpaStreamer;
    private LaptopRepository repo;

    public List<Laptop> recommendLaptops(double budget) throws LaptopNotFoundException {
        List<Laptop> laptops= jpaStreamer.stream(Laptop.class)
            .filter(laptop -> laptop.getPrice() <= budget)
            .toList();

        if(laptops.isEmpty()){
            throw new LaptopNotFoundException("No Laptops Founds Under the Specified Budget: "+budget);
        }

        return laptops;
    }
}
