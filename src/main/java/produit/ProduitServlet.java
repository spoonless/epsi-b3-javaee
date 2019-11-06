package produit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/produit")
public class ProduitServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String code = req.getParameter("code");
		String label = req.getParameter("label");
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.write("<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"<head>\n" + 
				"<meta charset=\"UTF-8\">\n" + 
				"<title>Produit</title>\n" + 
				"</head>\n" + 
				"<body>\n" +
				label +
				"<br><img src='./barcode?type=datamatrix&code=" + code + "'>" +
				"</body>\n" + 
				"</html>");
	}
	
}
