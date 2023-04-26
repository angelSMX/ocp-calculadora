package com.jboss.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jboss.spring.model.CalculadoraModel;
import com.jboss.spring.services.OperacionService;

import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class CalculadoraController {

	
	   @Autowired
	    OperacionService operacionService;
	   
	
	
	 @PostMapping("/calculadora")
     public ResponseEntity<?> obtenerResultado(@RequestBody List<CalculadoraModel> datos){
         try {
             return ResponseEntity.status(HttpStatus.OK).body(operacionService.operacion(datos));
         } catch (Exception e) {
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. intente mas tarde.\"}");
         }
     }
	
}
