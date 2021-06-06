/**
 * 
 */
package com.devmark.bufetemrjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devmark.bufetemrjsf.dto.UsuarioDTO;

/**
 * @author marcos.hernandez
 * 
 * Clase control que manipula los datos de la pantalla login.xhtml
 *
 */
@ManagedBean
public class LoginController {
	
	/**
	 * Usuario ingresado en la pantalla login.xhtml
	 */
	private String usuario;
	
	/**
	 * Password ingresado en la pantalla login.xhtml
	 */
	private String password;
	
	/**
	 * Bean que mantendra la sesion del usuario.
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	/**
	 * Metodo que se utiliza para ingresar con el login de la pantalla login.xhtml.
	 */
	public void ingresar() {
		if (this.getUsuario().equals("luis.hernandez") && this.getPassword().equals("123456")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.getUsuario());
				usuarioDTO.setPassword(this.getPassword());
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				
				this.redireccionar("federal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:campoUsuario", 
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "Ups! Página no encontrada", ""));
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:campoUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Acceso incorrecto, nombre de usuario y/o contraseña incorrecta.", ""));
		}
	}
	
	/**
	 * Metodo que redirecciona a otra pagina en el sistema
	 * @param pagina 
	 * @throws IOException
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
