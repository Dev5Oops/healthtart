package com.dev5ops.healthtart.user.domain.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseInsertUserDTO {

    private String userCode;
    private String userType;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhone;
    private String userNickname;
    private String userAddress;
    private Boolean userFlag;
    private String userGender;
    private Double userHeight;
    private Double userWeight;
    private Integer userAge;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
