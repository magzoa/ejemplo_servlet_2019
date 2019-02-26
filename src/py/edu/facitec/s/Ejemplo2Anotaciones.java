package py.edu.facitec.s;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ejemplo2Anotaciones
 */
@WebServlet("/nuevo")
public class Ejemplo2Anotaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejemplo2Anotaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Obtenemos el objeto para escribir algo 
				//en pantalla.
				PrintWriter out=resp.getWriter();
				//Recuperamos el parametro del formulario
				String nombre=req.getParameter("nombre");
				
				
				out.println("<html>");
				out.println("<body>");
				
				out.println("HOLA ESTO ENVIO UNA SERVLET NUEVO BY "+nombre);
				
				out.println("</body>");
				out.println("</html>");
				
				
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
