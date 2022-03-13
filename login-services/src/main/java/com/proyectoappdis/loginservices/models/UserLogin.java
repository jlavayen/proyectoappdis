/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.loginservices.models;
import com.proyectoappdis.loginservices.resources.UserItem;
import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jlavayen
 */

@RestController
@RequestMapping("/Usuario")
public class UserLogin {
    @RequestMapping("/{ID}")
    public List<UserItem> getUser(@PathVariable("ID")String ID){
        return Collections.singletonList(
                new UserItem("Julian",1,"12345")
        );
    }
}
