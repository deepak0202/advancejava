<%@page import="sql.Insert"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
System.out.print("gdfgfdhgfd");
ResultSet resultSet=Insert.getDetails((String)session.getAttribute("userName"));
resultSet.next();
String userName1 = resultSet.getString(1);
String firstName = resultSet.getString(2);
String lastName = resultSet.getString(3);
String age = resultSet.getString(4);

%>
<h1><%=userName1 %></h1>

<h1><%=firstName %></h1>
<h1><%=userName1 %></h1>
<h1><%=lastName %></h1>
<h1><%=age %></h1>
<a href="logout">logout</a>
</body>
</html>