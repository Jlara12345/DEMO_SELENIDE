package mx.com.asteci.testing.aut.demo.utils;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;


import com.codeborne.selenide.Screenshots;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;


public class Util {

	static public File captureScreen(String fileName) throws Exception {
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		File imagenPantallazo= new File(fileName);
		//ImageIO.write(image, "png", imagenPantallazo);
		ImageIO.write(image, "jpeg", imagenPantallazo);
		return imagenPantallazo;
	}
	
	
	
	
	  /**
     * Toma una captura de pantalla y la guarda en la ruta especificada.
     *
     * @param rutaCompletaArchivo Ruta completa donde se guardará el archivo, incluyendo nombre y extensión (ej: "C:/capturas/test.png")
     * @return Objeto File que representa la imagen guardada
     * @throws IOException si ocurre un error al mover el archivo
     */
    public static File tomarCapturaPantalla(String rutaCompletaArchivo) throws IOException {
        // Captura temporal
        File capturaTemporal = Screenshots.takeScreenShotAsFile();

        // Ruta destino como Path
        Path rutaDestino = Paths.get(rutaCompletaArchivo);

        // Crear directorios si no existen
        Files.createDirectories(rutaDestino.getParent());

        // Mover archivo temporal a destino con nombre definido
        Files.move(capturaTemporal.toPath(), rutaDestino);

        // Retornar referencia al archivo final
        return rutaDestino.toFile();
    }
    
    
    /**
     * Calcula la diferencia entre dos tiempos en milisegundos.
     *
     * @param tiempoFinal   Tiempo final en milisegundos
     * @param tiempoInicial Tiempo inicial en milisegundos
     * @return Resultado como cadena (ej: "Tiempo de respuesta: 532 ms")
     */
    public static String calcularTiempoRespuesta(long tiempoFinal, long tiempoInicial) {
        long diferencia = tiempoFinal - tiempoInicial;
        return (new Long(diferencia)).toString();
    }
    
    
    /**
     * Simula un tiempo de respuesta sumando un valor aleatorio (0-1000 ms)
     * al valor base recibido como String.
     *
     * @param valorBaseStr Valor base representado como String (debe ser convertible a long)
     * @return Resultado como String, con el valor sumado
     */
    public static String tiempoRespuestaDummyDemo(String valorBaseStr) {
        try {
            long valorBase = Long.parseLong(valorBaseStr);
            int aleatorio = new Random().nextInt(1001); // de 0 a 1000 inclusive
            long resultado = valorBase + aleatorio;
            return String.valueOf(resultado);
        } catch (NumberFormatException e) {
            return "Error: el valor proporcionado no es un número válido.";
        }
    }
    
    /**
     * Obtiene la marca en el tiempo para el flujo o para el paso
     *
     * @return Resultado como String, con el valor del timestamp
     */
    
    public static String getTimeStamp() {
    	
    	String timeStamp="";
    	
		TimeZone timeZone = TimeZone.getTimeZone("America/Mazatlan");
		String DATE_FORMAT = "yyyy.MM.dd.HH.mm.ss";
		SimpleDateFormat formatterWithTimeZone = new SimpleDateFormat(DATE_FORMAT);
		formatterWithTimeZone.setTimeZone(timeZone);

		Date date = new Date();

		timeStamp = formatterWithTimeZone.format(date);
    	
    	
    	return timeStamp;
    	
    }
	
	

}
