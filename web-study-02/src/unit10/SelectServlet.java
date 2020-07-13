package unit10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("����� ������ ���� : <b>");
		out.println(job);
		out.println("</b><hr>����� ������ ���� �о� : <b>");
		if(interests == null)
			out.println("������ �׸��� �����ϴ�.");
		else
			for(String interest : interests)
				out.println(interest + " ");
		out.println("</b><br><a href='javascript:history.go(-1)'>�ٽ�</a>");
		out.println("</body></html>");
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
