/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoappdis.loginservices.resources;
import com.proyectoappdis.loginservices.models.UserItem;
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
    
    //@Autowired
    //private RestTemplate restTemplate;
    
    @RequestMapping("/{ID}")
    public UserItem getUserItem(@PathVariable("ID") String ID){
        
      //  crud r = new crud(ID);
   //     try {
    //        r.run();
    //    } catch (Exception ex) {
     //       Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
     //   }
        return null;
    }
    
    
}
