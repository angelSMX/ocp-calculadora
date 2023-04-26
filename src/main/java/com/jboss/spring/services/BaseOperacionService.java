package com.jboss.spring.services;

import java.util.List;

import com.jboss.spring.model.CalculadoraModel;

public interface BaseOperacionService<E> {

	  public String operacion(List<CalculadoraModel> calcular) throws Exception;
	
}
