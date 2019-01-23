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
    <script language="javascript" type="text/javascript" src="../../../My97DatePicker/WdatePicker.js"></script>
</head>
<body>
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
<div style="float: left;display: inline;padding-left: 50px;width: auto">
    <form action="" name="taskGroupForm">
        <table style="border-collapse:separate; border-spacing:0px 10px;">
            <tr>
                <td>任务组名称：</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>接受截止时间：</td>
                <td><input type="text" name="acceptanceDeadline" id="acceptanceDeadline"
                           onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                </td>
            </tr>
            <tr>
                <td>提交截止时间：</td>
                <td>
                    <input type="text" name="submissionDeadline" id="submissionDeadline"
                           onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                </td>
            </tr>
            <tr>
                <td>任务开始时间：</td>
                <td>
                    <input type="text" name="startDatetime" id="startDatetime"
                           onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                </td>
            </tr>
            <tr>
                <td>任务截止时间：</td>
                <td>
                    <input type="text" name="endDatetime" id="endDatetime"
                           onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                </td>
            </tr>
            <tr>
                <td>类型：</td>
                <td>
                    <select name="taskType" style="width: 200px;">
                        <option value="拍照">拍照</option>
                        <option value="测量气温">测量气温</option>
                        <option value="测量分贝">测量分贝</option>
                    </select>
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
            if ($.trim($('#name').val()).length < 1) {
                alert("任务组名不能为空！");
                return;
            }
            if ($.trim($('#name').val()).length > 10) {
                alert("任务组名不能超过10个子！");
                return;
            }
            if ($.trim($('#acceptanceDeadline').val()).length < 1) {
                alert("接受截止时间不能为空！");
                return;
            }
            if ($.trim($('#submissionDeadline').val()).length < 1) {
                alert("提交截止时间不能为空！");
                return;
            }
            if ($.trim($('#startDatetime').val()).length < 1) {
                alert("任务开始时间不能为空！");
                return;
            }
            if ($.trim($('#endDatetime').val()).length < 1) {
                alert("任务截止时间不能为空！");
                return;
            }

            var form = document.forms[0];
            form.action = "<%=request.getContextPath()%>/taskGroup/releaseTask";
            form.method = "post";
            form.submit();
        }
    </script>
</div>
</body>
</html>
