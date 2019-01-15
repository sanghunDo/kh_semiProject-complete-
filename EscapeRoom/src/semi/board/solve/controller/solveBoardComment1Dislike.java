package semi.board.solve.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import semi.board.free.model.dao.FreeBoardDao;
import semi.board.solve.model.dao.SolveBoardDao;

/**
 * Servlet implementation class solveBoardComment1Dislike
 */
@WebServlet("/board/solve/solveBoardComment1Dislike.do")
public class solveBoardComment1Dislike extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public solveBoardComment1Dislike() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
		int commentNo =Integer.parseInt(request.getParameter("commentNo"));
		String userId = request.getParameter("userId");
	
		Cookie[] cookies = request.getCookies();
		String postCookieVal = "";
		boolean hasLike = false;
		
		if(cookies != null) {
			for(Cookie c:cookies) {
				String name = c.getName();
				String value = c.getValue();

				if("SolvelikeCookie".equals(name)) { //댓글의견
					postCookieVal = value;
					if(value.contains("|"+ commentNo+userId+"|")) {
						hasLike = true;
						break;
					}
				}
			}
		}
		
		int dislike = 0;
		if(!hasLike) {
			int result = new SolveBoardDao().updateDislike(commentNo);
			dislike = new SolveBoardDao().getDislike(commentNo);
	
			Cookie postCookie = new Cookie("SolvelikeCookie", postCookieVal + "|"+commentNo + userId + "|");
			response.addCookie(postCookie); 
			
			
		}else {
			response.setContentType("text/html; charset=utf-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('이미 참여하셨습니다');</script>");    		
            out.flush();
            dislike = new SolveBoardDao().getDislike(commentNo);

            // jsp에 전달하기 위해 속성으로 전	
		}
		
		//System.out.println("result"+result);
		
		response.setContentType("application/json; charset=utf-8");
		new Gson().toJson(dislike,response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
