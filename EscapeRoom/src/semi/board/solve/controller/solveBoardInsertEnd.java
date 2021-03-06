package semi.board.solve.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.josephoconnell.html.HTMLInputFilter;
import com.oreilly.servlet.MultipartRequest;

import semi.board.solve.model.dao.SolveBoardDao;
import semi.board.solve.model.vo.SolveBoard;
import semi.common.MyFileRenamePolicy;

/**
 * Servlet implementation class solveBoardInsertEnd
 */
@WebServlet("/board/solve/solveBoardInsertEnd")
public class solveBoardInsertEnd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public solveBoardInsertEnd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!ServletFileUpload.isMultipartContent(request)) { //request객체를 원래 있던 클래스 ServletFileUpload를 통해 검사
			request.setAttribute("msg", "게시판작성오류![form:enctype]");
			request.setAttribute("loc", "/");
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
			return; 			
		}
		
		String root = getServletContext().getRealPath("/");
		String saveDirectory = root + "upload"+File.separator+"SolveBoard";
		System.out.printf("[saveDirectory = %s]\n", saveDirectory);
		
		int maxPostSize = 1024*1024*10;
		
		MultipartRequest multiReq = new MultipartRequest(request, saveDirectory, maxPostSize, "UTF-8", 
				new MyFileRenamePolicy());
		
		String postTitle = multiReq.getParameter("title"); 
		String postWriter= multiReq.getParameter("writer");
	    String postContent  = multiReq.getParameter("content");
	    postContent = new HTMLInputFilter().filter(postContent);//boardContent전달하고 다시 돌려받음.
		String originalFileName = multiReq.getOriginalFileName("up_file");
		String renamedFileName = multiReq.getFilesystemName("up_file"); // 2018~.jpg

		SolveBoard sb = new SolveBoard();
		
		sb.setPostTitle(postTitle);
		sb.setPostWriter(postWriter);
		sb.setPostContent(postContent);
		sb.setPostOriginalFile(originalFileName);
		sb.setPostRenamedFile(renamedFileName);
		System.out.printf("[%s]\n", sb);
		
		int result = new SolveBoardDao().insertPost(sb);
	   
	
		String view = "/WEB-INF/views/common/msg.jsp";
		String msg = "";
		String loc = "/";
		
		
		if(result>0) {
			int getlastNo = new SolveBoardDao().getLastSeq();
			msg= "게시글이 등록되었습니다.";
			loc="/board/solve/solveBoardView?postNo="+getlastNo;
		}
		else {
			msg = "게시글 등록에 실패했습니다.";	
			loc="/board/solve/solveBoardList";
		}

		request.setAttribute("msg", msg);
		request.setAttribute("loc", loc);
		
		request.getRequestDispatcher(view).forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
