package jp.co.central_soft.train2019.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.central_soft.train2019.bean.AllEmployeeInfoBean;
import jp.co.central_soft.train2019.bean.EmployeeBean;

public class EmployeeDao
{
	private static final String ALL_EMPLOYEE_INFO_SQL =
			"SELECT * FROM employees ";

	private Connection con;

	public EmployeeDao(Connection con)
	{
		super();
		this.con = con;
	}

	public AllEmployeeInfoBean getAllEmployeeInfo() throws SQLException
	{
		AllEmployeeInfoBean empList = new AllEmployeeInfoBean();

		PreparedStatement stmt = con.prepareStatement(ALL_EMPLOYEE_INFO_SQL);

		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next()) {
				EmployeeBean emp = new EmployeeBean();
				emp.setEmployeeID(rs.getInt("EmployeeID"));
				emp.setEmployeeName(rs.getString("EmployeeName"));
				emp.setHeight(rs.getBigDecimal("Height"));
				emp.setEmail(rs.getString("Email"));
				emp.setWeight(rs.getBigDecimal("Weight"));
				emp.setHireFiscalYear(rs.getInt("HireFiscalYear"));
				emp.setBirthday(rs.getDate("Birthday").toLocalDate());
				emp.setBloodType(rs.getString("BloodType"));
				empList.add(emp);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw e;
		}
		finally
		{
			if(rs!=null)
				rs.close();
		}
		return empList;
	}

}
