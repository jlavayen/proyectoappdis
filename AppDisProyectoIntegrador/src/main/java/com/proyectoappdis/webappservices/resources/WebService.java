/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.webappservices.resources;


import com.proyectoappdis.webappservices.models.UserItem;
import com.proyectoappdis.webappservices.models.WebServicesItem;
import java.io.Serializable;
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
@RequestMapping("/User")
public class WebService implements Serializable{
    @RequestMapping("/{mail}")
    public UserItem Login(@PathVariable("mail") String mail){
    RestTemplate restTemplate = new RestTemplate();
       
        UserItem finaluser = new UserItem();
        List <UserItem> AllUsers;
        AllUsers = (List<UserItem>) restTemplate.getForObject("http://localhost:8081/usuario/obtUsuarios", UserItem.class);
        for(UserItem tempusr : AllUsers)
        {
          String uid= tempusr.getEmail();
          if(uid.equals(mail)){
         }
            finaluser = tempusr; 
         }
    
        return finaluser;
    }


}
