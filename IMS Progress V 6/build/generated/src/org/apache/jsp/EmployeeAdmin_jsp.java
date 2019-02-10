package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <hr color=\"blue\">\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <img src=\"IMG/Employee.png\" width=\"200\" height=\"200\">\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <table border=\"0\" style=\"width: 80%; margin-left: 50px; text-align: center\" >\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"EmployeeNonAcademic.jsp\">\n");
      out.write("                            <input type=\"submit\" value=\"INSERT & EDIT EMPLOYEE DETAILS\" name=\"insert\"/>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <a href=\"AddInterviewResult.jsp\">\n");
      out.write("                            <input type=\"submit\" value=\"ADD EMPLOYEE INTERVIEW RESULT\" name=\"insert\" />\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <a>\n");
      out.write("                        <form action=\"EmployeeReportServlet\" method=\"POST\">\n");
      out.write("                            <input type=\"submit\" value=\"Generate Report\">\n");
      out.write("                        </form>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <footer class=\"socialMedia\">\n");
      out.write("        <div style=\"float:left\">\n");
      out.write("            MINDRICH College of Management Studies </br>\n");
      out.write("            Second Lane</br>\n");
      out.write("            Dehiwala </br>\n");
      out.write("            011 2 301904 \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"float:right\">\n");
      out.write("            <a href=\"https://www.facebook.com/\" style=\"text-decoration:none\"> <img src=\"IMG/facebook-5-xxl.png\" width=\"40px\"> </a>\n");
      out.write("            <a href=\"https://www.instagram.com/\" style=\"text-decoration:none\"> <img src=\"IMG/instagram-5-xxl.png\" width=\"40px\"> </a>\n");
      out.write("            <a href=\"https://plus.google.com/\" style=\"text-decoration:none\"> <img src=\"IMG/google-plus-5-xxl.png\" width=\"40px\"> </a>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
