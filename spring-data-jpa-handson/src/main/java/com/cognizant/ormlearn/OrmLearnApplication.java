package com.cognizant.ormlearn;

import com.cognizant.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    CountryService service;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class,args);
    }

    @Override
    public void run(String... args) {

        service.getAllCountries().forEach(country ->
                System.out.println(country.getCode()+" "+country.getName()));

    }
}