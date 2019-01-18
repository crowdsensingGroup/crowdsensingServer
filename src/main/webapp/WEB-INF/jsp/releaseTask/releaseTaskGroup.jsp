<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/14
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
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
        任务组名称：<input type="text" name="name"><br>
        接受任务截至时间：<input type="text" name="acceptanceDeadline"><br>
        任务开始时间：<input type="text" name="submissionDeadline"><br>
        任务截至时间：<input type="text" name="startDatetime"><br>
        提交任务截至时间：<input type="text" name="endDatetime"><br>
        任务类型：<input type="text" name="taskType"><br>
        备注：<input type="text" name="remark"><br>
        <input type="button" value="发布" onclick="releaseTask()">
    </form>

    <script type="text/javascript">
        function releaseTask() {
            var form = document.forms[0];
            form.action = "${basePath }/taskGroup/releaseTask";
            form.method = "post";
            form.submit();
        }
    </script>
</div>
</body>
</html>
