package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {

	public void agregar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public void borrar(Integer id);

	public Hotel buscarPorId(Integer id);
	
	public List<Hotel> buscarInnerJoin();
	
	
}
