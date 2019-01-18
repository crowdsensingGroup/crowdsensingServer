<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/14
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>创建任务组</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    创建新的任务组
                </h1>
            </div>
        </div>
    </div>
<jsp:include page="../home/leftTree.jsp" flush="true"/>
<div style="float: left;display: inline;padding-left: 10px;width: auto">
    <form action="" name="taskGroupForm">
        任务组名称：<input type="text" name="paperName"><br>
        经度：<input type="text" name="paperNum"><br>
        维度：<input type="text" name="paperDetail"><br>
        备注：<input type="text" name="paperDetail"><br>
        <input type="button" value="添加" onclick="addPaper()">
    </form>
</div>
</body>
</html>
