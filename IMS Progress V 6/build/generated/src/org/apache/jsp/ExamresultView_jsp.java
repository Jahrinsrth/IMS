package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.DBConnection;
import java.sql.*;

public final class ExamresultView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"TableStyle.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"formstyle1.css\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sidenavExam.css\">        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"formstyleExam.css\">        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"st1.css\">         \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"formExam.css\">       \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"formExam.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function check() {\n");
      out.write("                if (confirm(\"Are you sure to Delete the row?\")) {\n");
      out.write("                    //do something\n");
      out.write("                    document.getElementById(\"resultform\").action = \"./resultdelete\";\n");
      out.write("                    document.getElementById(\"resultform\").method = \"POST\";\n");
      out.write("                    document.getElementById(\"resultform\").submit();\n");
      out.write("                } else {\n");
      out.write("                    //do something\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .topnav {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #2196F3;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a {\n");
      out.write("                float: left;\n");
      out.write("                display: block;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a:hover {\n");
      out.write("                background-color: #2196F3;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a.active {\n");
      out.write("                background-color: gray;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        ");


            Connection con = null;
            Statement statement = null;
            ResultSet resultSet = null;

        
      out.write("\n");
      out.write("\n");
      out.write("        <!--header section-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            \n");
      out.write("            <!--navigation tab on top-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/stuNAV.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("\n");
      out.write("                <div class=\"wrapper\" style=\"height: 500px; width: 1075px; padding-left: 16px; padding-right: 16px; border-left-width: 16px;\">\n");
      out.write("\n");
      out.write("                    <h2 style=\"color:black;background:linear-gradient(yellow, greenyellow);height:40px; width: 100%;height: 55px;\">Results</h2>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <table id=\"customers\">\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th> Student ID</th>\n");
      out.write("                        <th> Subject Name</th>\n");
      out.write("                        <th> Marks</th> \n");
      out.write("                        <!--                    <th colspan=\"2\"> Action</th>-->\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        try {

                            con = DBConnection.createConnection();
                            statement = con.createStatement();
                            
                            String sql = "Select * from `result`";
                            ResultSet rs = statement.executeQuery(sql);

                            while (rs.next()) {

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(rs.getString("studentID"));
      out.write("  </td>\n");
      out.write("                        <td> ");
      out.print( rs.getString("Subject_name"));
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(rs.getString("marks"));
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--                    <td><a href=\"resultupdate.jsp?studentID=");
      out.print(rs.getString("studentID"));
      out.write("\">Update</a></td>\n");
      out.write("\n");
      out.write("                <form  action=\"resultdelete\"  method=\"post\" id=\"resultform\">\n");
      out.write("                    <td>      \n");
      out.write("                        <input type=\"hidden\" name=\"studentID\"  hidden value=\"");
      out.print(rs.getString("studentID"));
      out.write("\">\n");
      out.write("                        <input type=\"submit\"  value=\"Delete\" onclick=\"check()\">\n");
      out.write("                    </td>\n");
      out.write("                </form>-->\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                            }
                            con.close();
                        } catch (Exception e) {
                            System.out.println("error");
                        }
                    
      out.write("\n");
      out.write("                </table\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
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
