package com.example.springemail;

import com.example.springemail.repositories.EmailSender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEmailApplication implements CommandLineRunner
{
    private final EmailSender emailSender;
    public SpringEmailApplication(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailApplication.class, args);
    }

    @Override
    public void run(String... args){

        System.out.println("Sending Email...");

        emailSender.send("to.email@gmail.com", "Hello Text", "Hello Subject");

        System.out.println("Done");

    }


}
