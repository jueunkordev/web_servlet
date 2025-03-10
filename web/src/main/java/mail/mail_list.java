package mail;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mail_list extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// list를 출력하기 위한 Database Table을 로드하는 Model
		m_maillist nl = new m_maillist();
		// 2차 클래스 배열로 저장된 테이블에 모든 데이터를 셋팅함
		ArrayList<ArrayList<String>> result = nl.db_data();
		
		request.setAttribute("result", result);
		System.out.println(result);
		System.out.println(result.size());
		
		RequestDispatcher rd = request.getRequestDispatcher("./mail_list.jsp");
		rd.forward(request, response);
	}

}
