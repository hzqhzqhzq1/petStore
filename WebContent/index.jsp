<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.newer.petstore.domain.Category"%>
<%@page import="java.util.List"%>
<%@page import="com.newer.petstore.AppInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border: 1px solid black;
		text-align: center;
		
	}
</style>
</head>
<body>

	<h1>在线人数：${ONLINE} <a href="Logout">注销</a></h1>
	<%-- 	<%
		List<Category> list = (List<Category>)application.getAttribute(AppInfo.APP_CATEGORY_LIST);
		for(Category c : list){
	%>
		<div>编号：<%=c.getId() %>类名：<%=c.getTitle() %></div>
	<%
		}
	%> --%>
	<div>
	<table align="center" border=1px cellspacing=0>
		<tr>
		<!--<th>编号</th> -->
			<th>名称</th>
			<th>价格</th>
			<th>信息</th>
			<th>库存</th>
			<th>销量</th>
			<th>图片路径</th>
			<th></th>
		</tr>

		<c:forEach items="${products}" var="p">
			<tr>
				<%-- <td>${p.id}</td>	 --%>		
				<td>${p.title}</td>			
				<td>${p.price}</td>			
				<td>${p.info}</td>			
				<td>${p.quantity}</td>			
				<td>${p.sales}</td>			
				<td><img alt="source not found" src="${p.pic}" width="75%"></td>			
				<td><a href="cart?id=${p.id}">加入购物车</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>