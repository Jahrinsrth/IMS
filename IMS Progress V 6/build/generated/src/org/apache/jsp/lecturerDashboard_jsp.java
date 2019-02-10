package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lecturerDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .socialMedia\n");
      out.write("            {\n");
      out.write("                background-color:#333;\n");
      out.write("                color:white;\n");
      out.write("                padding:07%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:link {\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 25px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/LectNAV.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <table border=\"0\" cellpadding=\"10\" style=\"width: 80%; margin-left: 20px;\" class=\"dashboard\">\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td><a href=\"\"><img src=\"IMG/time_1.jpg\" width=\"209\" height=\"223\" /></a></td> &nbsp&nbsp&nbsp&nbsp\n");
      out.write("                    <td><a href=\"\"><img src=\"IMG/timetable.png\" width=\"209\" height=\"223\" /></a></td> &nbsp&nbsp&nbsp&nbsp\n");
      out.write("                    <td><a href=\"LectBooksView.jsp\"><img src=\"IMG/book.png\" width=\"209\" height=\"223\" /></a></td> &nbsp&nbsp&nbsp&nbsp\n");
      out.write("                    <td><a href=\"ViewAttendance.jsp\"><img src=\"IMG/lec.png\" width=\"209\" height=\"223\" /></a></td> &nbsp&nbsp&nbsp&nbsp\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tText\">\n");
      out.write("\n");
      out.write("                    <td> <a href=\"\"><b> TimeTable </b></a> </td>\n");
      out.write("                    <td> <a href=\"\"><b> Results</b></a> </td>\n");
      out.write("                    <td> <a href=\"LectBooksView.jsp\"><b> Library</b></a> </td>\n");
      out.write("                    <td> <a href=\"ViewAttendance.jsp\"><b> Attendance</b> </a> </td>\n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
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
