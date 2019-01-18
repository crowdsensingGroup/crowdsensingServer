<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/14
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询任务</title>
</head>
<body>
<div style="height: 80px;margin-left: 20px">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    任务查询
                </h1>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../home/leftTree.jsp" flush="true"/>
<div style="float: left;display: inline;padding-left: 10px;width: auto">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>任务组名称</th>
                    <th>经度</th>
                    <th>维度</th>
                    <th>状态</th>
                    <th>备注</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="taskGroup" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${taskGroup.name}</td>
                        <td><fmt:formatDate value="${taskGroup.acceptanceDeadline}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td><fmt:formatDate value="${taskGroup.startDatetime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td><fmt:formatDate value="${taskGroup.endDatetime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td><fmt:formatDate value="${taskGroup.submissionDeadline}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td>${taskGroup.taskType}</td>
                        <td>查询</td>
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
