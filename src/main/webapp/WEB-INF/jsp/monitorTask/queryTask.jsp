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
    <title>查询任务</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
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
<div style="float:left;display: inline;padding-left: 10px;width: auto">
    <div class="row clearfix">
        <form action="" name="queryForm">
            <table style="margin-left:20px;border-collapse:separate; border-spacing:0px 10px;">
                <tr>
                    <td>任务组名称：</td>
                    <td style="width: 200px"><input type="text" name="taskGroupName" style="width: 150px"></td>
                    <td>状态：</td>
                    <td style="width: 130px">
                        <select name="status" style="width: 80px;">
                            <option selected="selected" disabled="disabled" style='display: none' value=''></option>
                            <option value="已接受">已接受</option>
                            <option value="未接受">未接受</option>
                            <option value="已完成">已完成</option>
                        </select>
                    </td>
                    <td><input class="btn btn-primary" type="button" value="查询" onclick="queryTask()"></td>
                </tr>
            </table>
        </form>
        <script type="text/javascript">
            function queryTask() {
                var form = document.forms[0];
                form.action = "${basePath }/task/queryByCondition";
                form.method = "post";
                form.submit();
            }
        </script>
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>任务组名称</th>
                    <th>经度</th>
                    <th>纬度</th>
                    <th>状态</th>
                    <th>备注</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="task" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${task.taskGroupName}</td>
                        <td>${task.longitude}</td>
                        <td>${task.latitude}</td>
                        <td>${task.status}</td>
                        <td>${task.remark}</td>
                        <td>
                            <c:if test="${task.status == '已接受'}">
                                <a href="<%=request.getContextPath()%>/task/userAcceptance?taskId=${task.id}">查询</a>
                            </c:if>
                            <c:if test="${task.status == '已完成'}">
                                <a href="<%=request.getContextPath()%>/task/taskCompetion?taskId=${task.id}">查询</a>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
