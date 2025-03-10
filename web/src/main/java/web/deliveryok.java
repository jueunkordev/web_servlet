package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deliveryok extends HttpServlet {
    private static final long serialVersionUID = 1L;

    PrintWriter pw = null;

    public deliveryok() { }

    public void deliveryok(HttpServletRequest req, HttpServletResponse res) {
        try {
        	
        	req.setCharacterEncoding("utf-8");
			res.setContentType("text/html;charset=utf-8");
			this.pw = res.getWriter();
			
        } catch (Exception e) {
            System.out.println("URL 경로가 올바르지 않습니다.");
        }
    }

    // 매개변수명을 변경하여 request response 를 다른 이름으로 변경 가능함
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.deliveryok(req, res);
        String mname = req.getParameter("mname");
        String mtel = req.getParameter("mtel");
        String memail = req.getParameter("memail");
        String maddress = req.getParameter("maddress");
        
        // 클래스 배열 사용하는 이유 : setAttribute 너무 많이 생성하여 jsp로 전달 시 getAttribute도 많아짐
        ArrayList<String> data = new ArrayList<String>();
        data.add(mname);
        data.add(mtel);
        data.add(memail);
        data.add(maddress);
        
        // 클래스 배열을 jsp로 전달
        req.setAttribute("data", data);
        
        RequestDispatcher rd = req.getRequestDispatcher("./deliveryok.jsp");
        rd.forward(req, res);
    }
}












