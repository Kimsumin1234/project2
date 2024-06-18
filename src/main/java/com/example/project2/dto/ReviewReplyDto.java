package com.example.project2.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ReviewReplyDto {
    private Long replyNo;

    private String text;

    // member
    private Long mid;
    private String email;
    private String nickname;

    // Review
    private Long rno;

    // Comment
    @Builder.Default
    private List<ReviewReplyCommentDto> comments = new ArrayList<>();

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;
}
