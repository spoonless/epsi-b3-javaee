package io.github.spoonless.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/donneespersonnelles")
public class SaisieDonneesPersonnellesControleur extends HttpServlet {
	
	private static final String VUE_FORMULAIRE = "/WEB-INF/jsp/saisieDonneesPersonnelles.jsp";
	private static final String VUE_RESULTAT = "/WEB-INF/jsp/donneesPersonnelles.jsp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		try {
			String nom = req.getParameter("nom");
			String age = req.getParameter("age");
			DonneesPersonnelles donneesPersonnelles = new DonneesPersonnelles(nom, age);
			req.setAttribute("donneesPersonnelles", donneesPersonnelles);
			getServletContext().getRequestDispatcher(VUE_RESULTAT).forward(req, resp);
		} catch (DonneesInvalidesException e) {
			req.setAttribute("message", e.getMessage());
			getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(req, resp);
		}
	}

}
