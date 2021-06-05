/**
 * 
 */
package com.devmark.bufetemrjsf.entity;

/**
 * @author marcos.hernandez
 * 
 * Clase que representa entidades de actor
 *
 */
public class Actor {
	
	/**
	 * Nombre del actor
	 */
	private String nombre;
	
	/**
	 * Apellido paterno del actor
	 */
	private String apellidoPaterno;
	
	/**
	 * Apellido materno del actor
	 */
	private String apellidoMaterno;

	/**
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 */
	public Actor(String nombre, String apellidoPaterno, String apellidoMaterno) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

}
