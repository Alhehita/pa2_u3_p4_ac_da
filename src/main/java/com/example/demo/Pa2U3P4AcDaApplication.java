package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Provincia;
import com.example.demo.repository.modelo.Semestre;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MateriaService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U3P4AcDaApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private MatriculaService matriculaService;
	
	@Autowired
	private MateriaService materiaService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4AcDaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Semestre semestre = new Semestre();
		Provincia provincia = new Provincia();
		
		Estudiante estudiante = new Estudiante();
		Matricula matricula = new Matricula();
		Materia materia = new Materia();
		
		semestre.setNumero("6");
		semestre.setNumMaterias("5");
		semestre.setPeriodo("2023-2023");
		
		provincia.setNombre("Pichincha");
		provincia.setEstudiantes(null);
		provincia.setCapital("Quito");
		
		List<Materia> materias = new ArrayList<>();
		
		semestre.setMaterias(materias);
			
		}
		
	

}
