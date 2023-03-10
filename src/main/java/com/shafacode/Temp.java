package com.shafacode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Temp {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(@RequestParam(value = "name", required = false) String name) {
        String greetMessage = name == null ? "Hello" : "Hello " + name;
        GreetResponse response = new GreetResponse(
                greetMessage,
                List.of("Java", "Golang", "Javascript"),
                new Person("Alex", 28, 30_000)
        );
        return response;
    }

    record GreetResponse(String greet,
                         List<String> favProgrammingLanuages,
                         Person person) {}

    record  Person(String name, int age, double savings){}
}
