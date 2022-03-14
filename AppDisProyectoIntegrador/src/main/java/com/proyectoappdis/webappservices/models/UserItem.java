/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.proyectoappdis.webappservices.models;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author stven
 */
@Named(value = "userBean")
@RequestScoped

public class UserItem {
private int IDUSUARIO;
    private String NOMBRECLIENTE;
    private String DIRECCIONENVIO;
    private String Telefono;
    private String Email;
    private String CONTRASENA;
    private String Tipo;
    private String Estado;
    /**
     * Creates a new instance of UserBean
     */
    public UserItem() {
    }

    public UserItem(int IDUSUARIO, String NOMBRECLIENTE, String DIRECCIONENVIO, String Telefono, String Email, String CONTRASENA, String Tipo, String Estado) {
        this.IDUSUARIO = IDUSUARIO;
        this.NOMBRECLIENTE = NOMBRECLIENTE;
        this.DIRECCIONENVIO = DIRECCIONENVIO;
        this.Telefono = Telefono;
        this.Email = Email;
        this.CONTRASENA = CONTRASENA;
        this.Tipo = Tipo;
        this.Estado = Estado;
    }

    public int getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(int IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }

    public String getNOMBRECLIENTE() {
        return NOMBRECLIENTE;
    }

    public void setNOMBRECLIENTE(String NOMBRECLIENTE) {
        this.NOMBRECLIENTE = NOMBRECLIENTE;
    }

    public String getDIRECCIONENVIO() {
        return DIRECCIONENVIO;
    }

    public void setDIRECCIONENVIO(String DIRECCIONENVIO) {
        this.DIRECCIONENVIO = DIRECCIONENVIO;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCONTRASENA() {
        return CONTRASENA;
    }

    public void setCONTRASENA(String CONTRASENA) {
        this.CONTRASENA = CONTRASENA;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
