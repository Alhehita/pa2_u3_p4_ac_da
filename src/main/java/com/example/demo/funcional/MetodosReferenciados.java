package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {

	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);

//Supplier
	public static Integer metodoSupplier() {
		Integer val= 8;
		if(val > 8) {
			return val =+val;
		}else
		return val-=3;
	}

	public static String getHO() {
		return "ale";
	}

	// Consumer
	public static void metodoConsumer(String arg) {
		String cadena = "Nombres de gatos: ";

		LOG.info(cadena + " " + arg);
	}

	// Predicate
	public static boolean metodoPredicate(String arg) {
		String valor = "i";

		if (arg.contains(valor)) {
			return true;
		} else {
			return false;
		}
	}

	// Function
	public static Character metodoFunction(Integer arg) {
		int value = arg;
        char c  = (char) value;
		return c;
	}

	// Unary Operator
	public static Double metodoUnaryOperator(Double arg) {
		Double res = arg + 23.56/3.2;
		return res;
	}

}
