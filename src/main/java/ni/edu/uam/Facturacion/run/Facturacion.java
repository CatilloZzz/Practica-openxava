package ni.edu.uam.Facturacion.run;

import org.openxava.util.*;

/**
 * Execute this class to start the application.
 */

public class Facturacion {

	public static void main(String[] args) throws Exception {
		DBServer.start("Facturacion-db"); // To use your own database comment this line and configure src/main/webapp/META-INF/context.xml
		AppServer.run("Facturacion"); // Use AppServer.run("") to run in root context
	}

}
