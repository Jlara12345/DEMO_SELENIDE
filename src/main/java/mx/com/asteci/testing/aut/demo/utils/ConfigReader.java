package mx.com.asteci.testing.aut.demo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	public ConfigReader() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	private static final Properties properties = new Properties();
	
	
    static {
        try (InputStream input = LocatorReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new RuntimeException("No se encontró el archivo config.properties");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Error al cargar config.properties", e);
        }
    }
    
    
    
    
    
    public static String get(String key) {
        return properties.getProperty(key);
    }

}
