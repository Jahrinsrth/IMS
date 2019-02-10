package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.DBConnection;
import java.sql.*;

public final class studentView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                width:90px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("        ");

            Connection con = null;


        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/studentnavi.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"\"  >\n");
      out.write("\n");
      out.write("                <div class=\"sidenav\"  style=\"float:left;\">\n");
      out.write("                    <ul>      \n");
      out.write("                        \n");
      out.write("                        <a href=\"studentView.jsp\">View Registered Students</a>\n");
      out.write("                        <a href=\"studentEdit.jsp\">Edit & Update</a>\n");
      out.write("                        <a href=\"studentDelete.jsp\">Delete</a>\n");
      out.write("                        <form action=\"studentReport\" method=\"post\" >\n");
      out.write("                            <input type=\"submit\" value=\"Generate Report\">\n");
      out.write("                            \n");
      out.write("                        </form>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div   class=\"\"  style=\"float:left;padding-left: 100px;padding-top: 40px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <table class=\"customers\"  >\n");
      out.write("                    <tr>\n");
      out.write("                        <th> Student ID </th>\n");
      out.write("                        <th> Student Name </th>\n");
      out.write("                        <th> Address </th>\n");
      out.write("                        <th> Contact Number </th>\n");
      out.write("                        <th> Email </th>\n");
      out.write("                        <th> NIC </th>\n");
      out.write("                        <th> Course Code </th>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
    try {

                            con = DBConnection.createConnection();

                            Statement st = con.createStatement();
                            String sql = "Select * from student";
                            ResultSet rs = st.executeQuery(sql);

                            while (rs.next()) {

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td> ");
      out.print(rs.getString("userID"));
      out.write("  </td>\n");
      out.write("                        <td> ");
      out.print(rs.getString("fullname"));
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print( rs.getString("address"));
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print( rs.getString("contactNum"));
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(rs.getString("NIC"));
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(rs.getString("courseCode"));
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                            }
                            con.close();
                        } catch (Exception e) {
                            System.out.println("error");

                        }


                    
      out.write("\n");
      out.write("                </table\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
