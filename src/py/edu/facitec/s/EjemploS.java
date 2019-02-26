package py.edu.facitec.s;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EjemploS extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override//sobre escribir
	//Request es lo que viene del navegador
	//es representado por el objeto req
	
	//Response es lo que envia esta clase
	//al navegador o cliente web
	//representado por el objeto resp
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//Obtenemos el objeto para escribir algo 
		//en pantalla.
		PrintWriter out=resp.getWriter();
		//Recuperamos el parametro del formulario
		String nombre=req.getParameter("nombre");
		
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("HOLA ESTO ENVIO UNA SERVLET BY "+nombre);
		
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}
	
	
	
}
