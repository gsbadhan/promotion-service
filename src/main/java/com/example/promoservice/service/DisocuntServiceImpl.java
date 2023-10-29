package com.example.promoservice.service;

import com.example.promoservice.contoller.DiscountRequest;
import com.example.promoservice.contoller.DiscountResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisocuntServiceImpl implements DisocuntService {
    @Autowired
    private KieContainer kieContainer;
    @Override
    public DiscountResponse getDiscount(DiscountRequest discountRequest) throws Exception {
        DiscountResponse response=new DiscountResponse();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("discountObj", response);
        kieSession.insert(discountRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return response;
    }
}
