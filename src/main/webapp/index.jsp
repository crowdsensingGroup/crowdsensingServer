<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
    <script type="text/javascript" src="js/jquery-ztree-2.5.js"></script>
    <SCRIPT LANGUAGE="JavaScript">

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
            {id: 1, pid: 0, name: '发布任务', icon: 'img/发布任务.gif'}, //icon显示的图片的路径
            {id: 2, pid: 0, name: '任务查询', icon: 'img/任务查询.gif'}, //icon显示的图片的路径
            {id: 3, pid: 0, name: '系统监测', icon: 'img/系统监测.gif'}, //icon显示的图片的路径
            {id: 4, pid: 3, name: '任务完成率', icon: 'img/任务完成率.gif'},
            {id: 5, pid: 3, name: '用户接受率', icon: 'img/用户接受率.gif'},
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
            if (treeNode.id == 1) {
                window.location.href = "${path }/task/toReleaseTask";
            } else if (treeNode.id == 2) {
                window.location.href = "${path }/task/toTaskQuery";
            }else if (treeNode.id == 3) {
                window.location.href = "${path }/paper/allPaper";
            }else if (treeNode.id == 4) {
                window.location.href = "${path }/task/toTaskCompletionRate";
            }else if (treeNode.id == 5) {
                window.location.href = "${path }/task/toUserAcceptanceRate";
            }
        }
    </SCRIPT>

</head>
<body>
<div style="height: 80px;margin-left: 20px">
    <h1>
        欢迎来到群智感知服务器
    </h1>
</div>
<div>
    <div style="float: left;display: inline;">
        <TABLE border=0 height=600px align=left>
            <TR>
                <TD width=230px align=left valign=top
                    style="BORDER-RIGHT: #999999 1px dashed">
                    <ul id="tree" class="tree" style="width:230px; overflow:auto;"></ul>
                </TD>
            </TR>
        </TABLE>

    </div>

    <div style="float: left;display: inline;padding-left: 10px;width: auto">
        <img src="img/njtech.jpg"/>
    </div>
</div>

</body>
</html>