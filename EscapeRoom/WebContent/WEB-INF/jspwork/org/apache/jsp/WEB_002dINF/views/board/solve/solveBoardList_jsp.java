/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-13 23:15:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board.solve;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import semi.board.solve.model.vo.*;
import semi.member.model.vo.*;

public final class solveBoardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1547413022362L));
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
    _jspx_imports_packages.add("semi.board.solve.model.vo");
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
      out.write("/index.jsp\"><div id=\"logo\">Escape, if you can.</div></a>\r\n");
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
      out.write("/game/gameStart\";\r\n");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/board/solve/boardCommunityTable.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");

	List<SolveBoard> list = (List<SolveBoard>)request.getAttribute("list");
	List<SolveBoard> bestList = (List<SolveBoard>)request.getAttribute("bestList");
	int cPage = (int)request.getAttribute("cPage");
	int numPerPage = (int)request.getAttribute("numPerPage");
	String pageBar = (String)request.getAttribute("pageBar");



      out.write("\r\n");
      out.write("<title>공략게시판</title>\r\n");
      out.write("<script>\r\n");
      out.write("function noEnter(){\r\n");
      out.write("\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/board/solve/NoEnter\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h3>공략게시판</h3>\r\n");
      out.write("    <!--new pic-->\r\n");
      out.write("    <hr>\r\n");
      out.write("    ");
if(loggedInMember != null){ 
      out.write("\r\n");
      out.write("    <div id=\"write\" style=\"color:white\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/solve/solveBoardInsert?userId=");
      out.print(loggedInMember.getUserId());
      out.write("\">글쓰기</a></div>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    <div class=\"sort\">\r\n");
      out.write("        <span>추천순</span>\r\n");
      out.write("        <span>최신순</span>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <table class=\"sub_news\" id=\"best3List\" border=\"1\" cellspacing=\"0\" summary=\"베스트3\">\r\n");
      out.write("        <caption>게시판리스트</caption>\r\n");
      out.write("        <colgroup>\r\n");
      out.write("            <col width=\"30px\">\r\n");
      out.write("            <col width=\"100px\">\r\n");
      out.write("            <col width=\"30px\">\r\n");
      out.write("            <col width=\"30px\">\r\n");
      out.write("            <col width=\"30px\">\r\n");
      out.write("            <col width=\"30px\">\r\n");
      out.write("        </colgroup>\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th scope=\"col\">글번호</th>\r\n");
      out.write("                <th scope=\"col\">제목</th>\r\n");
      out.write("                <th scope=\"col\">글쓴이</th>\r\n");
      out.write("                <th scope=\"col\">날짜</th>\r\n");
      out.write("                <th scope=\"col\">추천수</th>\r\n");
      out.write("                <th scope=\"col\">조회수</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("         </thead>\r\n");
      out.write("\r\n");
      out.write("         <tbody>\r\n");
      out.write("             ");
if(bestList == null || bestList.isEmpty()) { 
      out.write("\r\n");
      out.write("             \t<tr>\r\n");
      out.write("               \t\t<td colspan=\"6\" align=\"center\">검색결과가 없습니다.</td>\r\n");
      out.write("           \t\t </tr>\r\n");
      out.write("             ");
} else {
            	 for(SolveBoard sb:bestList) {
              
      out.write("\r\n");
      out.write("          <tr class=\"best\" bgcolor=\"rgb(255,187,187)\">\r\n");
      out.write("                <td class=\"num\"  style=\"color:red;\">\r\n");
      out.write("                    BEST\r\n");
      out.write("                </td>\r\n");
      out.write("                        \r\n");
      out.write("                ");
if(loggedInMember!=null) {
      out.write("\r\n");
      out.write("                <td class=\"title\">\r\n");
      out.write("                   <a href=\"");
      out.print(request.getContextPath());
      out.write("/board/solve/solveBoardView?postNo=");
      out.print(sb.getPostNo());
      out.write("\"> \r\n");
      out.write("                   ");
      out.print(sb.getPostTitle() );
      out.write(' ');
      out.write('[');
      out.print(sb.getBoard_comment_cnt() );
      out.write("]\r\n");
      out.write("                </td>\r\n");
      out.write("                ");
} else { 
      out.write("\r\n");
      out.write("                   <td class=\"title\" onclick=\"noEnter();\">\r\n");
      out.write("                   ");
      out.print(sb.getPostTitle() );
      out.write(' ');
      out.write('[');
      out.print(sb.getBoard_comment_cnt() );
      out.write("]\r\n");
      out.write("                   </td>\r\n");
      out.write("                \t\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                        <td class=\"wirter\">\r\n");
      out.write("                            ");
      out.print(sb.getPostWriter());
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td class=\"date\">\r\n");
      out.write("                            ");
      out.print(sb.getPostDate() );
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td class=\"like\">\r\n");
      out.write("                           ");
      out.print(sb.getPostLike() );
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td class=\"views\">\r\n");
      out.write("                           ");
      out.print(sb.getPostReadCount() );
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t");

            	 }
             }
			
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!---------------------------------------------------------------------------------------------------------------->\r\n");
      out.write("            <table class=\"sub_news\" border=\"1\" cellspacing=\"0\" summary=\"게시판의 글제목리스트\">\r\n");
      out.write("                    <colgroup>\r\n");
      out.write("                        <col width=\"30px\">\r\n");
      out.write("                        <col width=\"100px\">\r\n");
      out.write("                        <col width=\"30px\">\r\n");
      out.write("                        <col width=\"30px\">\r\n");
      out.write("                        <col width=\"30px\">\r\n");
      out.write("                        <col width=\"30px\">\r\n");
      out.write("                    </colgroup>\r\n");
      out.write("            ");
if(list == null || list.isEmpty()) { 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("             \t<td colspan=\"6\" align=\"center\">검색결과가 없습니다. </td>\r\n");
      out.write("            </tr>\t\r\n");
      out.write("            ");
} else {
            	for(SolveBoard sb:list) {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"num\">\r\n");
      out.write("                   ");
      out.print(sb.getPostNo() );
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("                ");
if(loggedInMember!=null) {
      out.write("\r\n");
      out.write("                <td class=\"title\">\r\n");
      out.write("                   <a href=\"");
      out.print(request.getContextPath());
      out.write("/board/solve/solveBoardView?postNo=");
      out.print(sb.getPostNo());
      out.write("\"> \r\n");
      out.write("                   ");
      out.print(sb.getPostTitle() );
      out.write(' ');
      out.write('[');
      out.print(sb.getBoard_comment_cnt() );
      out.write("]\r\n");
      out.write("                </td>\r\n");
      out.write("                ");
} else { 
      out.write("\r\n");
      out.write("                   <td class=\"title\" onclick=\"noEnter();\">\r\n");
      out.write("                   ");
      out.print(sb.getPostTitle() );
      out.write(' ');
      out.write('[');
      out.print(sb.getBoard_comment_cnt() );
      out.write("]\r\n");
      out.write("                   </td>\r\n");
      out.write("                \t\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                <td class=\"wirter\">\r\n");
      out.write("                \t");
      out.print(sb.getPostWriter() );
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"date\">\r\n");
      out.write("                    ");
      out.print(sb.getPostDate() );
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"like\">\r\n");
      out.write("                    ");
      out.print(sb.getPostLike() );
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                <td class=\"views\">\r\n");
      out.write("                   ");
      out.print(sb.getPostReadCount() );
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
            	}
      out.write("\r\n");
      out.write("         </tbody>\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"search-container\">\r\n");
      out.write("        <select name=\"searchOpt\" id=\"searchOpt\">\r\n");
      out.write("            <option no=\"1\" value=\"title\">제목</option>\r\n");
      out.write("            <option no=\"2\" value=\"content\">내용</option>\r\n");
      out.write("            <option no=\"3\" value=\"id\">아이디</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <input type=\"text\" name=\"searchVal\" id=\"searchVal\">\r\n");
      out.write("        <div id=\"search\" style=\"width:50px;position: relative;top: -42px;color: white;\">검색</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"pageBar\">\r\n");
      out.print(pageBar );
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("/* function search(){\r\n");
      out.write("\tvar no = \r\n");
      out.write("\tvar option = $(\"option\").val();\r\n");
      out.write("\tconsole.log(\"option=\"+option);\r\n");
      out.write("\t */\r\n");
      out.write("\t $(\"#search\").on(\"click\", function(){\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar option = $(\"#searchOpt option:selected\").val();\r\n");
      out.write("\t\t\tvar searchVal = $(\"#searchVal\").val();\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/board/solve/solveBoardSearch?searchType=\"+option+\"&searchVal=\"+searchVal;\r\n");
      out.write("     });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
