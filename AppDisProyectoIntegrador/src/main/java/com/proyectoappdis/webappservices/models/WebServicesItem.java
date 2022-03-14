/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.webappservices.models;

/**
 *
 * @author jlavayen
 */
public class WebServicesItem {
    private int AppointmentID;
    private int UserID;
    private String AppDescription;
    private String AppDate;

    public WebServicesItem(int AppointmentID, int UserID, String AppDescription, String AppDate) {
        this.AppointmentID = AppointmentID;
        this.UserID = UserID;
        this.AppDescription = AppDescription;
        this.AppDate = AppDate;
    }

    public int getAppointmentID() {
        return AppointmentID;
    }

    public void setAppointmentID(int AppointmentID) {
        this.AppointmentID = AppointmentID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getAppDescription() {
        return AppDescription;
    }

    public void setAppDescription(String AppDescription) {
        this.AppDescription = AppDescription;
    }

    public String getAppDate() {
        return AppDate;
    }

    public void setAppDate(String AppDate) {
        this.AppDate = AppDate;
    }

    
}
