package com.jillukowicz.spring.boot.flyway;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;


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
//        Flyway flyway = new Flyway();
//        MigrationInfoService info = flyway.info();
//        Arrays.asList(info.all()).stream().forEach(item -> System.out.println(item.getScript()));
    }
}
