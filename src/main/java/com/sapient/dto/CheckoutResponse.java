package com.sapient.dto;

import com.sapient.model.CheckoutModel;

public class CheckoutResponse {

    private String status;
    private String checkoutId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(String checkoutId) {
        this.checkoutId = checkoutId;
    }

    public CheckoutResponse(String status, String checkoutId) {
        this.status = status;
        this.checkoutId = checkoutId;
    }

    public CheckoutResponse(CheckoutModel checkoutModel){
        this.status = "Success";
        this.checkoutId = String.valueOf(checkoutModel.getId());
    }
}
