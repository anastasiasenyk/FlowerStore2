package com.store.Store.flower;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FlowerConfig {

    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository repository){
        return args -> {
            Flower flower1 = new Flower(
                    "orange",
                    100,
                    13

            );
            Flower flower2 = new Flower(
                    "purple",
                    200,
                    8

            );

            repository.saveAll(
                    List.of(flower1, flower2)
            );
        };
    }
}
