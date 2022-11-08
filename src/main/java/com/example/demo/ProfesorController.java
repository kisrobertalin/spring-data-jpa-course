package com.example.demo;

import com.example.demo.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class ProfesorController {
    @Autowired
    ProfesorRepository profesorRepository;

    @GetMapping ("/Profesor")
    public String helloWorld(){
        return "Hello world";
    }

   @RequestMapping( value = "/Profesor/list", method = RequestMethod.GET)
   @ResponseBody
    public List<Profesor> getProfesor(){
        return profesorRepository.findAll();
    }

}
