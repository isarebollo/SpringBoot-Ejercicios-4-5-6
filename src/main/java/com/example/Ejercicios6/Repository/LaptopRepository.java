package com.example.Ejercicios6.Repository;

import com.example.Ejercicios6.Entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
