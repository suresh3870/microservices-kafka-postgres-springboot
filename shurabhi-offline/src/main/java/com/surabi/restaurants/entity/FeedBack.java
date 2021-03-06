package com.surabi.restaurants.entity;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class FeedBack {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(example = "1", hidden = true)
    private int feedBackId;

    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(example = "17-Dec-2021")
    public Date feedBackDate;

    @ApiModelProperty(example = "1")
    private int ordersID;
    @ApiModelProperty(example = "5")
    private int feedback1to5;
    @ApiModelProperty(example = "Excellent service!")
    private String feedback;

    public int getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(int feedBackId) {
        this.feedBackId = feedBackId;
    }

    public Date getFeedBackDate() {
        return feedBackDate;
    }

    public void setFeedBackDate(Date feedBackDate) {
        this.feedBackDate = feedBackDate;
    }

    public int getOrdersID() {
        return ordersID;
    }

    public void setOrdersID(int ordersID) {
        this.ordersID = ordersID;
    }

    public int getFeedback1to5() {
        return feedback1to5;
    }

    public void setFeedback1to5(int feedback1to5) {
        this.feedback1to5 = feedback1to5;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public FeedBack(int feedBackId, Date feedBackDate, int ordersID, int feedback1to5, String feedback) {
        this.feedBackId = feedBackId;
        this.feedBackDate = feedBackDate;
        this.ordersID = ordersID;
        this.feedback1to5 = feedback1to5;
        this.feedback = feedback;
    }

    public FeedBack() {
    }
}
