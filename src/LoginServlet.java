

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.dao.UserDAO;
import com.ems.dao.UserDAOImpl;
import com.ems.domain.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("Login requested for user : "+ username);
		
		UserDAO userDAO = new UserDAOImpl();
		User user = userDAO.getUserByUserName(username);
		
		//validate the user
		
		if(user.getUsername().equals(username) && user.getPassword().equals(password))
		{
			System.out.println("Login Sucessfull!!");
			response.sendRedirect("home.jsp");
		}
		else
		{
			System.out.println("Login failed!!");
			response.sendRedirect("index.jsp?status=invalid");
		}
		
	}

}
