package com.sapient.dto;

import com.sapient.Exception.CustomException;

public class CheckoutRequestDto {


    private String contentId;
    private String branchId;


    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public CheckoutRequestDto(String contentId, String branchId) {
        this.contentId = contentId;
        this.branchId = branchId;
    }

    public void validate() throws CustomException{

    }
}
