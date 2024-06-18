package com.example.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.project2.entity.Review;
import com.example.project2.entity.ReviewImage;
import com.example.project2.repository.search.ReviewMemberReviewReplyReviewReplyCommentHeartRepository;

public interface ReviewImageRepository
        extends JpaRepository<ReviewImage, Long>, ReviewMemberReviewReplyReviewReplyCommentHeartRepository {

    @Modifying
    @Query("delete from ReviewImage ri where ri.review = :review")
    void deleteByReview(Review review);

}
