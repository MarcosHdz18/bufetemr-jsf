/**
 * 
 */
package com.devmark.bufetemrjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devmark.bufetemrjsf.entity.Juicio;
import com.devmark.bufetemrjsf.services.JuicioService;

/**
 * @author marcos.hernandez
 * 
 * Clase encargada de procesar la informacion de la pantalla juicios.xhtml
 *
 */
@ManagedBean
@ViewScoped
public class JuicioController {
	
	/**
	 * Lista de los juicios consultados
	 */
	private List<Juicio> juicios;
	
	/**
	 * Lista de los juicios filtrados	
	 */
	private List<Juicio> juiciosFiltrados;
	
	/**
	 * Objeto que obtiene la logica de negocio de la clase entity Juicio	
	 */
	private JuicioService juicioService = new JuicioService();
	
	/**
	 * Metodo que inicializa la pantalla con los juicios consultados
	 */
	@PostConstruct
	public void init() {
		this.findAll();
	}
	
	/**
	 * Metodo que realiza la consulta de todos los juicios
	 */
	public void findAll() {
		this.juicios = this.juicioService.findAll();
	}

	/**
	 * @return the juicios
	 */
	public List<Juicio> getJuicios() {
		return juicios;
	}

	/**
	 * @param juicios the juicios to set
	 */
	public void setJuicios(List<Juicio> juicios) {
		this.juicios = juicios;
	}

	/**
	 * @return the juiciosFiltrados
	 */
	public List<Juicio> getJuiciosFiltrados() {
		return juiciosFiltrados;
	}

	/**
	 * @param juiciosFiltrados the juiciosFiltrados to set
	 */
	public void setJuiciosFiltrados(List<Juicio> juiciosFiltrados) {
		this.juiciosFiltrados = juiciosFiltrados;
	}
	
}
