<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/21
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <title>查询用户接受详情</title>
        <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    </head>
</head>
<body>
<div style="height: 80px;margin-left: 20px">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    查询用户接受详情
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
                    <th>接受时间</th>
                    <th>接受经度</th>
                    <th>接受纬度</th>
                    <th>旅行时间</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="userAcceptance" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${userAcceptance.acceptDatetime}</td>
                        <td>${userAcceptance.acceptLongitude}</td>
                        <td>${userAcceptance.acceptLatitude}</td>
                        <td>${userAcceptance.travelDistance}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
