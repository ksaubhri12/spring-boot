package com.sapient.model;

import com.sapient.dto.CheckoutRequestDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckoutModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String contentId ;

    private String branchId;

    private String userId ;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public CheckoutModel(){}


    public CheckoutModel(String contentId, String branchId,String userId) {
        this.branchId = branchId;
        this.contentId = contentId;
        this.userId = userId;
    }

    public CheckoutModel(CheckoutRequestDto checkoutRequestDto,String userId){
        this.branchId = checkoutRequestDto.getBranchId();
        this.contentId = checkoutRequestDto.getContentId();
        this.userId = userId;
    }

}
