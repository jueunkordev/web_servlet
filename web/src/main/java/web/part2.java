package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class part2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PrintWriter pw = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		try {
			// getParameterValues => 배열
			this.pw = response.getWriter();
			String agree[] = request.getParameterValues("agree");
			int ea = agree.length;
			int ckcount = 0;
			int w = 0;
			while (w < ea) {
				if(agree[w].equals("Y0") || agree[w].equals("Y1") || agree[w].equals("Y2")) {
					ckcount++;
				}
				w++;
			}
			if(ckcount < 3) {
				this.pw.print("<script>"
						+ "alert('올바른 접근 방식이 아닙니다. 약관 동의가 필요합니다.');"
						+ "location.href='./part1.jsp';"
						+ "</script>");
			}else {// 해당 조건이 맞을 경우 part2.jsp 로드
				RequestDispatcher rd = request.getRequestDispatcher("./part2.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) { 
			this.pw.print("<script>"
					+ "alert('시스템 오류로 인하여 데이터 처리가 되지 않았습니다.');"
					+ "location.href='./part1.jsp';"
					+ "</script>");
		}
		finally {
			this.pw.close();
		}
	}
}











