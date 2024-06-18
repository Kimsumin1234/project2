package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.project2.entity.AnimalItem;

public interface AnimalItemRepository extends JpaRepository<AnimalItem, Long> {

    @Query("select a from AnimalItem a where a.animalCart.cartId = :cartId and a.animal.sId = :sId")
    AnimalItem findByAnimalCartIdAndItemId(Long cartId, Long sId);

}
