package review;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class noticeok extends HttpServlet {
	private static final long serialVersionUID = 1L;
    // HttpServletRequest : 데이터 전달 통신 규격 interface
	// HttpServletResponse : 결과에 대한 응답 통신 규격 interface
	PrintWriter pw = null;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html");
		try {
			this.pw = res.getWriter();
			String se = req.getParameter("se");
			if(se.equals("korea.com")) {
				String subject = req.getParameter("subject");
				String writer = req.getParameter("writer");
				String wtext = req.getParameter("wtext");
				System.out.println(subject);
				System.out.println(writer);
				System.out.println(wtext);
				
				RequestDispatcher rd = req.getRequestDispatcher("/review/noticeview.jsp");
				rd.forward(req, res);
			}else {
				this.pw.write("<script>"
						+ "alert('올바른 접근 방법이 아닙니다.');"
						+ "history.go(-1)"
						+ "</script>");
			}
		} catch (Exception e) {
			
		} finally {
			
		}
	}

}














