package com.example.project2.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewDto {

    private Long rno;

    @Size(max = 20, message = "제목은 20자 이내로 가능합니다.")
    @NotBlank(message = "제목을 입력해주세요.")
    private String title;

    @Size(max = 500, message = "내용은 500자 이내로 가능합니다.")
    @NotBlank(message = "내용을 입력해주세요.")
    private String text;

    private Long replyCount;

    private Long viewCount;

    private Long heartCount;

    // member
    private Long mid;
    private String email;
    private String nickname;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;

    // 리뷰 이미지 리스트
    @Builder.Default // Builder 를 쓰면
    private List<ReviewImageDto> reviewImageDtos = new ArrayList<>();
}
