/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.loginservices.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoappdis.loginservices.dao.UserItemDAO;
import com.proyectoappdis.loginservices.models.UserItem;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author stven
 */
@RestController
@RequestMapping("/usuario")
public class UserItemController {
    @Autowired
    private UserItemDAO dao;
    @PostMapping("/regUsuarios")
    public String regUsers(@RequestBody List<UserItem> Usuarios){
        dao.saveAll(Usuarios);
        return "Usuarios Encontrados: "+ Usuarios.size();
    }
        
    @GetMapping("obtUsuarios")
    public List<UserItem> obtUser(){
    return (List<UserItem>) dao.findAll();
    }
    
    //@PostMapping("/updUsuario")
    //@RequestMapping("/{ID}")
   // public String updUsers(@PathVariable("ID") int Id){
   //     UserItem user = dao.obtener(Id);
   //     dao.actualizar(user);
   //     return "Usuario Actualizado: ";
   // }
    
    
}
