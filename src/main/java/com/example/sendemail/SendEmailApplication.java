package com.example.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEmailApplication {


    @Autowired
    private EmailSenderService senderService;
    public static void main(String[] args) {

        SpringApplication.run(SendEmailApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendEmail(){
        senderService.sendEmail(
                "tatendam@afrosoft.co.zw",
                "wadii",
                "kusey mhofu"
        );
    }

}
