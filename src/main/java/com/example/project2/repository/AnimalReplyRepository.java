package com.example.project2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.entity.Animal;
import com.example.project2.entity.AnimalReply;

public interface AnimalReplyRepository extends JpaRepository<AnimalReply, Long> {

    @EntityGraph(attributePaths = { "member" }, type = EntityGraphType.FETCH)
    List<AnimalReply> findByAnimal(Animal animal);
}
