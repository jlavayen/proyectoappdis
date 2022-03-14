/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.loginservices.resources;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author stven
 */
public class DbConfig {
    @Bean
      public DataSource dataSource(){
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
         dataSource.setDriverClassName("com.mysql.jdbc.Driver");
         dataSource.setUrl("jdbc:mysql://appdismysql.mysql.database.azure.com/WebApDis");
         dataSource.setUsername( "jlavayen@appdismysql" );
         dataSource.setPassword( "Passw0rd.1" );
         return dataSource;
      }
}
