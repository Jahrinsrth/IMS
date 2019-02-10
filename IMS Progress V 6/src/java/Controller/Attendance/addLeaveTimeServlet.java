/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Attendance;

import Model.EmpAttendance;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.Attendance;

/**
 *
 * @author jahrin
 */
@WebServlet(name = "addLeaveTimeServlet", urlPatterns = {"/addLeaveTimeServlet"})
public class addLeaveTimeServlet extends HttpServlet {

  
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         response.setContentType("text/html");
        
                int emp = Integer.parseInt( request.getParameter("empNo"));
                int year = Integer.parseInt( request.getParameter("year"));
                String month = request.getParameter("month");              
                int date = Integer.parseInt( request.getParameter("date"));
		String Ltime = request.getParameter("Ltime");
                int otHours = Integer.parseInt( request.getParameter("otHours"));
               
        
        
                EmpAttendance ea = new EmpAttendance();
               
                ea.setLtime(Ltime);
                ea.setOtHours(otHours);
                
                
                Attendance a = new Attendance();
                a.addLeaveTime(emp,year,month,date,ea);
                
                request.getRequestDispatcher("/AddEmployeeAtt.jsp").forward(request, response);
                
    }
        
}
 