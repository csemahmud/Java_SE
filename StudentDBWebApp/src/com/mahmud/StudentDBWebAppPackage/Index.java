package com.mahmud.StudentDBWebAppPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mahmud.StudentDBWebAppPackage.bll.StudentManager;
import com.mahmud.StudentDBWebAppPackage.models.StudentDAO;

/**
 * @author Mahmudul Hasan Khan CSE
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentManager aStudentManagerObj = new StudentManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String regNo = request.getParameter("regNo");
		try{
			double cgpa = Double.parseDouble(request.getParameter("cgpa"));
			int age = Integer.parseInt(request.getParameter("age"));
			StudentDAO student = new StudentDAO(name, regNo, cgpa, age);
			if(aStudentManagerObj.saveStudent(student) > 0){
				request.setAttribute("message", 
						student + " has been saved SUCCESSFULLY");
			} else {
				request.setAttribute("error", 
						"Could NOT save : " + student);
			}
		}catch (Exception ex) {
			// TODO: handle exception
			request.setAttribute("error", 
					"Exception : " + ex.getMessage());
		}
		
		doGet(request, response);
	}

}
