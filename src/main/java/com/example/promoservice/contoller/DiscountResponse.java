package com.example.promoservice.contoller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiscountResponse {
    private Float amount;
    private Float percentage;
}
