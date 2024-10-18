package com.dev5ops.healthtart.workoutinfo.domain.vo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RequestDeleteWorkoutInfoVO {
    private Long workoutInfoCode;
    private String title;
    private Integer time;
    private String recommendMusic;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long routineCode;
}
