package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import util.DBConnection;
import java.util.Calendar;

public final class AddEmployeeAtt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sidenav.css\"> \n");
      out.write("\n");
      out.write("        <title>Employee Attendance</title>\t\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                .button {\n");
      out.write("                    display: inline-block;\n");
      out.write("                    width:80px;\n");
      out.write("                    padding: 4px 7px;\n");
      out.write("                    font-size: 15px;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                    text-align: center;\t\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    outline: none;\n");
      out.write("                    color: #fff;\n");
      out.write("                    background-color: #0099ff;\n");
      out.write("                    border: none;\n");
      out.write("                    border-radius: 10px;\n");
      out.write("                    box-shadow: 0 3px #666;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .button:hover {background-color: #00cccc}\n");
      out.write("\n");
      out.write("                .button:active {\n");
      out.write("                    background-color: #3e8e41;\n");
      out.write("                    box-shadow: 0 5px #666;\n");
      out.write("                    transform: translateY(4px);\n");
      out.write("                }\n");
      out.write("                .button4 {border-radius: 12px;}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                body {\n");
      out.write("                    margin: 0;\n");
      out.write("                    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav {\n");
      out.write("                    overflow: hidden;\n");
      out.write("                    background-color: black;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a {\n");
      out.write("                    float: left;\n");
      out.write("                    display: block;\n");
      out.write("                    color: white;\n");
      out.write("                    text-align: center;\n");
      out.write("                    padding: 14px 16px;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    font-size: 17px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a:hover {\n");
      out.write("                    background-color: #ddd;\n");
      out.write("                    color: black;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a.active {\n");
      out.write("                    background-color: #2196F3;\n");
      out.write("                    color: white;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/attendancenavi.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");

            Calendar now = Calendar.getInstance();

            Connection con = null;
            Statement statement = null;
            ResultSet resultSet = null;
        
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <div class=\"sidenav\"  style=\"float:left;\">\n");
      out.write("                <ul>    \n");
      out.write("                    <a href=\"AddStudentAtt.jsp\">Add Student Attendance</a><br>\n");
      out.write("                    <a href=\"AddEmployeeAtt.jsp\">Add Employee Attendance</a><br>\n");
      out.write("                    <a href=\"AddLeavingTime.jsp\">Add Leaving Time</a><br>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("\n");
      out.write("<h2  style=\"color:black;background-color:lightblue\"> Add Employee Attendance </h2>\n");
      out.write("<br>\n");
      out.write("            <form name=\"form\" action=\"addAttTimeServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                <table cellpadding=\"3\" align=\"center\">\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Employee No</td>\n");
      out.write("                        <td><input type=\"text\" name=\"empNo\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Year</td>\n");
      out.write("                        <td><input type=\"number\" name=\"year\" value=\"");
      out.print(now.get(Calendar.YEAR));
      out.write("\" readonly></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Month</td>\n");
      out.write("                        <td><input type=\"text\" name=\"month\" value=\"");
      out.print(now.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
      out.write("\" readonly></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date</td>\n");
      out.write("                        <td><input type=\"number\" name=\"date\" value=\"");
      out.print(now.get(Calendar.DATE));
      out.write("\" readonly></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Attendance Time</td>\n");
      out.write("                        <td><input type=\"time\" name=\"Atime\" required></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Add\" ></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"reset\" ></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
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
