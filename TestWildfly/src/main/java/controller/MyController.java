/**
 * 
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.MyBean;
import entity.MyEntity;
import session.MySession;

/**
 * Jun 6, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class MyController extends HttpServlet {
	
	@EJB 
	MySession testBean;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,	IOException {
	         response.setContentType("text/html;charset=UTF-8");
	         MyEntity entity = new MyEntity(22, "test");
                 PrintWriter out = response.getWriter();
                 out.println("<html>");
                 out.println("<head>");
                 out.println("<title>Servlet TestServlet</title>");
                 out.println("</head>");
                 out.println("<body>");
                 out.println(testBean.saveTest(entity));
                 out.println("</body>");
                 out.println("</html>");
         	 }
	

}
