/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-10 16:57:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.game;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import semi.member.model.vo.*;

public final class gameMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/game/gameBackground.jsp", Long.valueOf(1547120649708L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("semi.member.model.vo");
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

      out.write("\r\n");
      out.write("\r\n");

	Member loggedInMember = (Member)session.getAttribute("loggedInMember");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Serif+KR\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/game/gameMain.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("#hint{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 40%;\r\n");
      out.write("\theight: 56%;\r\n");
      out.write("\tleft: 30%;\r\n");
      out.write("\ttop: 22%;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("#hint-paper{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("}\r\n");
      out.write("#hint>div{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("    width: 275px;\r\n");
      out.write("    top: 54px;\r\n");
      out.write("    left: 47px;\r\n");
      out.write("    transform: rotate(-8deg);\r\n");
      out.write("    font-size: 35px;\r\n");
      out.write("    word-break: break-all;\r\n");
      out.write("}\r\n");
      out.write("#hint div#close-hint{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    text-align: right;\r\n");
      out.write("    font-size: 19px;\r\n");
      out.write("    /* margin-right: 5px; */\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/game/gameBackground.css\" />\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/game/gameMain/game_start_again.jpeg\" alt=\"\" id=\"back-ground\"/>");
      out.write("\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\t<input type=\"hidden\" value=0 />\r\n");
      out.write("\t\t<div id=\"pause-menu-container\">\r\n");
      out.write("\t\t\t<div id=\"pause-menu\"></div>\r\n");
      out.write("\t\t\t<div id=\"store\"></div>\r\n");
      out.write("\t\t\t<div id=\"help\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"message\"></div>\r\n");
      out.write("\t\t<div id=\"pause\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/game/gameMain/pause.png\" alt=\"\" /></div>\r\n");
      out.write("\t\t<div id=\"inventory\">\r\n");
      out.write("\t\t\t<div id=\"prev\"><span>◀</span></div>\r\n");
      out.write("\t\t\t<div id=\"next\"><span>▶</span></div>\r\n");
      out.write("\t\t\t<div id=\"obj-list-container\">\r\n");
      out.write("\t\t\t\t<div id=\"obj-list\">\r\n");
      out.write("\t\t\t\t\t<div id=\"obj1\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj2\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj3\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj4\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj5\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj6\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj7\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj8\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj9\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"obj10\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"hint\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/hint_paper.png\" id=\"hint-paper\" />\r\n");
      out.write("\t\t\t<div><div id=\"close-hint\">X</div></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("$(\"#back-ground\").fadeOut(3000);\r\n");
      out.write("setTimeout(function(){\r\n");
      out.write("\t$(\"#back-ground\").attr(\"src\", \"");
      out.print(request.getContextPath());
      out.write("/images/game/gameMain/test.png\").show();\r\n");
      out.write("\t$(\"#wrap\").show();\r\n");
      out.write("}, 3100);\r\n");
      out.write("var record = setInterval(timer, 1000);\r\n");
      out.write("function timer(){\r\n");
      out.write("\tvar sec = $(\"[type=hidden]\").val();\r\n");
      out.write("\t$(\"[type=hidden]\").val(++sec);\r\n");
      out.write("};\r\n");
      out.write("function show_message(msg, flag){\r\n");
      out.write("\t$(\"#pause-menu-container\").addClass(\"paused\");\r\n");
      out.write("\t$(\"#message\").html(msg).show();\r\n");
      out.write("\t\r\n");
      out.write("\tif(flag){\r\n");
      out.write("\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t$(\"#pause-menu-container\").removeClass(\"paused\");\r\n");
      out.write("\t\t\t$(\"#message\").hide();\r\n");
      out.write("\t\t}, 1500);\r\n");
      out.write("\t}\r\n");
      out.write("};\r\n");
      out.write("function show_record(){\r\n");
      out.write("\tvar time = $(\"[type=hidden]\").val();\r\n");
      out.write("\tvar h = Math.floor(time/3600);\r\n");
      out.write("\tvar m = Math.floor((time%3600)/60);\r\n");
      out.write("\tvar s = (time%3600)%60;\r\n");
      out.write("\t$(\"#time\").text(h+\"시간 \"+m+\"분 \"+s+\"초\");\t\r\n");
      out.write("};\r\n");
      out.write("function show_store(){\r\n");
      out.write("\t$(\"#btn-store\").on('click', function(){\r\n");
      out.write("\t\tif(");
      out.print(loggedInMember!=null);
      out.write("){\r\n");
      out.write("\t\t\tshow_pause_menu(\"store\");\r\n");
      out.write("\t\t\t$(\"#store\").slideDown();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{show_message(\"<h2>로그인시 이용가능한 서비스입니다.</h2>\", true);}\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function show_help(){\r\n");
      out.write("\t$(\"#btn-help\").on('click', function(){\r\n");
      out.write("\t\tshow_pause_menu(\"help\");\r\n");
      out.write("\t\t$(\"#help\").slideDown();\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function active_close(){\r\n");
      out.write("\t$(\".close\").on('click', function(){\r\n");
      out.write("\t\t$(this).parent().slideUp();\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function coin_hint_refresh(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/game/coinHintRefresh\",\r\n");
      out.write("\t\ttype: \"get\",\r\n");
      out.write("\t\tdataType: \"json\",\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t$(\"#userCoin\").text(data.coin);\r\n");
      out.write("\t\t\t$(\"#hintPaper\").text(data.hintPaper);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function buy_hint_paper(){\r\n");
      out.write("\t$(\"#btn-buyHint\").on('click', function(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/game/buyHint\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tsuccess: function(result){\r\n");
      out.write("\t\t\t\tif(result === \"true\"){\r\n");
      out.write("\t\t\t\t\tshow_message(\"<h2>구매가 완료되었습니다.</h2>\", true);\r\n");
      out.write("\t\t\t\t\tcoin_hint_refresh();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\tshow_message(\"<h2>보유 코인이 부족합니다.</h2>\", true);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(){\r\n");
      out.write("\t\t\t\tshow_message(\"<h2>예기치 못한 오류가 발생했습니다.</h2>\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function use_hint_paper(){\r\n");
      out.write("\t$(\"#btn-useHint\").on('click', function(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/game/useHint\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\tif(data === \"true\"){\r\n");
      out.write("\t\t\t\t\tshow_message(\"<h2>쪽지를 뽑는중입니다.</h2>\", false);\r\n");
      out.write("\t\t\t\t\tget_hint();\r\n");
      out.write("\t\t\t\t\t$(\"#message h2\").css({\"animation\":\"bling .7s\", \"animation-iteration-count\":\"3\"});\r\n");
      out.write("\t\t\t\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t\t\t\t$(\"#message\").hide();\r\n");
      out.write("\t\t\t\t\t\t$(\"#hint\").show();\r\n");
      out.write("\t\t\t\t\t}, 2500);\r\n");
      out.write("\t\t\t\t\tclose_hint_paper();\r\n");
      out.write("\t\t\t\t\tcoin_hint_refresh();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tshow_message(\"<h2>쪽지를 구매해주세요.</h2>\", true);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(){\r\n");
      out.write("\t\t\t\tshow_message(\"<h2>예기치 못한 오류가 발생했습니다.</h2>\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function close_hint_paper(){\r\n");
      out.write("\t$(\"#close-hint\").on('click', function(){\r\n");
      out.write("\t\t$(\"#hint\").hide();\r\n");
      out.write("\t\t$(\"#pause-menu-container\").removeClass(\"paused\");\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function get_hint(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/game/getHint\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t$(\"#close-hint\").after(data);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function show_pause_menu(menuName){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/game/pauseMenu\",\r\n");
      out.write("\t\tdata: \"menuName=\"+menuName,\r\n");
      out.write("\t\ttype: \"post\",\r\n");
      out.write("\t\tdataType: \"html\",\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t$(\"#\"+menuName).html(data);\r\n");
      out.write("\t\t\tadd_event_listener();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function active_esc(){\r\n");
      out.write("\t$(\"#btn-esc\").on('click', function(){\r\n");
      out.write("\t\tshow_message(\"<h2>게임을 종료하시겠습니까?</h2><button value='1'>◎ 확인</button><button>X 취소</button>\", false);\r\n");
      out.write("\t\t$(\"#message\").find(\"button\").each(function(){\r\n");
      out.write("\t\t\t$(this).click(function(){\r\n");
      out.write("\t\t\t\tif($(this).val()==1){\r\n");
      out.write("\t\t\t\t\topener.parent.sessionStorage.removeItem(\"game\");\r\n");
      out.write("\t\t\t\t\tself.close();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t$(\"#pause-menu-container\").removeClass(\"paused\");\r\n");
      out.write("\t\t\t\t\t$(this).parent().hide();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("function add_event_listener(){\r\n");
      out.write("\tshow_store();\r\n");
      out.write("\tshow_help();\r\n");
      out.write("\tactive_close();\r\n");
      out.write("\tbuy_hint_paper();\r\n");
      out.write("\tuse_hint_paper();\r\n");
      out.write("\tshow_record();\r\n");
      out.write("\tactive_esc();\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("$(\"#next\").click(function(e){\r\n");
      out.write("\t$(this).css(\"visibility\", \"hidden\").siblings(\"#prev\").css(\"visibility\", \"visible\");\r\n");
      out.write("\t$(\"#obj-list\").animate({\"left\":\"-100%\"});\r\n");
      out.write("});\r\n");
      out.write("$(\"#prev\").click(function(){\r\n");
      out.write("\t$(this).css(\"visibility\", \"hidden\").siblings(\"#next\").css(\"visibility\", \"visible\");\r\n");
      out.write("\t$(\"#obj-list\").animate({\"left\":0});\r\n");
      out.write("});\r\n");
      out.write("$(\"#inventory\").on('click',{flag:0},function(e){\r\n");
      out.write("\tvar cnt = e.data.flag++;\r\n");
      out.write("\tif(cnt%2==0) $(this).animate({\"top\":\"80%\"});\r\n");
      out.write("\telse $(this).animate({\"top\":\"100%\"});\r\n");
      out.write("\t$(this).toggleClass('on');\r\n");
      out.write("\t$(this).children().click(function(e){\r\n");
      out.write("\t\te.stopPropagation();\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("$(\"#pause\").on(\"click\", {flag:1}, function(e){\r\n");
      out.write("\tvar $target = $(this);\r\n");
      out.write("\tvar cnt = e.data.flag++;\r\n");
      out.write("\t$(\"#back-ground\").toggleClass(\"paused\");\r\n");
      out.write("\tif(cnt%2!=0){\r\n");
      out.write("\t\t$target.children().attr(\"src\", \"");
      out.print(request.getContextPath());
      out.write("/images/game/gameMain/play.png\");\r\n");
      out.write("\t\t$(\"#pause-menu-container\").show();\r\n");
      out.write("\t\tshow_pause_menu(\"pause-menu\");\r\n");
      out.write("\t\tclearInterval(record);\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\t$target.children().attr(\"src\", \"");
      out.print(request.getContextPath());
      out.write("/images/game/gameMain/pause.png\");\r\n");
      out.write("\t\t$(\"#pause-menu-container\").hide();\r\n");
      out.write("\t\t$(\"#pause-menu\").html(\"\");\r\n");
      out.write("\t\trecord = setInterval(timer, 1000);\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(window).on('keyup', function(e){\r\n");
      out.write("\tif(e.keyCode==27){\r\n");
      out.write("\t\t$(\"#pause\").trigger(\"click\");\r\n");
      out.write("\t}\r\n");
      out.write("\tif(e.keyCode==87&&isCtrl==true){\r\n");
      out.write("\t\topener.parent.sessionStorage.removeItem(\"game\");\r\n");
      out.write("\t}\r\n");
      out.write("}).on('beforeunload', function(){\r\n");
      out.write("\tconfirm(\"\");\r\n");
      out.write("\topener.parent.sessionStorage.removeItem(\"game\");\r\n");
      out.write("});\r\n");
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
