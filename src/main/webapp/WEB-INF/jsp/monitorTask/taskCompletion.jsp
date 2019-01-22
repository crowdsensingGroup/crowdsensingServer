<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/21
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <head>
        <title>查询任务</title>
        <base href="<%=request.getContextPath()%>/"/>
        <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    </head>
</head>
<body>
<div style="height: 80px;margin-left: 20px">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    已完成的任务
                </h1>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../home/leftTree.jsp" flush="true"/>
<div style="float:left;display: inline;padding-left: 10px;width: auto">
    <c:forEach var="taskCompletion" items="${requestScope.get('list')}">
        <div style="float:left;padding-left: 20px;">
            <img src="showPic/${taskCompletion.taskPic}" style="width:250px; height: 200px;"/>
            <br/><br/>
            <li>
                测量数据：${taskCompletion.taskData}
            </li>
            <li>
                完成用户：匿名用户
            </li>
            <li>
                完成时间：${taskCompletion.completionDatetime}
            </li>
            <li>
                提交时间：${taskCompletion.submissionDatetime}
            </li>
        </div>
    </c:forEach>

</div>
</body>
</html>
