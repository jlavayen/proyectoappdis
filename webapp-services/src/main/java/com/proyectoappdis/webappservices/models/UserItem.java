/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.webappservices.models;

/**
 *
 * @author jlavayen
 */
public class UserItem {
    private String Nombre;
    private int ID;
    private String Contra;
    
    public UserItem(){
    
    }

    public UserItem(String Nombre, int ID, String Contra) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Contra = Contra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }
    
}
