package com.example.demo.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    @NonNull        // null 값이 들어가면 안돼
    private int num1;
    @NonNull
    private int num2;
    private int sum;
}
