<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>三作业区安全生产信息平台-后台</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/jquery-easyui-1.5.2/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/jquery-easyui-1.5.2/themes/icon.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/safety.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/common.js"></script>
<style type="text/css">
.content {
	padding: 10px 10px 10px 10px;
}
</style>
</head>
<body class="easyui-layout">
	<div data-options="region:'west',title:'项目列表',split:true"
		style="width:180px;">
		<ul id="menu" class="easyui-tree"
			style="margin-top: 10px;margin-left: 5px;">
			<li><span>基本信息</span>
				<ul>
					<li data-options="attributes:{'url':'person-list'}">个人基本信息</li>
					<li data-options="attributes:{'url':'occupation-list'}">职业健康信息</li>
					<li data-options="attributes:{'url':'special-list'}">特种作业信息</li>
					<li data-options="attributes:{'url':'fire-list'}">消防器材信息</li>
					<li data-options="attributes:{'url':'alarm-list'}">报警器信息</li>
				</ul>
			</li>
			<li><span>具体工作</span>
				<ul>
					<li data-options="attributes:{'url':'inspection-list'}">联合检查</li>
					<li data-options="attributes:{'url':'notification-list'}">通知</li>
				</ul></li>
		</ul>
	</div>
	<div data-options="region:'center',title:''">
		<div id="tabs" class="easyui-tabs">
			<div title="首页" style="padding:20px;"></div>
		</div>
	</div>

	<script type="text/javascript">
		$(function() {
			$('#menu').tree({
				onClick : function(node) {
					if ($('#menu').tree("isLeaf", node.target)) {
						var tabs = $("#tabs");
						var tab = tabs.tabs("getTab", node.text);
						if (tab) {
							tabs.tabs("select", node.text);
						} else {
							tabs.tabs('add', {
								title : node.text,
								href : node.attributes.url,
								closable : true,
								bodyCls : "content"
							});
						}
					}
				}
			});
		});
	</script>
</body>
</html>