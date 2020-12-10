package com.clearminds.impl;



import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;
import com.clearminds.utils.Utils;

public class PersonaManager {
	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {

		try {
			String rutaClase = Utils.leerPropiedad("clase");
			Class<?> clase = Class.forName(rutaClase);
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}

	}

	

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}
}
