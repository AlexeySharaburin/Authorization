package ru.netology.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationApplication {

    public static void main(String[] args) {
        System.out.println("Hallo, it works!");
        SpringApplication.run(AuthorizationApplication.class, args);
    }
}
