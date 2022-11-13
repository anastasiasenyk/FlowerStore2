package com.store.Store.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/flower")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }

    @DeleteMapping(path = "{flowerID}")
    public void deleteFlower(@PathVariable("flowerID") Integer flowerid){
        flowerService.deleteFlower(flowerid);
    }
}
