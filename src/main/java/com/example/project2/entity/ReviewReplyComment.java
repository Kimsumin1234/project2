package com.example.project2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(exclude = { "replyer", "reply" })
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewReplyComment extends BaseEntity {
    @SequenceGenerator(name = "animal_ReviewReplyComment_seq_gen", sequenceName = "animal_ReviewReplyComment_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_ReviewReplyComment_seq_gen")
    @Id
    private Long commentNo;

    @Column
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member replyer;

    @ManyToOne(fetch = FetchType.LAZY)
    private ReviewReply reply;
}
