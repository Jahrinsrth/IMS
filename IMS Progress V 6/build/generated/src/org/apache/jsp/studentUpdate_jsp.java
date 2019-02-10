package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.DBConnection;
import java.sql.*;

public final class studentUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("        ");


            String userID = request.getParameter("userID");
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

        
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
      out.write("\n");
      out.write("                        <a href=\"studentView.jsp\">View Registered Students</a>\n");
      out.write("                        <a href=\"studentEdit.jsp\">Edit & Update</a>\n");
      out.write("                        <a href=\"studentDelete.jsp\">Delete</a>\n");
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
      out.write("                <h><b> UPDATE THE STUDENT </b></h>\n");
      out.write("                <form method=\"post\" action=\"updateStudent\">\n");
      out.write("\n");
      out.write("                    <table  align=\"center\" cellpadding=\"5\">\n");
      out.write("                        ");
     try {
                                connection = DBConnection.createConnection();
                                statement = connection.createStatement();
                                String sql = "SELECT * FROM  student s,login l where l.userType='Student' AND s.userID='" + userID + "'";

                                resultSet = statement.executeQuery(sql);
                                while (resultSet.next()) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td> <input type=\"hidden\" name=\"user\" style=\"width: 250px;\" value=\"");
      out.print(resultSet.getString("s.userID"));
      out.write("\"readonly> </td>\n");
      out.write("\n");
      out.write("<!-- <td> <input type=\"text\" name=\"user\" style=\"width: 250px;\" value=\"");
      out.print(userID);
      out.write("\"readonly> </td>\n");
      out.write("                            -->\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Full Name </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"fullName\" style=\"width: 250px;\" value=\"");
      out.print(resultSet.getString("s.fullName"));
      out.write("\" > </td>\n");
      out.write("                            <td> Address </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"address\" style=\"width: 250px;\" value=\"");
      out.print(resultSet.getString("s.address"));
      out.write("\"> </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Contact Number </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"contactNumber\" style=\"width: 250px;\" value=\"");
      out.print(resultSet.getString("s.contactNum"));
      out.write("\" > </td>\n");
      out.write("                            \n");
      out.write("                            <td> Email </td>\n");
      out.write("                            <td> <input type=\"email\" name=\"email\" style=\"width: 270px;\" value=\"");
      out.print(resultSet.getString("s.email"));
      out.write("\">\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                        <td> ParentName </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"pname\" style=\"width: 250px;\" value=\"");
      out.print(resultSet.getString("s.parentName"));
      out.write("\"> </td>\n");
      out.write("                        <td> Working Place </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"wpaddress\" style=\"width:250px;\" value=\"");
      out.print(resultSet.getString("s.p_WorkingPlace"));
      out.write("\"> </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Working Place Telephone </td>\n");
      out.write("                            <td> <input type=\"text\" name=\"pcontactno\" style=\"width:250px;\" value=\"");
      out.print(resultSet.getString("s.w_Telephone"));
      out.write("\"> </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                                }
                                connection.close();
                            } catch (Exception e) {

                                e.printStackTrace();
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td> </td>\n");
      out.write("                            <td> <input type=\"submit\" value=\"update\"> </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>    \n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
