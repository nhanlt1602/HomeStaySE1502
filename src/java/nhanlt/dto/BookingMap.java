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
public class BookingMap {
    private String mapID;
    private String bookingID;
    private String roomNo;

    public BookingMap(String mapID, String bookingID, String roomNo) {
        this.mapID = mapID;
        this.bookingID = bookingID;
        this.roomNo = roomNo;
    }

    public BookingMap() {
    }

    public String getMapID() {
        return mapID;
    }

    public void setMapID(String mapID) {
        this.mapID = mapID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
    
    
}
