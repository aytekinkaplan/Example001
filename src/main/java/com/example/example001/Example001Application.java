package com.example.example001;

import com.example.example001.People.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Example001Application {

    public static void main(String[] args) {
        SpringApplication.run(Example001Application.class, args);
    }

    @GetMapping
    public List<People> people(){
        return List.of(new People(1L, "Aytekin Kaplan",2000,"ay@gmail.com","VAN"));
    }

}
