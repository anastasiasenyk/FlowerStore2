package com.store.Store.flower;

import com.store.Store.flower.properties.FlowerColor;
import com.store.Store.flower.properties.FlowerType;
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
                    FlowerType.ROSE,
                    FlowerColor.RED,
                    100,
                    13

            );
            Flower flower2 = new Flower(
                    FlowerType.CHAMOMILE,
                    FlowerColor.BLUE,
                    200,
                    8

            );

            repository.saveAll(
                    List.of(flower1, flower2)
            );
        };
    }
}
