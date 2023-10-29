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
@RequestMapping("/discount-svc/v1/discount")
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
    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<DiscountResponse> getDiscountByCard(@RequestBody DiscountRequest discountRequest) throws Exception {
        log.info("get discount request id={}", discountRequest);
        DiscountResponse response = disocuntService.getDiscount(discountRequest);
        return ResponseEntity.ok(response);
    }
}
