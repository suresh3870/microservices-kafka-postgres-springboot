package com.surabi.restaurants.DTO;

import java.util.List;


public class BillOrderDetailsDTO {
    private int BILL_ID;
    private String USERNAME;
    private double BILL_AMOUNT;

    public String getPAYMENT_MODE() {
        return PAYMENT_MODE;
    }

    public void setPAYMENT_MODE(String PAYMENT_MODE) {
        this.PAYMENT_MODE = PAYMENT_MODE;
    }

    private String PAYMENT_MODE;
    private List<BillDetailDTO> billDetailDTO;

    public int getBILL_ID() {
        return BILL_ID;
    }

    public void setBILL_ID(int BILL_ID) {
        this.BILL_ID = BILL_ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public double getBILL_AMOUNT() {
        return BILL_AMOUNT;
    }

    public void setBILL_AMOUNT(double BILL_AMOUNT) {
        this.BILL_AMOUNT = BILL_AMOUNT;
    }

    public List<BillDetailDTO> getBillDetailDTO() {
        return billDetailDTO;
    }

    public void setBillDetailDTO(List<BillDetailDTO> billDetailDTO) {
        this.billDetailDTO = billDetailDTO;
    }

    public BillOrderDetailsDTO(int BILL_ID, String USERNAME, double BILL_AMOUNT, String PAYMENT_MODE, List<BillDetailDTO> billDetailDTO) {
        this.BILL_ID = BILL_ID;
        this.USERNAME = USERNAME;
        this.BILL_AMOUNT = BILL_AMOUNT;
        this.PAYMENT_MODE = PAYMENT_MODE;
        this.billDetailDTO = billDetailDTO;
    }

    public BillOrderDetailsDTO() {
    }

    public BillOrderDetailsDTO(String USERNAME) {
        this.USERNAME = USERNAME;
    }
}