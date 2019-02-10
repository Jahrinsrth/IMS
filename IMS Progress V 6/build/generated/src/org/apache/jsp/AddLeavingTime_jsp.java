package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import java.sql.Connection;
import java.util.Calendar;

public final class AddLeavingTime_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sidenav.css\"> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/attendancenavi.jsp", out, false);
      out.write("\n");
      out.write("        ");

            Calendar now = Calendar.getInstance();


        
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2  style=\"color:black;background-color:lightblue\"> Add Leaving Time & OT Time </h2>\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form name=\"form\" action=\"addLeaveTimeServlet\" method=\"post\">\n");
      out.write("            <table cellpadding=\"7\" align=\"center\">\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Employee No</td>\n");
      out.write("                    <td><input type=\"text\" name=\"empNo\" required></td>\n");
      out.write("\n");
      out.write("                    <td>Year</td>\n");
      out.write("                    <td><input type=\"number\" name=\"year\" value=\"");
      out.print(now.get(Calendar.YEAR));
      out.write("\" readonly></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Month</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"month\" value=\"");
      out.print(now.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
      out.write("\" readonly></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Date</td>\n");
      out.write("                    <td><input type=\"number\" name=\"date\" value=\"");
      out.print(now.get(Calendar.DATE));
      out.write("\" readonly></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Leaving Time</td>\n");
      out.write("                    <td><input type=\"time\" name=\"Ltime\" required></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Full OT Hours</td>\n");
      out.write("                    <td><input type=\"number\" name=\"otHours\" required></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Add\" ></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"reset\" value=\"reset\" ></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                <br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
