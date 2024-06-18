package com.example.project2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.project2.entity.Review;
import com.example.project2.entity.ReviewReply;
import com.example.project2.repository.search.ReviewMemberReviewReplyReviewReplyCommentHeartRepository;

public interface ReviewRepository
        extends JpaRepository<Review, Long>, ReviewMemberReviewReplyReviewReplyCommentHeartRepository {

    // @Query("select r from ReviewReply r join fetch r.replyComment c where
    // r.review.rno=:rno order by c.commentNo")

    @Query("select r from ReviewReply r where r.review.rno=:rno Order By r.replyNo")
    List<ReviewReply> getReviewReplies(Long rno);

    @Query(value = "SELECT r1_0.rno, r1_0.created_date, r1_0.last_modified_date, r1_0.text, r1_0.title, r1_0.view_count, r1_0.writer_mid FROM review r1_0 LEFT JOIN heart h1_0 ON r1_0.rno = h1_0.review_rno WHERE h1_0.hno =?1", nativeQuery = true)
    Review findByHeart(Long hno);

}
