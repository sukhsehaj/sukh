package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Student Details</title>\r\n");
      out.write("        <script src=\"js/jquery-1.12.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700,100' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">    \r\n");
      out.write("       \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body style=\"background-color: black\">\r\n");
      out.write("       \r\n");
      out.write("    <center>\r\n");
      out.write("        <form action=\"Customer\" method=\"post\" >\r\n");
      out.write("            <br>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <h1 style=\"color: orange\">PLEASE ENTER STUDENT DETAILS</h1>   \r\n");
      out.write("                    <tr><td><div class=\"form-group\">\r\n");
      out.write("                                <label>Name</label>\r\n");
      out.write("                                <input type=\"text\" style=\"text-align: center\" class=\"form-control\" placeholder=\"Name\" required name=\"name\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    <tr><td><div class=\"form-group\">\r\n");
      out.write("                                <label>Address</label>\r\n");
      out.write("                                <input type=\"text\" style=\"text-align: center\" class=\"form-control\" placeholder=\"Address\" required name=\"address\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr><td><div class=\"form-group\">\r\n");
      out.write("                                <label>Phone No</label>\r\n");
      out.write("                                <input type=\"text\" style=\"text-align: center\" class=\"form-control\" name=\"mobile\" placeholder=\"Phone Number\" required maxlength=\"10\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr><td><div class=\"form-group\">\r\n");
      out.write("                                <label>Email Address</label>\r\n");
      out.write("                                <input type=\"email\" style=\"text-align: center\" class=\"form-control\" name=\"emailid\" placeholder=\"Email Addrress\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr> \r\n");
      out.write("\r\n");
      out.write("                    <tr><td><div class=\"form-group\">\r\n");
      out.write("                                <input class=\"form-control btn-primary\" type=\"submit\" value=\"Submit\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                             </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </table>            \r\n");
      out.write("        </form>\r\n");
      out.write("         \r\n");
      out.write("    </center>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
