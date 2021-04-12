/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanlt.dto;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Booking {
    private String bookID;
    private String people;
    private String userID;
    private float coupoun;
    private Date createAt;
    private String checkIn;
    private String checkOut;

    public Booking() {
    }

    public Booking(String bookID, String people, String userID, float coupoun, Date createAt, String checkIn, String checkOut) {
        this.bookID = bookID;
        this.people = people;
        this.userID = userID;
        this.coupoun = coupoun;
        this.createAt = createAt;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public float getCoupoun() {
        return coupoun;
    }

    public void setCoupoun(float coupoun) {
        this.coupoun = coupoun;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    

    
}
