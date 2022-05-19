package com.pgosik.testapp;

import com.pgosik.testapp.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAppApplication.class, args);
    }
    @Bean
    public CommandLineRunner runner(StudentService studentService){
        return args -> {
            studentService.
        }
    }
}
