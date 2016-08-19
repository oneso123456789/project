package send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myUtil.HanConv;

public class multiPara extends HttpServlet {

  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
    resp.setContentType("text/html;charset=euc-kr");
	PrintWriter out = resp.getWriter();
	String []item;
	
	item=req.getParameterValues("item");
	out.println("선택된 항목이");
	try{	  
	  for(int i=0; i<item.length; i++)
		out.println(" : "+HanConv.toKor(item[i]));
	  out.println("입니다.");
	}catch(Exception e){
		out.println(" 없습니다.");
	}
	
  }
}
