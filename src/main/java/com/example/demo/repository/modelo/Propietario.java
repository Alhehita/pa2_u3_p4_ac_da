package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietario")
public class Propietario {

	@GeneratedValue(generator = "seq_propietario", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_propietario", sequenceName = "seq_propetario", allocationSize = 1)
	@Id
	@Column(name = "prop_id")
	private Integer id;

	@Column(name = "prop_nombre")
	private String nombre;

	@Column(name = "prop_apellido")
	private String apellido;

	@Column(name = "prop_cedula")
	private String cedula;

}
