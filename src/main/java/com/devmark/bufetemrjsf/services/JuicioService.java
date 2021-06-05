/**
 * 
 */
package com.devmark.bufetemrjsf.services;

import java.util.Arrays;
import java.util.List;

import com.devmark.bufetemrjsf.entity.Actor;
import com.devmark.bufetemrjsf.entity.EstadoProcesal;
import com.devmark.bufetemrjsf.entity.Juicio;

/**
 * @author marcos.hernandez
 * 
 * Clase encargada de la logica de negocio
 *
 */
public class JuicioService {
	
	public List<Juicio> findAll() {
		List<Juicio> juicios = Arrays.asList(new Juicio(1L, "ISSSTE", new Actor("Julio Cesar", "Abarca", "Ruíz"), "374/2016", 120051.54, "REMOTO",
				"Secretaria General de Conflictos Individuales-25 de Marzo de 2019 /Celia Maribel Fernandez", 
				new EstadoProcesal(1L, "DICTAMEN")),
				new Juicio(2L, "ISSSTE", new Actor("Irma", "Acosta", "Sosa"), "3561/2013", 0.0, "REMOTO",
						"12 de Abril de 2019 - Archivista Carlos Alberto Acosta (Instrucción)", 
						new EstadoProcesal(1L, "DICTAMEN")));
		
		return juicios;
	}

}
