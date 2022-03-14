/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoappdis.loginservices.dao;

import org.springframework.data.repository.CrudRepository;
import com.proyectoappdis.loginservices.models.UserItem;
import java.util.Optional;

/**
 *
 * @author stven
 */
public interface UserItemDAO extends CrudRepository<UserItem, Integer>{

    //public UserItem obtener(int Id);
    //public void actualizar(UserItem user);
}
