/*
package edu.coursework.zoo.controller.rest;

*/
/*
    @author:    Inessa
    @project:    Zoo 
    @class:    AdministrationRestController 
    @version:    1.0.0 
    @since:    14.04.2021     
*//*


*/
/*http://localhost:8080/api/administration/get/all*//*

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.service.administration.impls.AdministrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/administration")
public class AdministrationRestController {

    @Autowired
    AdministrationServiceImpl service;

    @GetMapping("/get/all")
    public List<Administration> getAdministrations(){
        return service.getAll() ;
    }

}
*/
