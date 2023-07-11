package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HotelRepository;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void agregar(Hotel hotel) {
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.hotelRepository.actualizar(hotel);
	}

	@Override
	public void borrar(Integer id) {
		this.hotelRepository.eliminar(id);
	}

	@Override
	public Hotel buscarPorId(Integer id) {
		return this.hotelRepository.seleccionarId(id);
	}

	@Override
	public List<Hotel> buscarInnerJoin() {
		
		return this.hotelRepository.seleccionarInnerJoin();
	}

}
