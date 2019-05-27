package jp.co.central_soft.train2019.bean;

import java.util.ArrayList;
import java.util.List;

public class AllEmployeeInfoBean
{
	private List<EmployeeBean> ebList = new ArrayList<EmployeeBean>();

	public void add(EmployeeBean emp) {
		ebList.add(emp);
	}

	public EmployeeBean get(int index) {
		return ebList.get(index);
	}

	public int size() {
		return ebList.size();
	}

	@Override
	public String toString() {
		return "AllEmployeeInfoBean [ebList=" + ebList + "]";
	}

}
