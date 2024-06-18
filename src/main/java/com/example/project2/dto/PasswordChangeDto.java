package com.example.project2.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PasswordChangeDto {
    private String email;

    @NotEmpty(message = "현재 비밀번호를 입력해주세요.")
    private String currentPassword;

    // @Pattern(regexp = "(?=^[A-Za-z])(?=.+\\d)(?=.+[!@$%])[A-Za-z\\d!@$%]{8,15}$",
    // message = "비밀번호는 영대소문자,숫자,특수문자(!@$%)를 사용해서 8~15자리입니다")
    @NotEmpty(message = "변경할 비밀번호를 입력해주세요.")
    private String newPassword;

    private String checkNewPassword;
}
