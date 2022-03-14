/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.webappservices.resources;


import com.proyectoappdis.webappservices.models.Appointment;
import com.proyectoappdis.webappservices.models.UserItem;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author jlavayen
 */
@RestController
@RequestMapping("/Cita")
public class AppointmentItem {
    
    
    
    @RequestMapping("/{UserID}")  
    public List<UserItem> getUser(@PathVariable("UserID")String UserID){
       RestTemplate restTemplate = new RestTemplate();
       //Appointment citausuario = restTemplate.getForObject("http://localhost:8082/Cita/1", Appointment.class);
        
        List <Appointment> AllApp;
        AllApp = Arrays.asList(
                new Appointment(1,1,"12345","17/02/2023 12:12")
        );
        
        
        return AllApp.stream().map(appointment -> {
                UserItem usuario = restTemplate.getForObject("http://localhost:8081/Usuario/"+appointment.getUserID(), UserItem.class);
                return new UserItem(usuario.getNombre(),usuario.getID(),usuario.getContra());
                        
        })
                .collect(Collectors.toList());
        
//        return Collections.singletonList(
//                new UserItem("Julian",1,"12345")
//        );
    }


}
