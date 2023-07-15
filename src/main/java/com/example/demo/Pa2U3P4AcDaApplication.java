package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U3P4AcDaApplication implements CommandLineRunner {

	@Autowired
	HotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		List<Hotel> listHotel = this.hotelService.buscarInnerJoin();
		for (Hotel h : listHotel) {

		System.out.println(h.getNombre());
		System.out.println("tiene las siguientes habitaciones");
		for(Habitacion ha : h.getHabitaciones()) {
			System.out.println(ha.getNumero());
		}
			
		}
		
		System.out.println("SQL join Fetch");
		
		List<Hotel> listHotelF = this.hotelService.buscarFetchJoin();
		for (Hotel h : listHotelF) {

		System.out.println(h.getNombre());
		System.out.println("tiene las siguientes habitaciones Fetch");
		for(Habitacion ha : h.getHabitaciones()) {
			System.out.println(ha.getNumero());
		}
		
		Hotel hotel= new Hotel();
		hotel.setDireccion("Av La Patria");
		hotel.setNombre("DondeAugusto");
		
		Habitacion habitacion = new Habitacion();
		habitacion.setHotel(hotel);
		habitacion.setNumero("215");
		habitacion.setValor(new BigDecimal(70));
	//	habitacion.setValorIncluidoIVA(new BigDecimal(270).multiply(new BigDecimal(0.12)));
	
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habitacion);
		hotel.setHabitaciones(habitaciones);
		
		this.hotelService.agregar(hotel);
			
		}
		
	}

}
