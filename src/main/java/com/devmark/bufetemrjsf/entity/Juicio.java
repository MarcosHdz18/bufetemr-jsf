/**
 * 
 */
package com.devmark.bufetemrjsf.entity;

/**
 * @author marcos.hernandez
 * 
 * Clase que representa entidades de juicio
 *
 */
public class Juicio {
	
	/**
	 * Identificador unico del juicio
	 */
	private Long idJuicio;
	
	/**
	 * Parte demandada en el juicio
	 */	
	private String parteDemandada;
	
	/**
	 * Parte actora en el juicio	
	 */
	private Actor parteActora;
	
	/**
	 * Expediente del juicio
	 */
	private String expediente;
	
	/**
	 * Cuantificacion del juicio
	 */
	private Double cuantificacion;
	
	/**
	 * Probabilidad del juicio	
	 */
	private String probabilidad;
	
	/**
	 * Observaciones del juicio
	 */
	private String observaciones;
	
	/**
	 * Estado procesal del juicio	
	 */
	private String estadoProcesal;

	/**
	 * 
	 */
	public Juicio() {
	}

	/**
	 * @param idJuicio
	 * @param parteDemandada
	 * @param parteActora
	 * @param expediente
	 * @param cuantificacion
	 * @param probabilidad
	 * @param observaciones
	 * @param estadoProcesal
	 */
	public Juicio(Long idJuicio, String parteDemandada, Actor parteActora, String expediente, Double cuantificacion,
			String probabilidad, String observaciones, String estadoProcesal) {
		this.idJuicio = idJuicio;
		this.parteDemandada = parteDemandada;
		this.parteActora = parteActora;
		this.expediente = expediente;
		this.cuantificacion = cuantificacion;
		this.probabilidad = probabilidad;
		this.observaciones = observaciones;
		this.estadoProcesal = estadoProcesal;
	}

	/**
	 * @return the idJuicio
	 */
	public Long getIdJuicio() {
		return idJuicio;
	}

	/**
	 * @param idJuicio the idJuicio to set
	 */
	public void setIdJuicio(Long idJuicio) {
		this.idJuicio = idJuicio;
	}

	/**
	 * @return the parteDemandada
	 */
	public String getParteDemandada() {
		return parteDemandada;
	}

	/**
	 * @param parteDemandada the parteDemandada to set
	 */
	public void setParteDemandada(String parteDemandada) {
		this.parteDemandada = parteDemandada;
	}

	/**
	 * @return the parteActora
	 */
	public Actor getParteActora() {
		return parteActora;
	}

	/**
	 * @param parteActora the parteActora to set
	 */
	public void setParteActora(Actor parteActora) {
		this.parteActora = parteActora;
	}

	/**
	 * @return the expediente
	 */
	public String getExpediente() {
		return expediente;
	}

	/**
	 * @param expediente the expediente to set
	 */
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	/**
	 * @return the cuantificacion
	 */
	public Double getCuantificacion() {
		return cuantificacion;
	}

	/**
	 * @param cuantificacion the cuantificacion to set
	 */
	public void setCuantificacion(Double cuantificacion) {
		this.cuantificacion = cuantificacion;
	}

	/**
	 * @return the probabilidad
	 */
	public String getProbabilidad() {
		return probabilidad;
	}

	/**
	 * @param probabilidad the probabilidad to set
	 */
	public void setProbabilidad(String probabilidad) {
		this.probabilidad = probabilidad;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return the estadoProcesal
	 */
	public String getEstadoProcesal() {
		return estadoProcesal;
	}

	/**
	 * @param estadoProcesal the estadoProcesal to set
	 */
	public void setEstadoProcesal(String estadoProcesal) {
		this.estadoProcesal = estadoProcesal;
	}
	
}
