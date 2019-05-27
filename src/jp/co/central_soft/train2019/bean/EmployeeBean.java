package jp.co.central_soft.train2019.bean;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeBean {

	private int employeeID;
	private String employeeName;
	private BigDecimal height;
	private BigDecimal weight;
	private String email;
	private int hireFiscalYear;
	private LocalDate birthday;
	private String bloodType;

	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public BigDecimal getHeight() {
		return height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getHireFiscalYear() {
		return hireFiscalYear;
	}
	public void setHireFiscalYear(int hireFiscalYear) {
		this.hireFiscalYear = hireFiscalYear;
	}

	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", height=" + height
				+ ", weight=" + weight + ", email=" + email + ", hireFiscalYear=" + hireFiscalYear + ", birthday="
				+ birthday + ", bloodType=" + bloodType + "]\n";
	}

}
