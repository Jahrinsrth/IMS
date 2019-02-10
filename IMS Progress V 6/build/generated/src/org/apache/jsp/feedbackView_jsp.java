package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class feedbackView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"studentView.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"sidenav.css\"> \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/studentnavi.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"\"  >\n");
      out.write("\n");
      out.write("                <div class=\"sidenav\"  style=\"float:left;\">\n");
      out.write("                    <ul>      \n");
      out.write("                        \n");
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
      out.write("        <section>\n");
      out.write("  <h1> Student Feedbacks </h1>\n");
      out.write("  <div class=\"tbl-header\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th> FEEDBACK ID </th>\n");
      out.write("          <th> COURSE </th>\n");
      out.write("          <th> DESCRIPTION </th>\n");
      out.write("          <th> DATE </th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"tbl-content\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("      <tbody>        \n");

  try{
	  
	
          
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims2","root","");
     
    
   
    
    Statement st =  con.createStatement();
    String sql = "Select * from studentFeedback";
    ResultSet rs = st.executeQuery(sql);
    
    while(rs.next()){


      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    <tr>\n");
      out.write("      \n");
      out.write("        <td> ");
      out.print(rs.getString("feedbackID") );
      out.write("  </td>\n");
      out.write("        <td> ");
      out.print(rs.getString("course"));
      out.write("</td>\n");
      out.write("        <td> ");
      out.print( rs.getString("description"));
      out.write("</td>\n");
      out.write("        <td> ");
      out.print( rs.getString("Date"));
      out.write("</td>\n");
      out.write("        \n");
      out.write("     </tr>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("   \n");

    }
    con.close();
  }
    catch(Exception e){
    	System.out.println("error");
    	
    }
  


      out.write("\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
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
