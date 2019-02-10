package org.apache.jsp.Finance;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import util.DBConnection;

public final class viewUtilityBillDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            Connection con = null;
            
            ResultSet resultSet = null;
            ResultSet resultSet1 = null;
            ResultSet resultSet2 = null;
        
      out.write("     \n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("        <input type=\"text\" id=\"year\" name=\"year\"/>\n");
      out.write("        <input type=\"text\" id=\"month\" name=\"month\"/>\n");
      out.write("        <select name=\"types\" id=\"types\">\n");
      out.write("            <option>electricity</option>\n");
      out.write("            <option>telephone</option>\n");
      out.write("            <option>rent</option>\n");
      out.write("            <option>others</option>\n");
      out.write("        </select>\n");
      out.write("        <button type=\"submit\" name=\"btn\" value=\"submit\">Hutto</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            try {
                String year = request.getParameter("year").toString();
                String month = request.getParameter("month").toString();
                String types = request.getParameter("types").toString();
                
                con = DBConnection.createConnection();
                
                PreparedStatement  tsql = con.prepareStatement("  SELECT SUM(amount) FROM utility_bill ub WHERE ub.year= ? ");
                PreparedStatement  tsql1 = con.prepareStatement(" SELECT SUM(amount) FROM utility_bill ub WHERE ub.month= ? ");
                PreparedStatement  tsql2 = con.prepareStatement(" SELECT SUM(amount) FROM utility_bill ub WHERE ub.type= ? ");
                tsql.setString(1, year);
                tsql1.setString(1, month);
                tsql2.setString(1, types);

                
                resultSet = tsql.executeQuery();
                resultSet1 = tsql1.executeQuery();
                resultSet2 = tsql2.executeQuery();

        
      out.write("\n");
      out.write("\n");
      out.write("        ");
while (resultSet.next()) {
      out.write("\n");
      out.write("\n");
      out.write("        <h1>");
      out.print(resultSet.getString("SUM(amount)"));
      out.write("</h1>\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
while (resultSet1.next()) {
      out.write("\n");
      out.write("\n");
      out.write("        <h1>");
      out.print(resultSet1.getString("SUM(amount)"));
      out.write("</h1>\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
while (resultSet2.next()) {
      out.write("\n");
      out.write("\n");
      out.write("        <h1>");
      out.print(resultSet2.getString("SUM(amount)"));
      out.write("</h1>\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

                

            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("     \n");
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
