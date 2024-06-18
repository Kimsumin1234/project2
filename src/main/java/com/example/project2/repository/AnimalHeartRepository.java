package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.project2.entity.Animal;
import com.example.project2.entity.AnimalHeart;
import com.example.project2.entity.Member;
import java.util.List;

public interface AnimalHeartRepository extends JpaRepository<AnimalHeart, Long> {

    AnimalHeart findByMemberAndAnimal(Member member, Animal animal);

    List<AnimalHeart> findByAnimal(Animal animal);

    List<AnimalHeart> findByMember(Member member);

    void deleteByAnimal(Animal animal);

    @Query("SELECT COUNT(ah.hid) AS animalheartCount FROM AnimalHeart ah WHERE ah.animal.sId = :sId")
    Long countByAnimalSId(Long sId);

}
