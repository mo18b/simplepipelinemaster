
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CalcServlet
 */
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	double result;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalcServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String operation = request.getParameter("operationss");

		if (operation.equals("add")) {
			result = new Calc().doAdd(Integer.parseInt(num1), Integer.parseInt(num2));
		} else if (operation.equals("sub")) {
			result = new Calc().doSub(Integer.parseInt(num1), Integer.parseInt(num2));
		} else if (operation.equals("mul")) {
			result = new Calc().doMul(Integer.parseInt(num1), Integer.parseInt(num2));
		} else if (operation.equals("div")) {
			result = new Calc().doDiv(Integer.parseInt(num1), Integer.parseInt(num2));
		}

		out.println(result);
	}

}
