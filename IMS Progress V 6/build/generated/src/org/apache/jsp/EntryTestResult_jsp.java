package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import util.DBConnection;

public final class EntryTestResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"St.css\">\n");
      out.write("        <title>Entry Test Results</title>\n");
      out.write("    <table border=\"0\" style=\"width: 100%; margin-left: 5px; column-width: auto;\">\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"IMG/CaptureNew.PNG\" width=\"500\" height=\"200\" > \n");
      out.write("                    </div>        \n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"IMG/1.png\" width=\"100\" height=\"100\" >\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"login.jsp\"> Login </a>\n");
      out.write("                </td>\n");
      out.write("                <td></td>\n");
      out.write("                <td>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <article> \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            Connection con = null;
            Statement statement = null;
            ResultSet resultSet = null;
        
      out.write("\n");
      out.write("\n");
      out.write("        <article>\n");
      out.write("            <aside class=\"h\">\n");
      out.write("                <h1 style= \"background-color:lightblue; padding: 5px; display: block; font:Arial; font-size: 20px; \" ><b>View Entry Test Result</b></h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h1>Please Enter your NIC </h1>\n");
      out.write("                <br>\n");
      out.write("                <form name=\"form\" action=\"SearchResultServlet\" method=\"post\">\n");
      out.write("                    <table>\n");
      out.write("\n");
      out.write("                        <tr></tr>\n");
      out.write("                        <tr></tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Candidate NIC</td>\n");
      out.write("                            <td><input type=\"text\" name=\"cnic\" required></td>\n");
      out.write("                            <td><input type=\"submit\" value=\"Find\"/> </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                ");

                    try {
                        con = DBConnection.createConnection();
                        statement = con.createStatement();
                        String sql = "SELECT * FROM entrytest where NIC = '" + request.getAttribute("nic") + "'";

                        resultSet = statement.executeQuery(sql);
                        while (resultSet.next()) {
                
      out.write("\n");
      out.write("                <div align=\"left\">\n");
      out.write("\n");
      out.write("                    <table border=\"1\" cellpadding=\"10\">\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>NIC</th>\n");
      out.write("                            <th>Result</th>\n");
      out.write("                            <th>Register</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>");
      out.print(resultSet.getString("name"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("NIC"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(resultSet.getString("test_Result"));
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <td><a href=\"registerStep1.jsp?nic=");
      out.print(resultSet.getString("NIC"));
      out.write("\">Register</a></td> \n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <h1 style=\"color: red;\"> ");
      out.print((request.getAttribute("msg") == null) ? "" : request.getAttribute("msg"));
      out.write(' ');
      out.print((request.getAttribute("msg1") == null) ? "" : request.getAttribute("msg1"));
      out.write(' ');
      out.print((request.getAttribute("msg2") == null) ? "" : request.getAttribute("msg2"));
      out.write("</h1>\n");
      out.write("                <br>\n");
      out.write("                <br><br>\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("        </article>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/footer.jsp", out, false);
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
