package com.clearminds.tests;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {
	public static void main(String[] args) {

		PersonaManager admin;
		try {
			admin = new PersonaManager();
			Persona p = new Persona();
			admin.insertarPersona(p);
		} catch (InstanceException e) {
			e.printStackTrace();
			e.getMessage();
		}
		

	}
}
