package com.example.Ejercicios6.Controller;

import com.example.Ejercicios6.Entities.Laptop;
import com.example.Ejercicios6.Repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptop")
    public List<Laptop>findAll() {
        return laptopRepository.findAll();
    }


    @GetMapping("/api/laptop/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {

        Optional<Laptop> laptopOpt = laptopRepository.findById(id); // 3456546456435
        // opcion 1
        if (laptopOpt.isPresent())
            return ResponseEntity.ok(laptopOpt.get());
        else
            return ResponseEntity.notFound().build();

    }


        @PostMapping("/api/laptop")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));
        return laptopRepository.save(laptop);
    }
}

