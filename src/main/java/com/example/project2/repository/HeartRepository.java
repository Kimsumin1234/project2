package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.entity.Heart;
import com.example.project2.entity.Review;
import com.example.project2.entity.Member;
import java.util.List;

public interface HeartRepository extends JpaRepository<Heart, Long> {

    Heart findByMemberAndReview(Member member, Review review);

    List<Heart> findByReview(Review review);

    List<Heart> findByMember(Member member);

    void deleteByReview(Review review);

}
