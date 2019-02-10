package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidenav1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script>\n");
      out.write("            function courseValidate() {\n");
      out.write("                var cname = document.forms[\"resourceForm\"][\"cname\"].value;\n");
      out.write("                var ccode = document.forms[\"resourceForm\"] [\"code\"].value;\n");
      out.write("                var sdate = document.forms[\"resourceForm\"][\"stdate\"].value;\n");
      out.write("                var fee = document.forms[\"resourceForm\"] [\"fee\"].value;\n");
      out.write("                var duration = document.forms[\"resourceForm\"] [\"duration\"].value;\n");
      out.write("                var subject = document.forms[\"resourceForm\"] [\"subjects\"].value;\n");
      out.write("                var descrip = document.forms[\"resourceForm\"] [\"description\"];\n");
      out.write("\n");
      out.write("                if (cname === null || cname === \"\") {\n");
      out.write("                    alert(\"Please enter course name\");\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    return true;\n");
      out.write("\n");
      out.write("                if (ccode === null || ccode === \"\") {\n");
      out.write("                    alert(\"Please enter the course code with length 4\");\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    return true;\n");
      out.write("\n");
      out.write("                if (sdate === null || sdate === \"\") {\n");
      out.write("                    alert(\"Please enter the Start Date\");\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    return true;\n");
      out.write("\n");
      out.write("                if (fee === null || fee === \"\") {\n");
      out.write("                    alert(\"Please enter the course fee\");\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    return true;\n");
      out.write("\n");
      out.write("                if (duration === null || duration === \"\") {\n");
      out.write("                    alert(\"Please enter the duration\");\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    return true;\n");
      out.write("\n");
      out.write("                if (subject === null || subject === \"\") {\n");
      out.write("                    alert(\"Please enter the subject\");\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    return true;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  if (descrip === null || descrip === \"\") {\n");
      out.write("                    alert(\"Please enter the description\");\n");
      out.write("                    return false;\n");
      out.write("                } else\n");
      out.write("                    return true;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"formstyle.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sidenav.css\"> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title></title>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header1.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/coursenavi.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
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
      out.write("            <div   class=\"\"  style=\"float:right;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form action=\"courseadd\"  method=\"post\"   name=\"resourceForm\"  >\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <div  style=\"float:left;padding-left: 0px;padding-bottom: 15px;padding-top: 20px;\">\n");
      out.write("                            <label style=\"width:143px;\">  Enter course name </label>\n");
      out.write("                            <input type=\"text\" name=\"cname\"\tplaceholder=\"Name of the course \" style=\"height: 35px\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div  style=\"float:right;padding-right:  170px;padding-bottom: 15px;padding-top: 20px;\">\n");
      out.write("                            <label style=\"width:160px;\">  Enter the course code </label>\n");
      out.write("                            <input type=\"text\" name=\"code\" placeholder=\" Course code\" style=\"height: 35px\">\n");
      out.write("                        </div>\t\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <div  style=\"float:left;padding-left: 0px;padding-bottom: 20px;\">\n");
      out.write("                            <label  style=\"width:170px;\" >  Enter the start date </label>\n");
      out.write("                            <input type=\"date\" name=\"stdate\" placeholder=\"Course start date\" style=\"height: 35px\" >\n");
      out.write("                        </div>  \n");
      out.write("                        \n");
      out.write("                        <div  style=\"float:right;padding-right:  170px;padding-bottom: 20px;\">\n");
      out.write("                            <label  style=\"width:160px;\"  >  Enter the course Fee</label>\n");
      out.write("                            <input type=\"text\" name=\"fee\"placeholder=\" Fee\" style=\"height: 35px\">\n");
      out.write("                        </div>\t\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <div  style=\"float:left;padding-left: 0px;padding-bottom: 15px;padding-right: 50px;\">\n");
      out.write("                            <label style=\"width:140px;padding-left:0px;\">  Enter the duration </label>\n");
      out.write("                            <input type=\"text\" name=\"duration\"\tplaceholder=\"No of years \" style=\"height: 35px\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div  style=\"float:right;padding-right:  170px;padding-bottom: 15px;\">\n");
      out.write("                            <label  style=\"width:160px;\">  Number of subjects </label>\n");
      out.write("                            <input type=\"text\" name=\"subjects\" placeholder=\" Subjects\" style=\"height: 35px\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("          \n");
      out.write("\n");
      out.write("                 <input type=\"text\" name=\"description\" placeholder=\"Course description\" style=\"height: 50px;width:780px\">\n");
      out.write("                 \n");
      out.write("              \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div  style=\"padding-left: 5px;\">\n");
      out.write("                        <input type=\"submit\" value=\"Submit\"    onclick=\"return courseValidate()\" style=\"width:250px\" > \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
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
