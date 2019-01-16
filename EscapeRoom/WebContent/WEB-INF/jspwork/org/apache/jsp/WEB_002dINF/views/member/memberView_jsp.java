/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-16 06:38:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oreilly.servlet.MultipartRequest;
import java.util.*;
import semi.member.model.vo.*;

public final class memberView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1547573359281L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1547065948004L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("semi.member.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	Member loggedInMember = (Member)session.getAttribute("loggedInMember"); 

      out.write("\r\n");
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>You Can't Escape..</title>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Serif+KR\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Amatic+SC\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common/header.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t<div id=\"myMenu\">\r\n");
      out.write("\t\t\t");
if(loggedInMember == null) {
      out.write("\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/login\">LOGIN</a>\r\n");
      out.write("\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t");
if("admin".equals(loggedInMember.getUserId())){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/adminMode/adminMain\">ADMIN</a>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/memberView?userId=");
      out.print(loggedInMember.getUserId());
      out.write("\">MY PAGE</a>\r\n");
      out.write("                \t&nbsp;&nbsp;\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/logout\">LOGOUT</a>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/home\"><div id=\"logo\">Escape, if you can.</div></a>\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/home\">HOME</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/notice/noticeList\">NOTICE</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/rank/rankingBoardList\">RANKING</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/solve/solveBoardList\">SOLVE</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/free/freeBoardList\">FREE</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"game-start\">\r\n");
      out.write("\t\t\t<button class=\"enter-game\" >ENTER GAME</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(\".enter-game\").click(function(){\r\n");
      out.write("\t\tvar pop;\r\n");
      out.write("\t\tvar url = \"");
      out.print(request.getContextPath());
      out.write("/game/gameStart?userId=");
      out.print(loggedInMember!=null?loggedInMember.getUserId():"guest");
      out.write("\";\r\n");
      out.write("\t\tvar status = \"width=1024px, height=678px\";\r\n");
      out.write("\t\tpop = sessionStorage.getItem(\"game\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(pop || pop != null) {alert(\"이미 게임이 실행중입니다.\"); return;} //팝업창이 열려있는 경우 중복실행 방지.\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tif(");
      out.print(loggedInMember==null);
      out.write("){\r\n");
      out.write("\t\t\tvar check = confirm(\"비로그인 시 랭킹등록이 불가합니다. 계속 진행하시겠습니까?\");\r\n");
      out.write("\t\t\tif(!check){return;}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tpop = open(url, \"game\", status);\r\n");
      out.write("\t\tsessionStorage.setItem(\"game\", pop);\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>");
      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Amatic+SC\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Serif+KR\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/member/memberView.css\" />\r\n");

	/* return타입이 Object이기때문에 형변환 필수 */
	Member m = (Member) request.getAttribute("member");
	String userId_ = m.getUserId();
	System.out.println("멤버뷰jsp 유저아이디 : " + userId_);
	String userPassword = m.getUserPassword();
	String userEmail = m.getUserEmail()!=null?m.getUserEmail():"";
	int coin = m.getCoin();
	String userProfileOriginalFile = m.getUserProfileOriginalFile()!=null?m.getUserProfileOriginalFile():"";	
	String userProfileRenamedFile = m.getUserProfileRenamedFile()!=null?m.getUserProfileRenamedFile():"";

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("/* 회원정보수정 유효성 검사 */\r\n");
      out.write("function updateValidate(){\r\n");
      out.write("\t// 아이디 검사\r\n");
      out.write("\tvar $userId_ = $(\"#userId_\"); // 유저 아이디\r\n");
      out.write("\t\r\n");
      out.write("\t// 비밀번호 검사\r\n");
      out.write("\tvar $userPassword_ = $(\"#userPassword_\"); // 유저 비밀번호\r\n");
      out.write("\tvar $userPassword__ = $(\"#userPassword__\"); // 비교할 유저 비밀번호\r\n");
      out.write("\tvar getUserPassword = RegExp(/^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{5,19}$/); // 유저 비밀번호 유효성 검사\r\n");
      out.write("\r\n");
      out.write("\t// 이메일 검사 \r\n");
      out.write("\tvar $userEmail = $(\"#userEmail\"); // 유저 이메일\r\n");
      out.write("\tvar getUserEmail = RegExp(/^[a-z0-9_+.-]+@([a-z0-9-]+\\.)+[a-z0-9]{2,4}$/); // 유저 이메일 유효성 검사\r\n");
      out.write("\t\r\n");
      out.write("\t// 프로필 검사\r\n");
      out.write("\tvar $userProfileOriginalFile = $(\"#userProfile\"); // 유저 프로필 사진명\r\n");
      out.write("\tvar fileExt = $userProfileOriginalFile.val().substring($userProfileOriginalFile.val().lastIndexOf(\".\") + 1); // 확장자명 구하기 위함\r\n");
      out.write("\tvar getUserProfileOriginalFile = RegExp(/jpg|jpeg|png|gif/i); // 유저 프로필 사진 유효성 검사\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t// 아이디 공백 확인\r\n");
      out.write("\tif($userId_.val() ==\"\"){\r\n");
      out.write("\t\talert(\"아이디를 입력해주세요.\");\r\n");
      out.write("\t\t$userId_.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 아이디 유효성 검사\r\n");
      out.write("\tif(!getUserId.test($userId_.val())){\r\n");
      out.write("\t\talert(\"아이디는 영문자와 숫자를 포함한 5~15 자리로 입력해주세요.\");\r\n");
      out.write("\t\t$userId_.val(\"\");\r\n");
      out.write("\t\t$userId_.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 아이디중복검사여부 체크\r\n");
      out.write("\tvar $idValid = $(\"#idValid\").val();\r\n");
      out.write("\tif($idValid == 0){\r\n");
      out.write("\t\talert(\"아이디 중복검사해주세요.\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// 이메일 공백 확인\r\n");
      out.write("\tif($userEmail.val() == \"\"){\r\n");
      out.write("\t\talert(\"이메일을 입력해주세요.\");\r\n");
      out.write("\t\t$userEmail.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 이메일 유효성 검사\r\n");
      out.write("\tif(!getUserEmail.test($userEmail.val())){\r\n");
      out.write("\t\talert(\"이메일 형식에 맞게 입력해주세요.\");\r\n");
      out.write("\t\t$userEmail.val(\"\");\r\n");
      out.write("\t\t$userEmail.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// 프로필사진 유효성 검사\r\n");
      out.write("\tif(!getUserProfileOriginalFile.test(fileExt) && $userProfileOriginalFile.val().length > 0){\r\n");
      out.write("\t\talert(\"첨부파일은 jpg, jpeg, png, gif로 된 이미지만 가능합니다.\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteMember(){\r\n");
      out.write("\tvar bool = confirm(\"정말로 탈퇴하시겠습니까?\");\r\n");
      out.write("\tif(bool){\r\n");
      out.write("\t\tvar frm = document.memberUpdateFrm;\r\n");
      out.write("\t\tfrm.action = \"");
      out.print(request.getContextPath());
      out.write("/member/memberDelete\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteMember_Admin(){\r\n");
      out.write("\tvar bool = confirm(\"정말로 해당회원을 탈퇴처리 하시겠습니까?\");\r\n");
      out.write("\tif(bool){\r\n");
      out.write("\t\tvar frm = document.memberUpdateFrm;\r\n");
      out.write("\t\tfrm.action = \"");
      out.print(request.getContextPath());
      out.write("/member/memberDelete?admin=admin\";\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 비밀번호 변경 팝업 요청\r\n");
      out.write("function updatePassword(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar url = \"");
      out.print(request.getContextPath() );
      out.write("/member/updatePassword?userId=");
      out.print(userId_);
      out.write("\";\r\n");
      out.write("\t\r\n");
      out.write("\t// 팝업창 이름\r\n");
      out.write("\tvar title = \"updatePassword\";\r\n");
      out.write("\t/* var status = \"left=500px, top=200px, width=500px, height=250px\"; */\r\n");
      out.write("\t\r\n");
      out.write("\tvar popupX = (window.screen.width / 2) - (480 / 2);\r\n");
      out.write("\tvar popupY = (window.screen.height /2) - (380 / 2);\r\n");
      out.write("\t\r\n");
      out.write("\tvar status = \"left=\" + popupX +\", top=\" + popupY +\", screenX =\" + popupX +\", screenY=\" + popupY + \",width=480px, height=380px\";\r\n");
      out.write("\t\r\n");
      out.write("\topen(url, title, status);\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("// 코인 충전 팝업 요청\r\n");
      out.write("function chargeCoin(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar url = \"");
      out.print(request.getContextPath());
      out.write("/member/chargeCoin?userId=");
      out.print(userId_);
      out.write("\";\r\n");
      out.write("\t\r\n");
      out.write("\t// 팝업창 이름\r\n");
      out.write("\tvar title = \"chargeCoin\";\r\n");
      out.write("\t\r\n");
      out.write("\tvar popupX = (window.screen.width / 2) - (480 / 2);\r\n");
      out.write("\tvar popupY = (window.screen.height /2) - (380 / 2);\r\n");
      out.write("\t\r\n");
      out.write("\tvar status = \"left=\" + popupX +\", top=\" + popupY +\", screenX =\" + popupX +\", screenY=\" + popupY + \",width=480px, height=380px\";\r\n");
      out.write("\t\r\n");
      out.write("\topen(url, title, status);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 프로필 사진 변경\r\n");
      out.write("$(function(){\r\n");
      out.write("    $(\"#userProfile\").on('change', function(){\r\n");
      out.write("        readURL(this);\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function readURL(input){\r\n");
      out.write("   if(input.files && input.files[0]){\r\n");
      out.write("       var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("       reader.onload = function(e){\r\n");
      out.write("           $('#profilePre').attr('src', e.target.result);\r\n");
      out.write("       }\r\n");
      out.write("\r\n");
      out.write("       reader.readAsDataURL(input.files[0]);\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#userId_\").on(\"click\", function(){\r\n");
      out.write("\t\talert(\"아이디는 수정이 불가능합니다.\");\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#coin\").on(\"click\", function(){\r\n");
      out.write("\t\talert(\"코인은 수정이 불가능합니다.\");\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<section id=\"memberView-Container\">\r\n");
      out.write("\t<h2>&lt; 프로필 수정 &gt;</h2>\r\n");
      out.write("\t<input type=\"hidden\" name=\"userIdTest\" name=\"userIdTest\" \r\n");
      out.write("\t\t  \t\t\t\t   id=\"userIdTest\"\r\n");
      out.write("\t\t  \t\t\t\t   value=\"");
      out.print(userId_);
      out.write("\"/>\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/member/memberUpdateEnd\" \r\n");
      out.write("\t\t  method=\"post\"\r\n");
      out.write("\t\t  name=\"memberUpdateFrm\"\r\n");
      out.write("\t\t  onsubmit=\"return updateValidate();\"\r\n");
      out.write("\t\t  enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t  <table id=\"tbl-MemberView\">\r\n");
      out.write("\t\t  \t<tr>\r\n");
      out.write("\t\t  \t\t<th>아이디</th>\r\n");
      out.write("\t\t  \t\t<td>\r\n");
      out.write("\t\t  \t\t\t<input type=\"text\" \r\n");
      out.write("\t\t  \t\t\t\t   name=\"userId\" \r\n");
      out.write("\t\t  \t\t\t\t   id=\"userId_\"\r\n");
      out.write("\t\t  \t\t\t\t   value=\"");
      out.print(userId_);
      out.write("\"\r\n");
      out.write("\t\t  \t\t\t\t   required\r\n");
      out.write("\t\t  \t\t\t\t   readonly />\r\n");
      out.write("\t\t  \t\t</td>\r\n");
      out.write("\t\t  \t</tr>\r\n");
      out.write("\t\t  \t<tr>\r\n");
      out.write("\t\t  \t\t<th>이메일</th>\r\n");
      out.write("\t\t  \t\t<td>\r\n");
      out.write("\t\t  \t\t\t<input type=\"email\" \r\n");
      out.write("\t\t  \t\t\t\t   name=\"userEmail\" \r\n");
      out.write("\t\t  \t\t\t\t   id=\"userEmail\"\r\n");
      out.write("\t\t  \t\t\t\t   value=\"");
      out.print(userEmail );
      out.write("\" />\r\n");
      out.write("\t\t  \t\t</td>\r\n");
      out.write("\t\t  \t</tr>\r\n");
      out.write("\t\t  \t<tr>\r\n");
      out.write("\t\t  \t\t<th>보유코인</th>\r\n");
      out.write("\t\t  \t\t<td>\r\n");
      out.write("\t\t  \t\t\t<input type=\"text\"\r\n");
      out.write("\t\t  \t\t\t\t   name=\"coin\"\r\n");
      out.write("\t\t  \t\t\t\t   id=\"coin\"\r\n");
      out.write("\t\t  \t\t\t\t   value=\"");
      out.print(coin );
      out.write("\"\r\n");
      out.write("\t\t  \t\t\t\t   readonly />\r\n");
      out.write("\t\t  \t\t\t<input type=\"button\" \r\n");
      out.write("\t\t  \t\t\t\t   id=\"chargeCoin-Btn\"\r\n");
      out.write("\t\t  \t\t\t\t   value=\"코인충전\"\r\n");
      out.write("\t\t  \t\t\t\t   onclick=\"chargeCoin();\" />\r\n");
      out.write("\t\t  \t\t</td>\r\n");
      out.write("\t\t  \t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>프로필<br />사진</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"userProfile-Div\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" name=\"userProfile\" id=\"userProfile\" accept=\"image/jpg, image/jpeg, image/png, image/gif\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 프로필사진 변경시 삭제 -->\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"oldUserRenamedProfile\" value=\"");
      out.print(userProfileRenamedFile);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"oldUserOriginalProfile\" value=\"");
      out.print(userProfileOriginalFile);
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 실제 파일이 있는 경우만 보여주기 -->\r\n");
      out.write("\t\t\t\t\t\t");
if(m.getUserProfileRenamedFile() != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"delProfile\" id=\"delProfile\" />\r\n");
      out.write("\t\t\t\t\t\t<label for=\"del_Profile\">프로필사진 삭제</label>\r\n");
      out.write("\t\t\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t\t\t<div id=\"profile-Container\">\r\n");
      out.write("\t\t\t\t\t\t\t<img id=\"profilePre\" src=\"");
      out.print(request.getContextPath() );
      out.write("/upload/member/");
      out.print(userProfileRenamedFile );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
} // end of if : 프사 있는 경우
						else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t\t\t\t<div id=\"profile-Container\">\r\n");
      out.write("\t\t\t\t\t\t   <img id=\"profilePre\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/nonProfile.png\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
} // end of else : 프사 없는 경우 기본 프사 보여주기 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t  <input type=\"submit\" id=\"editInfo-Btn\" value=\"회원정보 수정\"\r\n");
      out.write("\t\t  \t");
      out.print("admin".equals(loggedInMember.getUserId()) ? "disabled style='color:gray; cursor:default;'" : "");
      out.write("/>\r\n");
      out.write("\t\t  <input type=\"button\" id=\"password-Btn\" value=\"비밀번호 수정\"\r\n");
      out.write("\t\t  \t\t onclick=\"updatePassword();\"\r\n");
      out.write("\t\t  \t");
      out.print("admin".equals(loggedInMember.getUserId()) ? "disabled style='color:gray; cursor:default;'" : "");
      out.write("/>\r\n");
      out.write("\t\t  <input type=\"button\" id=\"delete-Btn\" value=\"탈퇴\"\r\n");
      out.write("\t\t  \t");
      out.print("admin".equals(loggedInMember.getUserId()) ? "onclick='deleteMember_Admin();'" : "onclick='deleteMember();'");
      out.write(" />\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common/footer.css\" />\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Serif+KR\" rel=\"stylesheet\">\r\n");
      out.write(" </section>\r\n");
      out.write("      <footer>\r\n");
      out.write("         <p>&lt;Copyright 2019. <strong>ESCAPE, IF YOU CAN.</strong> All rights reserved.&gt;</p>\r\n");
      out.write("      </footer>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
