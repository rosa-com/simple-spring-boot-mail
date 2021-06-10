package com.example.springemail.repositories;

public interface EmailSender {
    void send(String to, String text, String subject);
}
