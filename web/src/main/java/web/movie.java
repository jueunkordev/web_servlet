package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class movie extends HttpServlet {
    private static final long serialVersionUID = 1L;
    PrintWriter pw = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        try {
            this.pw = response.getWriter();
            String cname = request.getParameter("cname").intern();
            String ctel = request.getParameter("ctel").intern();
            String cmovie = request.getParameter("cmovie").intern();
            String cday = request.getParameter("cday").intern();
            
            if (cname.equals("") || ctel.equals("") || cmovie.equals("") || cday.equals("")) {
                this.pw.write("<script>"
                        + "alert('올바른 값이 전달되지 않았습니다.');"
                        + "history.go(-1);"
                        + "</script>");
            }
            
            request.setAttribute("cname", cname);
            request.setAttribute("ctel", ctel);
            request.setAttribute("cmovie", cmovie);
            request.setAttribute("cday", cday);
            
            RequestDispatcher rd = request.getRequestDispatcher("movie.jsp");
            rd.forward(request, response);
            
        } catch (Exception e) {
        } finally {
                this.pw.close();
        }
    }
}
