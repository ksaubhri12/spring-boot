package com.sapient.controller;


import com.sapient.Exception.CustomException;
import com.sapient.dto.CheckoutRequestDto;
import com.sapient.dto.CheckoutResponse;
import com.sapient.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {


    @Autowired
    private CheckoutService checkoutService;


    @PostMapping("")
    public CheckoutResponse checkout(@RequestBody CheckoutRequestDto checkoutRequestDto)throws CustomException
    {
        return checkoutService.doCheckout(checkoutRequestDto);
    }

}
