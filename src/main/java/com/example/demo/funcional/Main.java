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
		MetodosHighOrder.metodoSupplier(supplierHO);

		// 2 Lambdas
		MetodosHighOrder.metodoSupplier(() -> "1751556653");

		// 3 metodos referenciados

		MetodosHighOrder.metodoSupplier(MetodosReferenciados::getHO);

		// Consumer
		// 1. Clases
		IPersonaConsumer<String> consumerHO = new IPersonaConsumerImpl();
		MetodosHighOrder.metodoConsumer(consumerHO, "ConsumerHO");
		MetodosHighOrder.metodoConsumer(new IPersonaConsumerImpl(), "Otra forma de implementar");
		// 2. Lambdas
		MetodosHighOrder.metodoConsumer(cadena -> {
			LOG.info("1");
			LOG.info(cadena);
		}, "ConsumerHO2");

		// 3. HighOrder

		MetodosHighOrder.metodoConsumer(consumerHO, "ConsumerHO3");
		
		//Predicate 
		//1. Clases
		Boolean predicate = MetodosHighOrder.metodoPredicate(new IPersonaPredicateImpl(), 56);
		LOG.info("Predicate Clases" + predicate);
		
		//2.Lambdas
		Boolean predicate2 = MetodosHighOrder.metodoPredicate(valor -> {
			if(valor >50) {
				return true;
			} else return false;
		}, 76);
		LOG.info("Predicate Lambdas" + predicate2);

		//3.Metodos Referenciados
		
		Boolean predicate3 =MetodosHighOrder.metodoPredicate(MetodosReferenciados::evaluar, 65);
		LOG.info("Predicate Metodos referenciados" + predicate3);

		
		//Function
		//1.Clases
		Character res = MetodosHighOrder.metodoFunction(new IPersonaFunctionImpl(), 64);
		LOG.info("Function clases: " + res);
		
		//2.Lambda
		Character res2 = MetodosHighOrder.metodoFunction(val -> {
			int value = val;
	        char c  = (char) value;
			return c;
		}, 67);
		
		LOG.info("Function lambda: " + res2);

		//3.Metodos Referenciados
		
		Character res3 = MetodosHighOrder.metodoFunction(MetodosReferenciados::aplicar,74);
		LOG.info("Function Metodos Referenciados: " + res3);

		//Unary Operator
		
		//1.Clases
		Double resultado = MetodosHighOrder.metodoUnaryOperator(new IPersonaUnaryOperatorImpl(), 23.5);
		LOG.info("Unary Operator Clases: " + resultado);
		
		//2.Lambda
		Double resultado2 = MetodosHighOrder.metodoUnaryOperator(valor ->{
			Double respuesta = valor + 23.56/3.2;
			return respuesta;
		}, resultado);

		LOG.info("Unary Operator Lambdas: " + resultado2);
		
		//3.Metodos Referenciados
		Double resultado3 = MetodosHighOrder.metodoUnaryOperator(MetodosReferenciados::aplicar, resultado2);
		LOG.info("Unary Operator Metodos Referenciados: " + resultado3);

		///////////////////////////////////////////////////////////

	//	LOG.info("Interfaces Funcionales");
		/* Interfaces Funcionales Java */
/*
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
	*/
	}

}
