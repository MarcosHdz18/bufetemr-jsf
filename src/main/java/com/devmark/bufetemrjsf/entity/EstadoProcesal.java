/**
 * 
 */
package com.devmark.bufetemrjsf.entity;

/**
 * @author marcos.hernandez
 *
 */
public class EstadoProcesal {
	
	/**
	 * Identificador unico del estado procesal
	 */
	private Long idEstadoProcesal;
	
	/**
	 * Estado procesal del juicio
	 */
	private String descripcion;

	/**
	 * @param idEstadoProcesal
	 * @param descripcion
	 */
	public EstadoProcesal(Long idEstadoProcesal, String descripcion) {
		this.idEstadoProcesal = idEstadoProcesal;
		this.descripcion = descripcion;
	}

	/**
	 * @return the idEstadoProcesal
	 */
	public Long getIdEstadoProcesal() {
		return idEstadoProcesal;
	}

	/**
	 * @param idEstadoProcesal the idEstadoProcesal to set
	 */
	public void setIdEstadoProcesal(Long idEstadoProcesal) {
		this.idEstadoProcesal = idEstadoProcesal;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
