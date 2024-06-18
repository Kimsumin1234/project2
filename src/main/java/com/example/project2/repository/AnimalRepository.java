package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.entity.Animal;
import com.example.project2.entity.QAnimal;
import com.example.project2.repository.animal.AnimalAnimalHeartRepository;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

public interface AnimalRepository extends JpaRepository<Animal, Long>, AnimalAnimalHeartRepository {

    public default Predicate makePredicate(String type, String keyword) {
        BooleanBuilder builder = new BooleanBuilder();

        QAnimal adoptApi = QAnimal.animal;
        // id > 0
        builder.and(adoptApi.sId.gt(0L));

        // 검색
        // 검색 타입이 없는 경우
        if (type == null)
            return builder;

        // 검색 타입이 있는 경우

        if (type.equals("oNm")) {
            builder.and(adoptApi.orgNm.contains(keyword));
        } else if (type.equals("oNmc")) {
            builder.and(adoptApi.orgNmc.contains(keyword));
        }

        return builder;
    }

}
