package com.example.Ejercicios6;

import com.example.Ejercicios6.Entities.Laptop;
import com.example.Ejercicios6.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicios456Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Ejercicios456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);


		Laptop laptop1 =new Laptop(null,"Acer123",578.95,9.4,"black",true);
		Laptop laptop2 =new Laptop(null,"McBook Pro",1998.95,5.2,"grey",true);
		Laptop laptop3 =new Laptop(null,"HP 788",254.95,7.3,"white",false);


		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);


		//System.out.println("num laptop en base de datos: "+ repository.findAll().size());


	}

}
