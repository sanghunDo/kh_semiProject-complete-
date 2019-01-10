/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-09 20:36:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updatePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String userId = request.getParameter("userId");
	System.out.println("userId@updatePassword.jsp=" + userId);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원 비밀번호 변경</title>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Amatic+SC\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("div#updatePassword-Container{\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#updatePassword-Container table{\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tborder-spacing: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#updatePassword-Container table tr:last-of-type td{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction passwordValidate() {\r\n");
      out.write("\t\tvar $userId = $(\"#userId\");\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar $userPassword = $(\"#userPassword\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar $userPassword_New = $(\"#userPassword_New\"); // 유저 비밀번호\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar $userPassword_Check = $(\"#userPassword_Check\"); // 비교할 유저 비밀번호\r\n");
      out.write("\t\tvar getUserPassword = RegExp(/^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{5,19}$/); // 유저 비밀번호 유효성 검사\r\n");
      out.write("\t\r\n");
      out.write("\t\tconsole.log(\"유저아이디 : \", $userId.val());\r\n");
      out.write("\t\tconsole.log(\"뉴저패스워드 : \", $userPassword_New.val());\r\n");
      out.write("\t\tconsole.log(\"유저패스워드 : \", $userPassword.val());\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 비밀번호 공백 확인\r\n");
      out.write("\t\tif ($userPassword_New.val() == \"\") {\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("\t\t\t$userPassword_New.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 아이디와 비밀번호 같은지 확인\r\n");
      out.write("\t\tif ($userId.val() == $userPassword_New.val()) {\r\n");
      out.write("\t\t\talert(\"아이디와 비밀번호가 같습니다.\");\r\n");
      out.write("\t\t\t$userPassword_New.val(\"\");\r\n");
      out.write("\t\t\t$userPassword_New.focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 비밀번호 유효성 검사\r\n");
      out.write("\t\tif (!getUserPassword.test($userPassword_New.val())) {\r\n");
      out.write("\t\t\talert(\"비밀번호는 영문자와 숫자, 특수 문자를 포함한 6~20 자리로 입력해주세요.\");\r\n");
      out.write("\t\t\t$userPassword_New.val(\"\");\r\n");
      out.write("\t\t\t$userPassword_New.focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 비밀번호 확인란 공백 확인\r\n");
      out.write("\t\tif ($userPassword_Check.val() == \"\") {\r\n");
      out.write("\t\t\talert(\"비밀번호 확인란을 입력해주세요.\");\r\n");
      out.write("\t\t\t$userPassword_Check.focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t// 비밀번호 일치여부 확인\r\n");
      out.write("\t\tif ($userPassword_New.val() != $userPassword_Check.val()) {\r\n");
      out.write("\t\t\talert(\"비밀번호가 다릅니다.\");\r\n");
      out.write("\t\t\t$userPassword_New.val(\"\");\r\n");
      out.write("\t\t\t$userPassword_Check.val(\"\");\r\n");
      out.write("\t\t\t$userPassword_New.focus();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 현재 비밀번호와 일치여부 확인\r\n");
      out.write("\t\tif ($userPassword.val() == $userPassword_New.val()){\r\n");
      out.write("\t\t\talert(\"현재 비밀번호와 같습니다.\");\r\n");
      out.write("\t\t\t$userPassword_New.val(\"\");\r\n");
      out.write("\t\t\t$userPassword_Check.val(\"\");\r\n");
      out.write("\t\t\t$userPassword_New.focus();\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"updatePassword-Container\">\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/member/updatePasswordEnd\"\r\n");
      out.write("\t\t\t  name=\"updatePasswordFrm\"\r\n");
      out.write("\t\t\t  method=\"post\">\r\n");
      out.write("\t\t\t  <input type=\"hidden\" name=\"userId\" id=\"userId\"\r\n");
      out.write("\t\t\t  \t\t value=");
      out.print(userId);
      out.write(" />\r\n");
      out.write("\t\t\t  <table>\r\n");
      out.write("\t\t\t  \t<tr>\r\n");
      out.write("\t\t\t  \t\t<th>현재비밀번호</th>\r\n");
      out.write("\t\t\t  \t\t<td>\r\n");
      out.write("\t\t\t  \t\t\t<input type=\"password\" \r\n");
      out.write("\t\t\t  \t\t\t       name=\"userPassword\" \r\n");
      out.write("\t\t\t  \t\t\t       id=\"userPassword\"\r\n");
      out.write("\t\t\t  \t\t\t       required />\r\n");
      out.write("\t\t\t  \t\t</td>\r\n");
      out.write("\t\t\t  \t</tr>\r\n");
      out.write("\t\t\t  \t<tr>\r\n");
      out.write("\t\t\t  \t\t<th>새 비밀번호</th>\r\n");
      out.write("\t\t\t  \t\t<td>\r\n");
      out.write("\t\t\t  \t\t\t<input type=\"password\" \r\n");
      out.write("\t\t\t  \t\t\t\t   name=\"userPassword_New\" \r\n");
      out.write("\t\t\t  \t\t\t\t   id=\"userPassword_New\"\r\n");
      out.write("\t\t\t  \t\t\t\t   required />\r\n");
      out.write("\t\t\t  \t\t</td>\r\n");
      out.write("\t\t\t  \t</tr>\r\n");
      out.write("\t\t\t  \t<tr>\r\n");
      out.write("\t\t\t  \t\t<th>새 비밀번호 확인</th>\r\n");
      out.write("\t\t\t  \t\t<td>\r\n");
      out.write("\t\t\t  \t\t\t<input type=\"password\" \r\n");
      out.write("\t\t\t  \t\t\t\t   name=\"userPassword_Check\"\r\n");
      out.write("\t\t\t  \t\t\t\t   id=\"userPassword_Check\"\r\n");
      out.write("\t\t\t  \t\t\t\t   required />\r\n");
      out.write("\t\t\t  \t\t</td>\r\n");
      out.write("\t\t\t  \t</tr>\r\n");
      out.write("\t\t\t  \t<tr>\r\n");
      out.write("\t\t\t  \t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t  \t\t\t<input type=\"submit\"\r\n");
      out.write("\t\t\t  \t\t\t\t   onclick=\"return passwordValidate();\"\r\n");
      out.write("\t\t\t  \t\t\t\t   value=\"변경\"\t/>\r\n");
      out.write("\t\t\t  \t\t\t<input type=\"button\"\r\n");
      out.write("\t\t\t  \t\t\t\t   onclick=\"self.close();\"\r\n");
      out.write("\t\t\t  \t\t\t\t   value=\"취소\"\t/>\r\n");
      out.write("\t\t\t  \t\t</td>\t\t\t  \t\t\r\n");
      out.write("\t\t\t  \t</tr>\r\n");
      out.write("\t\t\t  </table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
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
