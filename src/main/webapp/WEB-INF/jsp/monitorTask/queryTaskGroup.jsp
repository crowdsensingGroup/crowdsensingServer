<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/14
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询任务组</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div style="height: 80px;margin-left: 20px">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    任务组查询
                </h1>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../home/leftTree.jsp" flush="true"/>
<div style="float:left;display: inline;padding-left: 10px;width: auto">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>任务组名称</th>
                    <th>接受任务截至时间</th>
                    <th>任务开始时间</th>
                    <th>任务截至时间</th>
                    <th>提交任务截至时间</th>
                    <th>任务类型</th>
                    <th>任务查询</th>
                    <th>备注</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="taskGroup" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${taskGroup.name}</td>
                        <td>${taskGroup.acceptanceDeadline}</td>
                        <td>${taskGroup.startDatetime}</td>
                        <td>${taskGroup.endDatetime}</td>
                        <td>${taskGroup.submissionDeadline}</td>
                        <td>${taskGroup.taskType}</td>
                        <td><a href="<%=request.getContextPath()%>/task/queryByCondition?taskGroupName=${taskGroup.name}">查询</a></td>
                        <td>${taskGroup.remark}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
