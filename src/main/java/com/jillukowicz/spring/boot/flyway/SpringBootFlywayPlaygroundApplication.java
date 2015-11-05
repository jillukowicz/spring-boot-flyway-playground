package com.jillukowicz.spring.boot.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFlywayPlaygroundApplication implements CommandLineRunner
{

    @Autowired
    private PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFlywayPlaygroundApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception
    {
        System.err.println(this.repository.findAll());
    }
}
