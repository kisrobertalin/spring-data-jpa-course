package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        @Bean
        StudentRepository studentRepository;
        commandLineRunner(studentRepository);
    }
   
   static void commandLineRunner(StudentRepository repository){

            Student maria = new Student("Maria", "Jones", "maria@mail.com", 21) ;
            repository.save(new Student());


    }

}
