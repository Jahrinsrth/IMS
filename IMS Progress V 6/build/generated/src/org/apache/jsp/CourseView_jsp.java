package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.DBConnection;
import java.sql.*;

public final class CourseView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sidenav.css\"> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"TableStyleSheet.css\"> \n");
      out.write("        <title></title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .customers {\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .customers td, .customers th {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("            .customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            .customers th {\n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #008ae6;\n");
      out.write("                color: white;\n");
      out.write("                width:120px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header1.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        Connection con = null;
        Statement statement = null;
        
    
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/coursenavi.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"\"  >\n");
      out.write("\n");
      out.write("            <div class=\"sidenav\"  style=\"float:left;\">\n");
      out.write("                <ul>      \n");
      out.write("                    <a href=\"sidenav1.jsp\">Add course</a>\n");
      out.write("                    <a href=\"courseViewmain.jsp\">View </a>\n");
      out.write("                    <a href=\"CourseView.jsp\">Edit & Update</a>\n");
      out.write("                    <a href=\"delete.jsp\">Delete</a>\n");
      out.write("                    <form action=\"courseReport\" method=\"post\">\n");
      out.write("                        <input type=\"submit\" value=\"Report\">\n");
      out.write("                    </form>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div   class=\"\"  style=\"float:left;padding-left: 100px;padding-top: 40px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <table    class=\"customers\"  >\n");
      out.write("                <tr>\n");
      out.write("                    <th> Course Code </th>\n");
      out.write("                    <th>  Course Name</th> \n");
      out.write("                    <th> Start Date </th>\n");
      out.write("                    <th>  Course Fee</th>\n");
      out.write("                    <th> Duration  </th>\n");
      out.write("                    <th>  No Of Subjects</th>\n");
      out.write("                    <th>  Actions </th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
                    

                        try {
                            con = DBConnection.createConnection();
                            statement = con.createStatement();
                       
                        String sql = "Select * from course";
                        ResultSet rs = statement.executeQuery(sql);

                        while (rs.next()) {

                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("courseCode"));
      out.write("  </td>\n");
      out.write("                    <td> ");
      out.print(rs.getString("courseName"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( rs.getString("startDate"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print( rs.getString("courseFee"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getString("duration"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getString("noOfSubject"));
      out.write("</td>\n");
      out.write("                    <td><a href=\"courseupdate.jsp?code=");
      out.print(rs.getString("courseCode"));
      out.write("\">Edit</a></td> \n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                        }
                        con.close();
                    } catch (Exception e) {
                        System.out.println("error");

                    }


                
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("   </article> \n");
      out.write("        \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
