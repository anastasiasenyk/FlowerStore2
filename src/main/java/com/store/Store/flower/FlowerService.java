package com.store.Store.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlowerService {

    public static FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public static List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        Optional<Flower> flowerOptional = flowerRepository.findFlowerById(flower.getId());
        if (flowerOptional.isPresent()){
            throw new IllegalStateException("flower with this Id present");
        }
        flowerRepository.save(flower);
    }

    public void deleteFlower(Integer flowerid) {
        if (!flowerRepository.existsById(flowerid)){
            throw new IllegalStateException("flower with this" + flowerid + " does not exists");
        }
        flowerRepository.deleteById(flowerid);
    }
}
