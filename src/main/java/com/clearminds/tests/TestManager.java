package com.clearminds.tests;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {
	public static void main(String[] args) {

		PersonaManager admin = new PersonaManager();
		Persona p = new Persona();
		admin.insertarPersona(p);

	}
}
