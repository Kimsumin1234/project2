package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.project2.entity.AnimalCart;

public interface AnimalCartRepository extends JpaRepository<AnimalCart, Long> {

    @Query("select a from AnimalCart a where a.member.mid = :mid")
    AnimalCart findByMember(Long mid);

}
