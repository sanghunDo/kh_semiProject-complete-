/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-15 10:21:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	//전송된 쿠키확인
	boolean saveId = false;
	String userId = "";
	Cookie[] cookies = request.getCookies(); // 배열 타입을 리턴한다.
	// System.out.println("브라우저가 전송한 쿠키목록@header.jsp");
	// System.out.println("-------------------------------------");
	for(Cookie c : cookies){
		String key = c.getName();
		String value = c.getValue();
	// System.out.printf("%s = %s\n", key, value);
		if("saveId".equals(key)){
			saveId = true;
			userId = value;
		}
	}


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>You Can't Escape..</title>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Serif+KR\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Amatic+SC\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/member/login.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function loginValidate(){\r\n");
      out.write("\tif($(\"#userId\").val().trim().length == 0){\r\n");
      out.write("\t\talert(\"아이디를 입력하세요.\");\r\n");
      out.write("\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\treturn false; // 폼 전송 방지\r\n");
      out.write("\t}\r\n");
      out.write("\tif($(\"#userPassword\").val().trim().length == 0){\r\n");
      out.write("\t\talert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t$(\"#userPassword\").focus();\r\n");
      out.write("\t\treturn false; // 폼 전송 방지\r\n");
      out.write("\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 로그인 -->\r\n");
      out.write("<div id=\"logo\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/home'\">Escape, if you can.</div>\r\n");
      out.write("<div class=\"login-Container\">\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/member/loginEnd\" method=\"post\" id=\"loginFrm\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr><td><input type=\"text\" name=\"userId\" id=\"userId\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(userId );
      out.write("\" placeholder=\"아이디를 입력하세요.\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td><input type=\"password\" name=\"userPassword\" id=\"userPassword\"\r\n");
      out.write("\t\t\t\tplaceholder=\"비밀번호를 입력하세요.\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td><input type=\"checkbox\" name=\"saveId\" id=\"saveId\" ");
      out.print(saveId?"checked":"" );
      out.write(" />\r\n");
      out.write("\t\t\t\t<label for=\"saveId\" id=\"label-saveId\">SAVE ID</label></td></tr>\t\t\t\r\n");
      out.write("\t\t\t<tr><td><input type=\"submit\" value=\"LOGIN\" \r\n");
      out.write("\t\t\t\tid=\"submit-Btn\" onclick=\"return loginValidate();\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td><input type=\"button\" value=\"JOIN US\"\r\n");
      out.write("\t\t\t\tid=\"register-Btn\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/member/memberRegister'\" /></td></tr>\r\n");
      out.write("\t\t\t<tr><td><input type=\"button\" value=\"FIND ID\" \r\n");
      out.write("\t\t\t\tid=\"findId-Btn\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/member/findId'\"/>\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"FIND PW\" \r\n");
      out.write("\t\t\t\tid=\"findPw-Btn\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/member/findPw'\"/>\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
