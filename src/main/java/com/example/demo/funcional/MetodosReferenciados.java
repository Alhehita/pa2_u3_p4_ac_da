package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {

	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);

//Supplier
	public static Integer getId() {
		return 8;
	}

	public static String getHO() {
		return "ale";
	}

	// Consumer
	public void aceptar(String arg) {
		String cadena = "Dennisse";

		LOG.info(cadena + " " + arg);
	}

	// Predicate
	public static boolean evaluar(Integer arg) {
		Integer valor = 15;

		if (arg.compareTo(valor) > 25) {
			return true;
		} else {
			return false;
		}
	}

	// Function
	public static Character aplicar(Integer arg) {
		int value = arg;
        char c  = (char) value;
		return c;
	}

	// Unary Operator
	public static Double aplicar(Double arg) {
		Double res = arg + 23.56/3.2;
		return res;
	}

}
