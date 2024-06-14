package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisreoServlets
 */
public class RegistroServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	PrintWriter salida= response.getWriter();
	String usuario= request.getParameter("usuario");
	String password= request.getParameter("password");
	String password2= request.getParameter("password2");
	String correo= request.getParameter("correo");
	
	salida.println(UtilidadesServlets.getCabecera("resusltado del formulario"));
	
		salida.println("<h1>Resultado del formulario");
		salida.println("<p>Usuario:"+ usuario + "<p>");
		salida.println("<p>Contraseña:"+ password + "<p>");
		salida.println("<p> Contraseña repetida:"+ password2 + "<p>");
		salida.println("<p>Correo electronico:"+ correo + "<p>");
		
		salida.println(UtilidadesServlets.getPie());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
