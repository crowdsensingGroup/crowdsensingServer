<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/14
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户接受率</title>
</head>
<body>
<jsp:include page="../home/header.jsp" flush="true"/>
<jsp:include page="../home/leftTree.jsp" flush="true"/>
<div style="float: left;display: inline;padding-left: 10px;width: auto">
        <img src="${chartURL}" width=600 height=400 border=0 color=gray>
</div>
</body>
</html>
