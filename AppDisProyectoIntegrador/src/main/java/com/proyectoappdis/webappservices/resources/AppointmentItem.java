/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.webappservices.resources;


import com.proyectoappdis.webappservices.models.Appointment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jlavayen
 */
@RestController
@RequestMapping("/Cita")
public class AppointmentItem {
    @RequestMapping("/{UserID}")
    public Appointment getAppointmentInfo(@PathVariable("UserID") String UserID){
    
        return new Appointment(1,1,"Listo para la cita","12/12/2021 23:12");
    
    }


}
