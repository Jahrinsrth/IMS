package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Course_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"formstyle.css\"> \n");
      out.write("         \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>   Add Course</title>\n");
      out.write("        \n");
      out.write("        <script>  \n");
      out.write("                    function courseValidate(){\n");
      out.write("                    var cname =document.forms[\"resourceForm\"][\"cname\"].value;\n");
      out.write("                    var ccode =document.forms[\"resourceForm\"] [\"code\"].value;\n");
      out.write("                    var sdate = document.forms[\"resourceForm\"][\"stdate\"].value;\n");
      out.write("                    var fee =document.forms[\"resourceForm\"] [\"fee\"].value;\n");
      out.write("                    var duration =document.forms[\"resourceForm\"] [\"duration\"].value;\n");
      out.write("                    var subject  =document.forms[\"resourceForm\"] [\"subjects\"].value;\n");
      out.write("            \n");
      out.write("                    \n");
      out.write("                    if (cname=== null || cname===\"\"){\n");
      out.write("                        alert(\"Please enter course name\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                        return true;\n");
      out.write("                    \n");
      out.write("                    if (ccode=== null || ccode===\"\"){\n");
      out.write("                        alert(\"Please enter the course code\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                        return true;\n");
      out.write("                    \n");
      out.write("                    if(sdate=== null || sdate===\"\"){\n");
      out.write("                        alert(\"Please enter the Start Date\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                        return true;\n");
      out.write("                    \n");
      out.write("                    if(fee=== null || fee===\"\"){\n");
      out.write("                        alert(\"Please enter the course fee\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                        return true;\n");
      out.write("                    \n");
      out.write("                    if (duration===null || duration===\"\"){\n");
      out.write("                        alert(\"Please enter the duration\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                        return true;\n");
      out.write("                    \n");
      out.write("                    if(subject=== null || subject===\"\"){\n");
      out.write("                        alert(\"Please enter the subject\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                        return true;\n");
      out.write("                }\n");
      out.write("             </script>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2  style=\"color:black;background-color:yellow\"> Add Course </h2>\n");
      out.write("        <div   class=\"divv\">\n");
      out.write("        <form     action=\"courseadd\"  method=\"post\"   name=\"resourceForm\"  >\n");
      out.write("       \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            <label> Enter the Course Name </label>\n");
      out.write("            <input type=\"text\"   name=\"cname\" placeholder=\"Name of the course \"> \n");
      out.write("           \n");
      out.write("            \n");
      out.write("       \n");
      out.write("                <label>  Enter the course code </label>\n");
      out.write("                <input type=\"text\" name=\"code\" placeholder=\"Course code       (Eg:a111,c222)\">\n");
      out.write("     \n");
      out.write("                                                               \n");
      out.write("\t\n");
      out.write("\n");
      out.write("               <label>     Enter the Start Date  </label>\n");
      out.write("                  <input type=\"date\"  name=\"stdate\" placeholder=\"course start Date\">\n");
      out.write("          \n");
      out.write("                 \n");
      out.write("              \n");
      out.write("             \n");
      out.write("                  <label>   Enter the course Fee </label>\n");
      out.write("                <input type=\"text\" name=\"fee\"  placeholder=\"Fee\">\n");
      out.write("                     \n");
      out.write("                \n");
      out.write("                       <label>  Enter the duration </label>\n");
      out.write("                      <input type =\"text\" name=\"duration\" placeholder=\"No Of years\">\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("               \n");
      out.write("                      <label> Enter the number of subjects  </label>\n");
      out.write("                     <input type=\"text\" name=\"subjects\" placeholder=\"  subjects\">\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("            \n");
      out.write("                     <input type=\"submit\" value=\"Submit\"    onclick=\"return courseValidate()\"> \n");
      out.write("               \n");
      out.write("          \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
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
