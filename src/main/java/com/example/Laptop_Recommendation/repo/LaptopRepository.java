package com.example.Laptop_Recommendation.repo;

import com.example.Laptop_Recommendation.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
