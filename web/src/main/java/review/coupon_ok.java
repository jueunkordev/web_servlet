package review;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class coupon_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter pw = null;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		try {
			this.pw = res.getWriter();
			String id = req.getParameter("id");
			String coupon_n = req.getParameter("coupon_n");
			String[] coupon_o = {"A1316B1004", "C4024A0096", "B1987C3136"};
			boolean crt = false;
			for (String coupon : coupon_o) {
			    if (coupon_n.equals(coupon)) {
			        crt = true;
			        break;
			    }
			}
			
			if (crt) {
				this.pw.write("<script>"
						+ "alert('쿠폰이 정상적으로 등로되었습니다.');"
						+ "</script>");
				RequestDispatcher rd = req.getRequestDispatcher("/review/coupon_ok.jsp");
				req.setAttribute("id", id);
				req.setAttribute("coupon_n", coupon_n);
				rd.forward(req, res);
			} else {
				this.pw.write("<script>"
						+ "alert('유효하지 않은 쿠폰번호입니다.');"
						+ "window.location.href = './coupon_ok.html';"
						+ "</script>");
			}

		} catch (Exception e) {	
		} finally {
			pw.close();
		}
	}
}
