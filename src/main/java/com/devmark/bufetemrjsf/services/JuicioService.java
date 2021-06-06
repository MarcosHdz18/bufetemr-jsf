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
				"Secretaria General de Conflictos Individuales-25 de Marzo de 2019 /Celia Maribel Fernandez.", 
				new EstadoProcesal(1L, "DICTAMEN")),
				new Juicio(2L, "ISSSTE", new Actor("Irma", "Acosta", "Sosa"), "3561/2013", 0.0, "REMOTO", "12 de Abril de 2019 - Archivista Carlos Alberto Acosta (Instrucción).", 
				new EstadoProcesal(1L, "DICTAMEN")),
				new Juicio(3L, "AFORE PENSIONISSSTE", new Actor("Mercedes", "Elenes", "Cabanillas"), "1774/2013", 0.0, "REMOTO", "Pendiente de Dictamen- 22 de octubre de 2018 (Auxiliar de Trámite Carlos Alejandro).", 
				new EstadoProcesal(1L, "DICTAMEN")),
				new Juicio(4L, "ISSSTE", new Actor("Ma Socorro", "García", "Solano"), "646/2016", 0.0, "REMOTO", "16 de Mayo 2019-11:30 Horas/CD&E.", 
				new EstadoProcesal(2L, "PRUEBAS")),
				new Juicio(5L, "AFORE BANAMEX", new Actor("Juliana", "Rodríguez", "Celsa"), "52/2017", 40367.99, "REMOTO", "Lic. Mariana Hernández-09 Abril 2019.", 
				new EstadoProcesal(1L, "DICTAMEN")),
				new Juicio(6L, "BANAMEX", new Actor("Carlota", "Serrano", "López"), "44/2013", 75000.00, "REMOTO", "Auxiliar de Trámite 20 de Noviembre de 2018.", 
				new EstadoProcesal(1L, "DICTAMEN")));
		
		return juicios;
	}

}
