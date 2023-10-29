package com.example.promoservice.contoller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiscountRequest {
    private Bank bankName;
    private CardType cardType;
}
