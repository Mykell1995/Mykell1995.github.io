package com.newthinktank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Processinfo")
public class Processinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Processinfo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/DisplayInfo.jsp";
		String usersName = request.getParameter("name");
		request.setAttribute("usersName", usersName);
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request,response);
	}

}
