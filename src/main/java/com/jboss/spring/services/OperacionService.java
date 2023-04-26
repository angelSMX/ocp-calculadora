package com.jboss.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jboss.spring.model.CalculadoraModel;





@Service
public class OperacionService implements BaseOperacionService<CalculadoraModel> {

	@Override
	public String operacion(List<CalculadoraModel> calcular) throws Exception {
		 String result=null;

	        for(int i=0; i < calcular.size(); i++){
	            float dato1= calcular.get(i).getValor1();
	            float dato2= calcular.get(i).getValor2();
	            String operacion = calcular.get(i).getOperacion();
	            
	             if(operacion.equals("SUMA")){
	                float opera=dato1+dato2;
	                result = "El resultado de la suma es:"+ opera ;

	             }
	             if(operacion.equals("RESTA")){
	                float opera=dato1-dato2;
	                result = "El resultado de la resta es:"+ opera;

	             }
	             if(operacion.equals("MULTIPLICACION")){
	                float opera=dato1*dato2;
	                result = "El resultado de la suma es:"+ opera;

	             }
	             if(operacion.equals("DIVISION")){
	                float opera=dato1/dato2;
	                result = "El resultado de la suma es:"+ opera;

	             }


	        }
	        return result;

	    }
	    
	}
