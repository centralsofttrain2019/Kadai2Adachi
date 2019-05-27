<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="bean" class="jp.co.central_soft.train2019.bean.AllEmployeeInfoBean" scope="request" />
<!-- bean.EmployeeBean emp = new bean.EmployeeBean(); -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project2</title>
</head>
<body>
<p>全ての従業員の情報です。</p>
<table border=2>
	<thead>
		<tr>
			<th>ID</th>
			<th>名前</th>
			<th>身長</th>
			<th>体重</th>
			<th>メールアドレス</th>
			<th>入社年度</th>
			<th>BirthDay</th>
			<th>血液型</th>
		</tr>
	</thead>
	<% for(int i=0; i<bean.size(); i++) {%>
		<tr>
			<th><%=bean.get(i).getEmployeeID() %></th>
			<th><%=bean.get(i).getEmployeeName() %></th>
			<th><%=bean.get(i).getHeight() %></th>
			<th><%=bean.get(i).getWeight() %></th>
			<th><%=bean.get(i).getEmail() %></th>
			<th><%=bean.get(i).getHireFiscalYear() %></th>
			<th><%=bean.get(i).getBirthday() %></th>
			<th><%=bean.get(i).getBloodType() %></th>
		</tr>
	<%} %>
</table>
<%-- <% for(int i=0; i<bean.size(); i++) {%> --%>
<%-- <%=bean.get(i).toString() %><br> --%>
<%-- <%} %> --%>
</body>
</html>