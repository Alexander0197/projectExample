package com.example.demo;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        CityRepository repository = context.getBean(CityRepository.class);

        //crud
        //create
//        repository.save(new City("Minsk"));
//        repository.save(new City("Piter"));
//        repository.save(new City("Moscow"));
//        repository.save(new City("LA"));
//        List<City> cities = repository.findAll();
//        System.out.println(cities);
//        repository.save( new City(4, "Los Angeles"));
//      repository.deleteById(6);
//      repository.deleteById(5);
//       repository.save(new City(4, "Los Angeles"));
//        repository.delete(new City(4));
    }

}
