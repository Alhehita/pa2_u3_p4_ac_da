package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements HotelRepository{


	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel hotel) {
		this.entityManager.persist(hotel);
		
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.entityManager.merge(hotel);
		
	}

	@Override
	public void eliminar(Integer id) {
		Hotel hotel = this.seleccionarId(id);
		this.entityManager.remove(hotel);		
	}

	@Override
	public Hotel seleccionarId(Integer id) {
	
		
		return this.entityManager.find(Hotel.class, id);
		
		
	}

	@Override
	public List<Hotel> seleccionarInnerJoin() {
		//select * from hotel h join habitacion ha on h.hote_id = ha.habi_id_hotel
		TypedQuery<Hotel> myQuery =  this.entityManager.createQuery("SELECT h from Hotel h JOIN h.habitaciones ha", Hotel.class);
		//SELECT h from Hotel h JOIN h.habitaciones ha 
		return myQuery.getResultList();
	}

}
