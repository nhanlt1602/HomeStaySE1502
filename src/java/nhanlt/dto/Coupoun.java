/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanlt.dto;

/**
 *
 * @author DELL
 */
public class Coupoun {
    private String coupounID;
    private String couponName;
    private float discounRate;
    private String beginDate;
    private String endDate;

    public Coupoun() {
    }

    public Coupoun(String coupounID, String couponName, float discounRate, String beginDate, String endDate) {
        this.coupounID = coupounID;
        this.couponName = couponName;
        this.discounRate = discounRate;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getCoupounID() {
        return coupounID;
    }

    public void setCoupounID(String coupounID) {
        this.coupounID = coupounID;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public float getDiscounRate() {
        return discounRate;
    }

    public void setDiscounRate(float discounRate) {
        this.discounRate = discounRate;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    
}
