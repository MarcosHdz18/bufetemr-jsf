/**
 * 
 */
package com.devmark.bufetemrjsf.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devmark.bufetemrjsf.dto.UsuarioDTO;

/**
 * @author marcos.hernandez
 * 
 * Clase encargada de la sesion del usuario.
 *
 */
@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * Usuario que se mantendra en sesion.
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesion del usuario.
	 */
	public void init() {
		System.out.println("Cargando información del usuario en la sesión");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
