package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import util.DBConnection;
import java.util.Calendar;

public final class Paysheet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Homestyle.css\">\n");
      out.write("\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"sidenav.css\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                .button {\n");
      out.write("                    display: inline-block;\n");
      out.write("                    width:80px;\n");
      out.write("                    padding: 4px 7px;\n");
      out.write("                    font-size: 15px;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                    text-align: center;\t\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    outline: none;\n");
      out.write("                    color: #fff;\n");
      out.write("                    background-color: #0099ff;\n");
      out.write("                    border: none;\n");
      out.write("                    border-radius: 10px;\n");
      out.write("                    box-shadow: 0 3px #666;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .button:hover {background-color: #00cccc}\n");
      out.write("\n");
      out.write("                .button:active {\n");
      out.write("                    background-color: #3e8e41;\n");
      out.write("                    box-shadow: 0 5px #666;\n");
      out.write("                    transform: translateY(4px);\n");
      out.write("                }\n");
      out.write("                .button4 {border-radius: 12px;}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                body {\n");
      out.write("                    margin: 0;\n");
      out.write("                    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav {\n");
      out.write("                    overflow: hidden;\n");
      out.write("                    background-color: #2196F3;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a {\n");
      out.write("                    float: left;\n");
      out.write("                    display: block;\n");
      out.write("                    color: white;\n");
      out.write("                    text-align: center;\n");
      out.write("                    padding: 14px 16px;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    font-size: 17px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a:hover {\n");
      out.write("                    background-color: #ddd;\n");
      out.write("                    color: black;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a.active {\n");
      out.write("                    background-color: #2196F3;\n");
      out.write("                    color: white;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <style>\n");
      out.write("                input[type=text], select {\n");
      out.write("                    width: 100%;\n");
      out.write("                    padding: 6px 10px;\n");
      out.write("                    margin: 4px 0;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    border: 1px solid #ccc;\n");
      out.write("                    border-radius: 2px;  \n");
      out.write("                }\n");
      out.write("                input[type= number], select {\n");
      out.write("                    width: 100%;\n");
      out.write("                    padding: 6px 10px;\n");
      out.write("                    margin: 4px 0;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    border: 1px solid #ccc;\n");
      out.write("                    border-radius: 2px;  \n");
      out.write("                }\n");
      out.write("                input[type=date], select {\n");
      out.write("                    width: 100%;\n");
      out.write("                    padding: 6px 10px;\n");
      out.write("                    margin: 4px 0;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    border: 1px solid #ccc;\n");
      out.write("                    border-radius: 2px;  \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input[type=password], select {\n");
      out.write("                    width: 80%;\n");
      out.write("                    padding: 6px 10px;\n");
      out.write("                    margin: 4px 0;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    border: 1px solid #ccc;\n");
      out.write("                    border-radius: 2px;  \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                textarea {\n");
      out.write("                    width: 100%;\n");
      out.write("                    padding: 6px 10px;\n");
      out.write("                    margin: 4px 0;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    border: 1px solid #ccc;\n");
      out.write("                    border-radius: 4px; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                label {\n");
      out.write("                    padding: 12px 12px 12px 0;\n");
      out.write("                    display: inline-block;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input[type=submit] {\n");
      out.write("                    width: 100%;\n");
      out.write("                    background-color: #0099ff;\n");
      out.write("                    color: white;\n");
      out.write("                    padding: 10px 10px;\n");
      out.write("                    border: none;\n");
      out.write("                    border-radius: 4px;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input[type=submit]:hover {\n");
      out.write("                    background-color: #008ae6;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input[type=reset] {\n");
      out.write("                    width: 100%;\n");
      out.write("                    background-color: #0099ff;\n");
      out.write("                    color: white;\n");
      out.write("                    padding: 10px 10px;\n");
      out.write("                    border: none;\n");
      out.write("                    border-radius: 4px;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input[type=reset]:hover {\n");
      out.write("                    background-color: #008ae6;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a {\n");
      out.write("                    color:#005c99;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a:link {\n");
      out.write("                    text-decoration: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a:visited {\n");
      out.write("                    text-decoration: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a:hover {\n");
      out.write("                    text-decoration: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                a:active {\n");
      out.write("                    text-decoration: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("            <style>\n");
      out.write("                .customers {\n");
      out.write("                    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("                    width: 100%;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .customers td, .customers th {\n");
      out.write("                    border: 1px solid #ddd;\n");
      out.write("                    padding: 3px;\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("                .customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("                .customers th {\n");
      out.write("                    padding-top: 5px;\n");
      out.write("                    padding-bottom: 5px;\n");
      out.write("                    text-align: left;\n");
      out.write("                    background-color: #008ae6;\n");
      out.write("                    color: white;\n");
      out.write("                    width:100px;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");

            Calendar now = Calendar.getInstance();
            Connection con = null;
            Statement statement = null;
            ResultSet resultSet = null;
        
      out.write("     \n");
      out.write("\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <a href=\"DashBoardManager.jsp\">HOME</a>\n");
      out.write("            <a class=\"active\" href=\"#\">SALARY</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("       <article>\n");
      out.write("              <div class=\"content\">\n");
      out.write("\n");
      out.write("                <div class=\"sidenav\"  style=\"float:left;\">\n");
      out.write("                    <ul>      \n");
      out.write("                        <a href=\"BasicForNew.jsp\">Add Basic Salary</a><br>\n");
      out.write("                        <a href=\"AddBonusSalary.jsp\">Add Bonus & Deductions</a><br>\n");
      out.write("                        <a href=\"Paysheet.jsp\"  style=\"color:red;\">Calculate & Paysheet</a><br>\n");
      out.write("                        <a href=\"PaySlip.jsp\">PaySlip</a><br>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <aside class=\"h\"  >\n");
      out.write("                <h1 style=\"background-color: lightblue; padding: 5px; display: block; font:Arial; font-size: 20px;\"><b>Calculate & view Paysheet</b></h1><br>\n");
      out.write("              \n");
      out.write("                <table>\n");
      out.write("\n");
      out.write("                    <tr> <form name=\"form\" action=\"CalculateServlet\" method=\"post\">\n");
      out.write("                        <td>Year</td>\n");
      out.write("                        <td><input type=\"text\" name=\"year\" pattern=\"[0-9\\s]+\" placeholder=\"Enter Current Year\" required></td>\n");
      out.write("                        <td>Month</td>\n");
      out.write("                        <td><input type=\"text\" name=\"month\" pattern=\"[A-Za-z\\s]+\" placeholder=\"Enter Current Month\" required></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Calculate & View\"> </td>\n");
      out.write("                    </form>\n");
      out.write("                    <td> &nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("                    <td><form name=\"form\" action=\"paysheetReportServlet\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"year\" value=\"");
      out.print(request.getAttribute("year"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"month\" value=\"");
      out.print(request.getAttribute("month"));
      out.write("\">\n");
      out.write("                            <input type=\"submit\" value=\"Generate Paysheet\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                            <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <table class=\"customers\" >\n");
      out.write("\n");
      out.write("                    <tr >\n");
      out.write("                        <th>Emp No</th>\n");
      out.write("                        <th>Designation </th>\n");
      out.write("                        <th>Basic Salary </th>\n");
      out.write("                        <th>EPF (8%) </th>\n");
      out.write("                        <th>Gross Salary (Basic + Incentive)</th>\n");
      out.write("                        <th>Balance Salary </th>\n");
      out.write("                        <th>OT Amount</th>\n");
      out.write("                        <th>Gross Amount (Bal. Sal + OT Sal)</th>\n");
      out.write("                        <th>Net Salary (Gross Am. + Festival)</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        try {

                            con = DBConnection.createConnection();
                            statement = con.createStatement();
                            String sql = " select * from salary s,employee e where (s.EID = e.userID) AND ( s.year='" + request.getAttribute("year") + "') AND (s.month = '" + request.getAttribute("month") + "') group by s.EID";

                            resultSet = statement.executeQuery(sql);
                            while (resultSet.next()) {


                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.EID"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("e.EmpType"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.basic_salary"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.EPF"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.gross_salary"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.balance_sal"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.OT"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.gross_Amt"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(resultSet.getString("s.net_salary"));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    
      out.write(" \n");
      out.write("                </table>\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </aside>\n");
      out.write("        </article> \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/footer.jsp", out, false);
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
