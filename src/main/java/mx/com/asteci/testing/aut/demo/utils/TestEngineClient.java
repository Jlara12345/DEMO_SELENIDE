package mx.com.asteci.testing.aut.demo.utils;

import java.io.File;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;

public class TestEngineClient {

	private static String urlTestEngine;
	private static String rutaLocal;
	private static Client client;
	
	
	private static WebTarget webTarget;
	private static MultiPart multiPart;
	private static FileDataBodyPart fileDataBodyPart;
	private static Invocation.Builder invocationBuilder;

	private static Response response;

	@Override
	public String toString() {
		return "URL_TEST_ENGINE>>>" + this.urlTestEngine + "                      REPOSITORIO_LOCAL>>>"
				+ this.rutaLocal;
	}

	public static String getUrlTestEngine() {
		return urlTestEngine;
	}

	public static void setUrlTestEngine(String urlTestEngine) {
		TestEngineClient.urlTestEngine = urlTestEngine;
	}

	public static String getRutaLocal() {
		return rutaLocal;
	}

	public static void setRutaLocal(String rutaLocal) {
		TestEngineClient.rutaLocal = rutaLocal;
	}

	public TestEngineClient() {
		// TODO Auto-generated constructor stub
	}

	public static void init(String urlEngineP, String rutaLocalP) {

		urlTestEngine = urlEngineP;
		rutaLocal = rutaLocalP;
		
		/*
		client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();

		webTarget = client.target(urlTestEngine);
		multiPart = new MultiPart();
		multiPart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);
*/
	}

	public static String envioEvidencia(File imagenPantallazo, String flujo, String timeStampFlujo, String paso,
			String timeStampPaso, String verificacionPaso, String observaciones, String nombreImagen, String finalizado,
			String target, String tiempoRespuesta) {
		
		
		client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();

		webTarget = client.target(urlTestEngine);
		multiPart = new MultiPart();
		multiPart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);

		String resultadoRespuesta = "";

		fileDataBodyPart = new FileDataBodyPart("file", imagenPantallazo, MediaType.APPLICATION_OCTET_STREAM_TYPE);

		multiPart.bodyPart(fileDataBodyPart);

		invocationBuilder = webTarget.request();

		invocationBuilder.header("Flujo", flujo);
		invocationBuilder.header("TimestampFlujo", timeStampFlujo);
		invocationBuilder.header("Paso", paso);
		invocationBuilder.header("timeStampPaso", timeStampPaso);
		invocationBuilder.header("status", verificacionPaso);
		invocationBuilder.header("descripcion", observaciones);
		invocationBuilder.header("nombreEvidencia", nombreImagen);
		invocationBuilder.header("concluido", finalizado);
		invocationBuilder.header("tipoEvidencia", target);
		invocationBuilder.header("responseTime", tiempoRespuesta);
		
		System.out.println("El valor de evidencia es: " + target);

		response = invocationBuilder.post(Entity.entity(multiPart, multiPart.getMediaType()));

		System.out.println(response.getStatus() + " " + response.getStatusInfo() + " " + response);

		System.out.println("El valor del encabezado es: " + response.getHeaderString("Paso"));

		System.out.println("La respuesta del servidor es: " + response.readEntity(String.class));

		//resultadoRespuesta = response.readEntity(String.class);

		invocationBuilder = null;
		response = null;

		return resultadoRespuesta;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = "/Users/QualityServices/REPO/TMP_EVIDENCIA_CLIENTES/";
		String urlTestE = "http://57.154.68.150:8080/UPLOAD/monitoring/mon_ext/insertaRegistro";

		System.out.println(new TestEngineClient().toString());

	}

}
