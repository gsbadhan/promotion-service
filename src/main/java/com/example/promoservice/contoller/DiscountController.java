package com.example.promoservice.contoller;

import com.example.promoservice.service.DisocuntService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discount-svc/v1/discounts")
@Slf4j
@CrossOrigin
public class DiscountController {
    @Autowired
    private DisocuntService disocuntService;

    @Operation(summary = "get discount by card")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
            @ApiResponse(responseCode = "500", description = "Error occurred while processing")
    })
    @GetMapping(value = "/cards", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<DiscountResponse> getCardDiscount(@RequestParam("bank-name") String bankName,
                                                            @RequestParam("card-type") String cardType) throws Exception {
        log.info("get discount request bankName={}, cardType={}", bankName, cardType);
        DiscountResponse response = disocuntService.getDiscount(new DiscountRequest(Bank.valueOf(bankName.toUpperCase()),
                CardType.valueOf(cardType.toUpperCase())));
        return ResponseEntity.ok(response);
    }
}
