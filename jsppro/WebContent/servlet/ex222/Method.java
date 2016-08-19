package send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Method extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	  resp.setContentType("text/html;charset=euc-kr");
      PrintWriter out = resp.getWriter();
	  out.println("<h1>get 방식으로 처리됨</h1>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	  resp.setContentType("text/html;charset=euc-kr");
	  PrintWriter out = resp.getWriter();
	  out.println("<h1>post 방식으로 처리됨</h1>");
	}

}
