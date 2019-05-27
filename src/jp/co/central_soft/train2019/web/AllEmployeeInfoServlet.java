package jp.co.central_soft.train2019.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.central_soft.train2019.bean.AllEmployeeInfoBean;
import jp.co.central_soft.train2019.service.AllEmployeeInfoService;

@WebServlet("/AllEmployeeInfoServlet")
public class AllEmployeeInfoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse resp )
					throws ServletException, IOException
	{
		System.out.println("AllEmployeeInfoServletが実行されました。");

		AllEmployeeInfoBean bean = null;

		AllEmployeeInfoService allEmpService = new AllEmployeeInfoService();
		allEmpService.connect();
		bean = allEmpService.getAllEmployeeInfo();

		req.setAttribute("bean", bean);
		RequestDispatcher disp = req.getRequestDispatcher("/allEmployeeInfo.jsp");
		disp.forward(req, resp);
	}

	@Override
	protected void doPost(
			HttpServletRequest req,
			HttpServletResponse resp )
					throws ServletException, IOException
	{
		doGet(req, resp);
	}

}
