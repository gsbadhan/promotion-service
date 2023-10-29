package com.example.promoservice.service;

import com.example.promoservice.contoller.DiscountRequest;
import com.example.promoservice.contoller.DiscountResponse;

public interface DisocuntService {
    /**
     * Get discount amount or percentage
     * @param discountRequest
     * @return
     * @throws Exception
     */
    DiscountResponse getDiscount(DiscountRequest discountRequest) throws Exception;
}
