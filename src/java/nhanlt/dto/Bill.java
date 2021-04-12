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
public class Bill {
    private String billID;
    private String bookingID;
    private String bbq;
    private String breakfast;
    private String completeDate;
    private String checkoutBy;
    private String total;
    private String fullname;
    private boolean status;

    public Bill() {
    }

    public Bill(String billID, String bookingID, String bbq, String breakfast, String completeDate, String checkoutBy, String total, String fullname, boolean status) {
        this.billID = billID;
        this.bookingID = bookingID;
        this.bbq = bbq;
        this.breakfast = breakfast;
        this.completeDate = completeDate;
        this.checkoutBy = checkoutBy;
        this.total = total;
        this.fullname = fullname;
        this.status = status;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getBbq() {
        return bbq;
    }

    public void setBbq(String bbq) {
        this.bbq = bbq;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate;
    }

    public String getCheckoutBy() {
        return checkoutBy;
    }

    public void setCheckoutBy(String checkoutBy) {
        this.checkoutBy = checkoutBy;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
