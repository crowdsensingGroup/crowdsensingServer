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
    <title>创建任务</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script language="javascript" type="text/javascript" src="../../../My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                创建新的任务
            </h1>
        </div>
    </div>
</div>
<jsp:include page="../home/leftTree.jsp" flush="true"/>
<div style="float: left;display: inline;padding-left: 50px;width: auto">
    <form action="" name="taskForm">
        <table style="border-collapse:separate; border-spacing:0px 10px;">
            <tr>
                <td>所属任务组：</td>
                <td>
                    <select name="taskGroupId" style="width: 200px;">
                        <c:forEach var="taskGroup" items="${requestScope.get('list')}" varStatus="status">
                            <option value="${taskGroup.id}">${taskGroup.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>经度：</td>
                <td><input type="text" name="longitude" id="longitude"/>
                </td>
            </tr>
            <tr>
                <td>纬度：</td>
                <td>
                    <input type="text" name="latitude" id="latitude"/>
                </td>
            </tr>

            <tr>
                <td>备注：</td>
                <td><input type="text" name="remark" id="remark"></td>
            </tr>
        </table>
        <br>

        <div class="row">
            <div class="col-md-4 column">
                <input class="btn btn-primary" type="button" value="发布" onclick="releaseTask()">
            </div>
        </div>

    </form>

    <script type="text/javascript">
        function releaseTask() {
            if ($.trim($('#longitude').val()).length < 1) {
                alert("经度不能为空！");
                return;
            }
            if ($.trim($('#latitude').val()).length < 1) {
                alert("纬度不能为空！");
                return;
            }

            var form = document.forms[0];
            form.action = "${basePath }/task/releaseTask";
            form.method = "post";
            form.submit();
        }
    </script>
</div>
</body>
</html>
