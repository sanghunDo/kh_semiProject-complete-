package semi.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import semi.member.model.service.MemberService;
import semi.member.model.vo.Member;

/**
 * Servlet implementation class CheckIdDuplicateServlet
 */
@WebServlet("/member/checkIdDuplicate")
public class CheckIdDuplicateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckIdDuplicateServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 파라미터 핸들링
		String userid = request.getParameter("userid");
		System.out.println("유저아이디 가져왔니?"+userid);
		
		// 2. 비즈니스로직처리
		Member m = new MemberService().selectOne(userid);
		
		// 사용가능여부를 isUsable변수에 담기
		boolean isUsable = m == null?true:false;
		
		// view단 jsp에서 사용할 데이터를 request의 속성값으로 보관
		request.setAttribute("isUsable", isUsable);
		request.setAttribute("userid", userid);
		
		// 3. view단 처리
		// checkIdDuplicate.jsp
		request.getRequestDispatcher("/WEB-INF/views/member/checkIdDuplicate.jsp")
			   .forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
