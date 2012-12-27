package pureedevisage;

import java.io.IOException;

//import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PureeDeVisage
 */
public class PureeDeVisage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//@EJB
    //private Modele modele;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PureeDeVisage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        String action = request.getParameter("action");
        if(action.equals("....")){
        	// ....
        }else{
        	// Aucune action n'est définie. On affiche le menu principal.
        	getServletContext().getRequestDispatcher("/index.html").forward(request, response);
        }            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
