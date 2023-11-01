package utn.tienda_libros;

import java.awt.EventQueue;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext contextoSpring = new SpringApplicationBuilder(TiendaLibrosApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);

		// Ejecutamos el codigo para cargar el formulario
		EventQueue.invokeLater(() -> { // Metodo Lambda
			// Obtenemos el objeto from a traves del String
			LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
			libroFrom.setVisible(true);
		});
	}

}
