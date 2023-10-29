package com.example.promoservice.contoller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountRequest {
    private Bank bankName;
    private CardType cardType;
}
