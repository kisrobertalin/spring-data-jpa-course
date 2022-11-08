package com.example.demo;

import com.example.demo.entity.Profesor;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
   @Bean
   CommandLineRunner commandLineRunner(StudentRepository studentRepository, ProfesorRepository profesorRepository){
    return args -> {

         Profesor Ionel = new Profesor("Ionel", "Pop" , "Matematica ", "20") ;
         profesorRepository.save(Ionel);

        Student maria = new Student("Maria", "Jones", "maria@mail.com", 21 );
        Student johnu = new Student ("Jhonutu", "Dorian", "hatzjohn@gmail.com", 22);
       List<Student> studentSet = Arrays.asList(maria,johnu);

        studentRepository.saveAll(studentSet);
        maria.setProfesor(Ionel);
        johnu.setProfesor(Ionel);
        studentRepository.saveAll(studentSet);


     };

    }

}
