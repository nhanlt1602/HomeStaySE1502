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
public class User {
    private String username;
    private String password;
    private String fullname;
    private String phone;
    private String roleID;
    private boolean active;

    public User() {
    }

    public User(String username, String password, String fullname, String phone, String roleID, boolean active) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
        this.roleID = roleID;
        this.active = active;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
