package jp.co.central_soft.train2019.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;

import jp.co.central_soft.train2019.bean.AllEmployeeInfoBean;
import jp.co.central_soft.train2019.dao.Dao;
import jp.co.central_soft.train2019.dao.EmployeeDao;

public class AllEmployeeInfoService
{
	private Connection con;

	public AllEmployeeInfoService() {}

	public AllEmployeeInfoBean getAllEmployeeInfo() throws ServletException
	{
		EmployeeDao dao = new EmployeeDao(con);
		AllEmployeeInfoBean allEmp = null;
		try
		{
			allEmp = dao.getAllEmployeeInfo();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ServletException(e);
		}
		return allEmp;
	}

	public void connect() throws ServletException
	{
		try
		{
			con = Dao.getConnection();
		}
		catch ( ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
