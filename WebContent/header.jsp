<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
	<h1>HZQ宠物店</h1>
	<div>
	<menu>
		<c:forEach items="${categories}" var="c">
			<li><a href=#>${c.title}</a></li>
		</c:forEach>
		<form action="search" method="get">
				<input type="text" name="keyWords" placeholder="请输入要搜索的关键字"/>
				<input type="submit"/>
		</form>
		
		<input type="text" id="key" name="keyWords" placeholder="请输入关键字" />
		<button id="btnSearch">搜索</button>
	</menu></div>
</header>