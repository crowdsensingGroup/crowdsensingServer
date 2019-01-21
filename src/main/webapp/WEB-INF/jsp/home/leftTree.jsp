<%--
  Created by IntelliJ IDEA.
  User: 胡煜家
  Date: 2019/1/17
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="../../../css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="../../../js/jquery-1.4.2.js"></script>
    <script type="text/javascript" src="../../../js/jquery-ztree-2.5.js"></script>
    <script language="JavaScript">

        //对整个树的特性的一个描述
        var setting = {
            //json中value只能为值不能为对象
            isSimpleData: true,
            treeNodeKey: "id", //唯一标示名称
            treeNodeParentKey: "pid",
            //显示节点之间的连线
            showLine: true,
            root: {
                isRoot: true,
                nodes: []
            },
            callback: {
                beforeClick: getCurrentNode,
                onClick: zTreeOnClick
            },
        };
        //描述的是树上的每一个节点
        zNodes = [
            {id: 1, pid: 0, name: '发布任务', icon: '${pageContext.request.contextPath }/img/发布任务.gif', open: true},
            {id: 11, pid: 1, name: '创建任务组', icon: '${pageContext.request.contextPath }/img/创建任务组.gif'},
            {id: 12, pid: 1, name: '创建任务', icon: '${pageContext.request.contextPath }/img/创建任务.gif'},

            {id: 2, pid: 0, name: '任务监测', icon: '${pageContext.request.contextPath }/img/任务监测.gif', open: true},
            {id: 21, pid: 2, name: '查询任务组', icon: '${pageContext.request.contextPath }/img/查询任务组.gif'},
            {id: 22, pid: 2, name: '查询任务', icon: '${pageContext.request.contextPath }/img/查询任务.gif'},

            {id: 3, pid: 0, name: '系统监测', icon: '${pageContext.request.contextPath }/img/系统监测.gif', open: true},
            {id: 31, pid: 3, name: '任务完成率', icon: '${pageContext.request.contextPath }/img/任务完成率.gif'},
            {id: 32, pid: 3, name: '用户接受率', icon: '${pageContext.request.contextPath }/img/用户接受率.gif'},

            {id: 4, pid: 0, name: '返回主页', icon: '${pageContext.request.contextPath }/img/发布任务.gif'},
        ];
        $(document).ready(function () {
            /**
             * 树的容器调用zTree方法生成树
             */
            zTree = $("#tree").zTree(setting, zNodes);
        });

        function getCurrentNode(treeId, treeNode) {
            curNode = treeNode;
            zTreeOnClick(curNode);
        }
        function zTreeOnClick(treeNode) {
            //此处编写需要完成的业务逻辑代码，实现你想要的 主内容的框架进行页面跳转
            if (treeNode.id == 11) {
                window.location.href = "${path }/taskGroup/toRelease";
            } else if (treeNode.id == 12) {
                window.location.href = "${path }/task/toReleaseTask";
            } else if (treeNode.id == 21) {
                window.location.href = "${path }/taskGroup/toAllTaskGroup";
            } else if (treeNode.id == 22) {
                window.location.href = "${path }/task/toAllTask";
            } else if (treeNode.id == 31) {
                window.location.href = "${path }/taskCompletion/toTaskCompletionRate";
            } else if (treeNode.id == 32) {
                window.location.href = "${path }/userAcceptance/toUserAcceptanceRate";
            } else if (treeNode.id == 4) {
                window.location.href = "${path }/toHome";
            }
        }
    </script>
</head>
<body>
<div style="float: left;display: inline;">
    <TABLE border=0 height=600px align=left>
        <TR>
            <TD width=185px align=left valign=top
                style="BORDER-RIGHT: #999999 1px dashed">
                <ul id="tree" class="tree" style="width:185px; overflow:auto;"></ul>
            </TD>
        </TR>
    </TABLE>
</div>
</body>
</html>
