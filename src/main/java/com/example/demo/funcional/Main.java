package com.example.demo.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MetodosReferenciados metodosReferenciados = new MetodosReferenciados();

		// Metodos HighOrder

		MetodosHighOrder highOrder = new MetodosHighOrder();

		// 1 Clases

		IPersonaSupplier<String> supplierHO = new IPersonaSupplierImpl();
		MetodosHighOrder.metodo(supplierHO);

		// 2 Lambdas
		MetodosHighOrder.metodo(() -> "1751556653");

		// 3 metodos referenciados

		MetodosHighOrder.metodo(MetodosReferenciados::getHO);

		// Consumer
		// 1. Clases
		IPersonaConsumer<String> consumerHO = new IPersonaConsumerImpl();
		MetodosHighOrder.aceptar(consumerHO, "ConsumerHO");
		MetodosHighOrder.aceptar(new IPersonaConsumerImpl(), "Otra forma de implementar");
		// 2. Lambdas
		MetodosHighOrder.aceptar(cadena -> {
			LOG.info("1");
			LOG.info(cadena);
		}, "ConsumerHO2");

		// 3. HighOrder

		MetodosHighOrder.aceptar(consumerHO, "ConsumerHO3");

		///////////////////////////////////////////////////////////

		/* Interfaces Funcionales Java */

		// 1.Supplier

		// con F3 se va directo a la implementacion de cualquier metodo
		Stream<String> lista = Stream.generate(() -> "1751556653").limit(10);//genera 10 filas con las mismas cadenas
		lista.forEach(cadena -> LOG.info(cadena));
		LOG.info("Prueba " + lista);
		
		//2. Consumer
		
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		listaNumeros.forEach(cadena -> {
			LOG.info("1");
			LOG.info(" " + cadena);
		});
		
		//3.Predicate
		Stream<Integer> listaFinal =listaNumeros.stream().filter(numero -> numero >=5);// todos los que completen true pasan a la lista final
		listaFinal.forEach(numero -> LOG.info("valor: " + numero)); //cuando no se manda a imprimir solo String en log hay que añadir una cadena de string
	
		//4.Function
		
		Stream<String> listaCambiada =listaNumeros.stream().map(numero -> {
			Integer num = 10;
			
			num = numero + num;
			
			return "N: " + num;
			
		});
		listaCambiada.forEach(cadena -> LOG.info(cadena));
		
		//5.Unary Operator
		
		Stream<Integer> listaCambiada2 =listaNumeros.stream().map(numero -> {
			Integer num = 10;
			
			num = numero + num;
			
			return num;
			
		});
		listaCambiada2.forEach(cadena -> LOG.info(cadena.toString())); // solo para la impresion se hace toString
	
	}

}
