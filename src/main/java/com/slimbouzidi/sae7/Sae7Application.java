package com.slimbouzidi.sae7;

import com.slimbouzidi.sae7.entity.Universite;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sae7Application {

    public static void main(String[] args) {
        SpringApplication.run(Sae7Application.class, args);

        Universite u = Universite.builder()
                .nomUniversite("Tunis University")
                .adresse("Tunis")
                .build();


        System.out.println(u);

    }

}
