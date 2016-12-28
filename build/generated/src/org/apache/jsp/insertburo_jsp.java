package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertburo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"insertburo\" method=\"post\" action=\"BurocAction.do\">\n");
      out.write("            <input type=\"hidden\" name=\"todo\"/>\n");
      out.write("          รหัสประจำตัวประชาชน  <input type=\"text\" name=\"br_Code\"/><br>\n");
      out.write("          เลขที่บัญชี  <input type=\"text\" name=\"br_Account\"/><br>\n");
      out.write("          ธนาคาร \n");
      out.write("          <select name=\"br_Bank\">\n");
      out.write("  <option value=\"ธนาคารกรุงเทพ\">ธนาคารกรุงเทพ</option>\n");
      out.write("  <option value=\"ธนาคารกรุงศรีอยุธยา\t\">ธนาคารกรุงศรีอยุธยา</option>\n");
      out.write("  <option value=\"ธนาคารกสิกรไทย\">ธนาคารกสิกรไทย</option>\n");
      out.write("  <option value=\"ธนาคารเกียรตินาคิน\">ธนาคารเกียรตินาคิน</option>\n");
      out.write("    <option value=\"ธนาคารซีไอเอ็มบีไทย\">ธนาคารซีไอเอ็มบีไทย</option>\n");
      out.write("  <option value=\"ธนาคารทหารไทย\">ธนาคารทหารไทย</option>\n");
      out.write("  <option value=\"ธนาคารทิสโก้\">ธนาคารทิสโก้</option>\n");
      out.write("  <option value=\"ธนาคารไทยพาณิชย์\">ธนาคารไทยพาณิชย์</option>  \n");
      out.write("  <option value=\"ธนาคารไทยเครดิตเพื่อรายย่อย\">ธนาคารไทยเครดิตเพื่อรายย่อย</option>\n");
      out.write("  <option value=\"ธนาคารธนชาต\">ธนาคารธนชาต</option>\n");
      out.write("  <option value=\"ธนาคารยูโอบี\">ธนาคารยูโอบี</option>  <\n");
      out.write("  <option value=\"ธนาคารแลนด์ แอนด์ เฮาส์\">ธนาคารแลนด์ แอนด์ เฮาส์</option>\n");
      out.write("  <option value=\"ธนาคารสแตนดาร์ดชาร์เตอร์ด(ไทย)\">ธนาคารสแตนดาร์ดชาร์เตอร์ด(ไทย)</option>\n");
      out.write("  <option value=\"ธนาคารกรุงไทย\">ธนาคารกรุงไทย</option> \n");
      out.write("  <option value=\"ธนาคารพัฒนาวิสาหกิจขนาดกลางและขนาดย่อมแห่งประเทศไทย\">ธนาคารพัฒนาวิสาหกิจขนาดกลางและขนาดย่อมแห่งประเทศไทย</option>\n");
      out.write("  <option value=\"ธนาคารเพื่อการเกษตรและสหกรณ์การเกษตร\">ธนาคารเพื่อการเกษตรและสหกรณ์การเกษตร</option>\n");
      out.write("  <option value=\"ธนาคารเพื่อการส่งออกและนำเข้าแห่งประเทศไทย\">ธนาคารเพื่อการส่งออกและนำเข้าแห่งประเทศไทย</option>  \n");
      out.write("  <option value=\"ธนาคารออมสิน\">ธนาคารออมสิน</option>\n");
      out.write("  <option value=\"ธนาคารอาคารสงเคราะห์\">ธนาคารอาคารสงเคราะห์</option>\n");
      out.write("  <option value=\"ธนาคารอิสลามแห่งประเทศไทย\">ธนาคารอิสลามแห่งประเทศไทย</option> \n");
      out.write("  <option value=\"ธนาคารไอซีบีซี(ไทย)\">ธนาคารไอซีบีซี(ไทย)</option>  \n");
      out.write("  \n");
      out.write("</select><br>\n");
      out.write("          ชื่อ  <input type=\"text\" name=\"br_Name\"/>\n");
      out.write("          สกุล  <input type=\"text\" name=\"br_Lastname\"/><br>\n");
      out.write("          ยอดค้างชำระ  <input type=\"text\" name=\"br_Total\"/><br>\n");
      out.write("          <button onclick=\"seve('')\">บันทึก</button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function seve(todo){\n");
      out.write("            document.insertburo.todo.value = todo;\n");
      out.write("            document.insertburo.submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
