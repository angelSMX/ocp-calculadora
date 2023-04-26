package com.jboss.spring.model;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalculadoraModel implements Serializable {


	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
		private float valor1;
	    private float valor2;
	    private String operacion;  

}
