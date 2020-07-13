

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
		String regnum = request.getParameter("regnum1") + "-" + request.getParameter("regnum2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwdConfirm = request.getParameter("pwdConfirm");
		String email = request.getParameter("email1") + "@" + request.getParameter("email2"); 
		String addrnum = request.getParameter("addrnum");
		String addr = request.getParameter("addr1") + " " + request.getParameter("addr2");
		String tel = request.getParameter("tel");
		String job = request.getParameter("job");
		String chk_email = request.getParameter("chk_email");
		String interests[] = request.getParameterValues("interest");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("이름 : ");
		out.println("<b>" + name  + "</b>");
		out.println("<br> 주민등록번호 : ");
		out.println("<b>" + regnum  + "</b>");
		out.println("<br> 아 이 디 : ");
		out.println("<b>" + id  + "</b>");
		out.println("<br> 비밀번호 : ");
		out.println("<b>" + pwd  + "</b>");
		out.println("<br> 이 메 일 : ");
		out.println("<b>" + email  + "</b>");
		out.println("<br> 우편번호 : ");
		out.println("<b>" + addrnum  + "</b>");
		out.println("<br> 주소 : ");
		out.println("<b>" + addr  + "</b>");
		out.println("<br> 핸드폰번호 : ");
		out.println("<b>" + tel  + "</b>");
		out.println("<br> 직업 : ");
		out.println("<b>" + job  + "</b>");
		out.println("<br> 관심분야 : ");
		if(interests == null)
			out.println("<b>선택 항목이 없습니다.</b>");
		else {
			out.println("<b>");
			for(String interest : interests)
				out.println(interest + " ");
			out.println("</b>");
		}
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.println("</html></body>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
