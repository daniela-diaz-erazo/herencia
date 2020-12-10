package com.clearminds.utils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Utils {
	public static String leerPropiedad(String nombrePropiedad) {
		Properties p = new Properties();
		String valorPropiedad = null;
		try {
			File f = new File("config.properties");
			System.out.println("Ruta:" + f.getAbsolutePath());
			p.load(new FileReader("config.properties"));
			valorPropiedad = p.getProperty(nombrePropiedad);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return valorPropiedad;
	}
}
