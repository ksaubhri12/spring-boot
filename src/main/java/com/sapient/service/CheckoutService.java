package com.sapient.service;

import com.sapient.Exception.CustomException;
import com.sapient.dto.CheckoutRequestDto;
import com.sapient.dto.CheckoutResponse;
import com.sapient.model.CheckoutModel;
import com.sapient.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    @Autowired
    private UserService userService;

    @Autowired
    private CheckoutRepository checkoutRepository;

    public CheckoutResponse doCheckout(CheckoutRequestDto checkoutRequestDto) throws CustomException {
        checkoutRequestDto.validate();
        String userId = userService.getUserId();
        CheckoutModel checkoutModel = new CheckoutModel(checkoutRequestDto, userId);
        try {
            checkoutRepository.save(checkoutModel);
        } catch (Exception e) {
            throw new CustomException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", e.getMessage());
        }
        return new CheckoutResponse(checkoutModel);
    }

}
