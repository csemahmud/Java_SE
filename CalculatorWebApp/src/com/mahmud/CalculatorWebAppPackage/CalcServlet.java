package com.mahmud.CalculatorWebAppPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mahmudul Hasan Khan CSE
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
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
		
		String firstStr = request.getParameter("firstNumber");
		String secondStr = request.getParameter("secondNumber");
		request.setAttribute("firstNumber", firstStr);
		request.setAttribute("secondNumber", secondStr);
		try{
			double firstNumber = Double.parseDouble(firstStr);
			double secondNumber = Double.parseDouble(secondStr);
			String operator = request.getParameter("operator").toString();
			double result = 0;
			switch (operator) {
			case "Add":
				result = firstNumber + secondNumber;
				break;
			case "Subtract":
				result = firstNumber - secondNumber;
				break;
			case "Multiply":
				result = firstNumber * secondNumber;
				break;
			case "Divide":
				result = firstNumber / secondNumber;
				break;
			case "Modulous":
				result = firstNumber % secondNumber;
				break;
			}
			request.setAttribute("result", result);
		}catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("exception", e.getMessage());
		}
		
		doGet(request, response);
	}

}
