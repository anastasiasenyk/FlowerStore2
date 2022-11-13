package com.store.Store.flower;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlowerRepository
        extends JpaRepository<Flower, Integer> {

//    @Query("Select f FROM Flower f WHERE f.id=?")
    Optional<Flower> findFlowerById(Integer id);
}
