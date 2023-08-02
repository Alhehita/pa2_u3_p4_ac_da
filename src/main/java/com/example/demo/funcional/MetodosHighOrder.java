package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {
	private static final Logger LOG = LoggerFactory.getLogger(MetodosHighOrder.class);

	public static void metodo(IPersonaSupplier<String> funcion) {

		LOG.info("HighOrder Supplier: " + funcion.getId());
	}

	public static void aceptar(IPersonaConsumer<String> funcion, String arg) {
		funcion.accept(arg);
		//LOG.info(cadena + " " + arg);
	}

}