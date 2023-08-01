package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	
	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);

//Supplier
	public Integer getId() {
		return 8;
	}
	
	//Consumer
	public void aceptar(String arg) {
		String cadena = "Dennisse";
		
		LOG.info(cadena +" "+ arg);
	}
	
	//Predicate
	public boolean evaluar(Integer arg) {
		Integer valor = 15;
		
		if(arg.compareTo(valor)>25) {
			return true;
		} else {
			return false;
		}
	}
	
	//Function
	public Character aplicar(Integer arg) {
		char c = Character.forDigit(arg, 10);
		
		return c;
	}
	
	//Unary Operator
	public Double aplicar(Double arg) {
		Double  res = arg + 23.56;
		return res;
	}
	
	
}
