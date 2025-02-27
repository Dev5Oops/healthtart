package com.dev5ops.healthtart.workout_per_routine.domain.vo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RequestDeleteWorkoutPerRoutineVO {
    private Long workoutPerRoutineCode;
    private String workoutName;
    private String link;
    private int workoutOrder;
    private int weightSet;
    private int numberPerSet;
    private int weightPerSet;
    private int workoutTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
