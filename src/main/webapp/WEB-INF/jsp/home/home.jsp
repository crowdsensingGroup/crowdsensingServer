<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
</head>

<body>
<jsp:include page="header.jsp" flush="true"/>
<jsp:include page="leftTree.jsp" flush="true"/>
<div style="float: left;display: inline;padding-left: 10px;width: auto">
    <img src="../../../img/njtech.jpg"/>
</div>
</body>
</html>