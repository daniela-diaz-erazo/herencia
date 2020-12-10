package com.clearminds.impl;

import com.clearminds.model.Persona;

public class ServicioPersona implements com.clearminds.interfaces.ServicioPersona {

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en base de datos");
		persona.toString();
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en base de datos");
		persona.toString();
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en base de datos");
		persona.toString();
		return true;
	}

}
