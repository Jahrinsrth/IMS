package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public final class EmployeeDelete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBConfig.jsp");
  }

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
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            
            String url = "jdbc:mysql://localhost:3306/ims";
            String User = "root";
            String pass = "mjahrin#1srth";

            Connection con = DriverManager.getConnection(url, User, pass);
            
            if (con != null)
                out.print("Connected");
            else
                out.println("Error");
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"sidenav\">\n");
      out.write("            <a href=\"EmployeeNonAcademic.jsp\"> <b>Insert Employee</b></a>\n");
      out.write("            <a href=\"EmpoyeeUpdateTable.jsp\"> <b>Update Employees </b></a>\n");
      out.write("            <a href=\"#\"> <b>Delete Employees </b></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("         <h2>Delete Employee Details</h2>\n");
      out.write("        \n");
      out.write("        ");
 String userID = request.getParameter("eid");
        
           Statement stmt = con.createStatement();
           
           String query = "select * from employee where userID = '"+userID+"'";
           ResultSet rs = stmt.executeQuery(query); 
        
      out.write("\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("      <table id=\"employee\">\n");
      out.write("            <tr>\n");
      out.write("                <th>User ID</th>\n");
      out.write("                <th>Full Name</th>\n");
      out.write("                <th>NIC</th>\n");
      out.write("                <th>Marital Status</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Mobile</th>\n");
      out.write("                <th>Home</th>\n");
      out.write("              \n");
      out.write("                <th>Emp Type</th>\n");
      out.write("                <th>Qualifications</th>\n");
      out.write("                <th>Experience</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                ");
 while (rs.next()) { 
      out.write("\n");
      out.write("                <td>");
      out.print(rs.getString("userID"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("FullName"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("NIC"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("Address"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("MaStatus"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("Email"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("Mobile"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("Home"));
      out.write(" </td>\n");
      out.write("\n");
      out.write("                <td>");
      out.print(rs.getString("EmpType"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("EduQulification"));
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(rs.getString("Experience"));
      out.write(" </td>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("             </table>\n");
      out.write("             \n");
      out.write("             <br>\n");
      out.write("             \n");
      out.write("             <td> DELETE THIS RECORD ? <d>  &nbsp&nbsp&nbsp&nbsp\n");
      out.write("             <td><a href=\"EmployeeFinalDelete.jsp?eid=");
      out.print(userID);
      out.write("\">YES</a></td>\n");
      out.write("          \n");
      out.write("           </center>\n");
      out.write("    </div>\n");
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
