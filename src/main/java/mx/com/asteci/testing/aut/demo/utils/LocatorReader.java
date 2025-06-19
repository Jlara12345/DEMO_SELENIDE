package mx.com.asteci.testing.aut.demo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LocatorReader {

	public LocatorReader() {
		// TODO Auto-generated constructor stub
	}
	
	private static final Properties properties = new Properties();
	
	
    static {
        try (InputStream input = LocatorReader.class
                .getClassLoader()
                .getResourceAsStream("locators.properties")) {

            if (input == null) {
                throw new RuntimeException("No se encontró el archivo locators.properties");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Error al cargar locators.properties", e);
        }
    }
    
    
    
    
    
    public static String get(String key) {
        return properties.getProperty(key);
    }

}
