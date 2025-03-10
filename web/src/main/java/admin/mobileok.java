package admin;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 5
)
public class mobileok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String se = req.getParameter("mname"); // hidden
		System.out.println(se);
		if(!se.equals("m")) {
			PrintWriter pw = res.getWriter();
			pw.write("<script>"
					+ "history.go(-1);"
					+ "</script>");
		} else {
			new reviews(req,res);
		}
	}
}

class reviews{ // 외부 클래스 사용 시 한글 깨짐 처리는 doPost, doGet에서 처리함
	public reviews(HttpServletRequest req, HttpServletResponse res) throws IOException {
		try {
			req.setCharacterEncoding("utf-8");
			res.setContentType("text/html;charset=utf-8");
			String mname = req.getParameter("mname");
			System.out.println(mname);
			
		} catch (Exception e) {
			
		}
		
		
	}
}












