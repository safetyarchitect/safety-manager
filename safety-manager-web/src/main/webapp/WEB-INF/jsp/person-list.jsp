<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="personList" title="个人基本信息"
	data-options="singleSelect:false,collapsible:true,pagination:true,url:'${pageContext.request.contextPath}/person/list',method:'get',pageSize:20"
	toolbar="#tb_personList">
	<thead>
		<tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'personId',width:150,align:'center'">身份证号</th>
			<th data-options="field:'personName',width:60,align:'center'">姓名</th>
			<th data-options="field:'personPassword',width:150,align:'center'">密码</th>
			<th data-options="field:'personSex',width:50,align:'center'">性别</th>
			<th data-options="field:'personAge',width:50,align:'center'">年龄</th>
			<th	data-options="field:'personBirthday',width:100,align:'center',formatter:SAFETY.formatDate">出生日期</th>
			<th data-options="field:'personEducation',width:50,align:'center'">学历</th>
			<th data-options="field:'personUnit',width:60,align:'center'">工作单位</th>
			<th data-options="field:'personPost',width:100,align:'center'">岗位</th>
			<th data-options="field:'personTeam',width:80,align:'center'">班组</th>
			<th data-options="field:'personPolitical',width:60,align:'center'">政治面貌</th>
			<th data-options="field:'personNativeplace',width:120,align:'center'">籍贯</th>
			<th data-options="field:'personAddress',width:200,align:'center'">家庭住址</th>
			<th
				data-options="field:'personStartwork',width:100,align:'center',formatter:SAFETY.formatDate">开始工作时间</th>
			<th
				data-options="field:'personStart3work',width:100,align:'center',formatter:SAFETY.formatDate">进入三作业区时间</th>
			<th
				data-options="field:'personStartpost',width:100,align:'center',formatter:SAFETY.formatDate">进入现岗位时间</th>
			<th data-options="field:'personPostlevel',width:60,align:'center'">岗位类别</th>
			<th data-options="field:'personWorktype',width:120,align:'center'">工种</th>
			<th data-options="field:'personSpecial',width:100,align:'center'">特种作业</th>
			<th data-options="field:'personOnecard',width:100,align:'center'">一卡通号</th>
			<th data-options="field:'personPhone',width:100,align:'center'">手机号</th>
			<th	data-options="field:'personEmergencyperson',width:80,align:'center'">紧急联系人</th>
			<th	data-options="field:'personEmergencynumber',width:100,align:'center'">紧急联系电话</th>
			<th data-options="field:'personIssoldier',width:60,align:'center'">退伍军人</th>
			<th data-options="field:'personIsinjury',width:60,align:'center'">工伤情况</th>
			<th data-options="field:'personIsadmin',width:60,align:'center'">管理员</th>
		</tr>
	</thead>
</table>

<div id="personAddWindow" class="easyui-window" title="添加员工信息"
	data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/person-add'"
	style="width:80%;height:80%;padding:10px;"></div>

<div id="personEditWindow" class="easyui-window" title="编辑员工信息"
	data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/person-edit'"
	style="width:80%;height:80%;padding:10px;"></div>
	
<div id="personSearchWindow" class="easyui-window" title="${data.data.personName}的个人信息"
	data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/person-search'"
	style="width:80%;height:80%;padding:10px;"></div>

<div id="tb_personList" style="padding:5px;height:auto">
	<div style="margin-bottom:5px">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="addPersonInformation()">新增</a> 
			<a href="#"	class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editPersonInformation()">编辑</a> 
			<a href="#"	class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="deletePersonInformation()">删除</a>
	</div>
	<div>
		身份证号: <input id="personId" class="easyui-searchbox" style="width:200px" prompt="请输入查询内容"> 
			<a href="#" class="easyui-linkbutton" iconCls="icon-search"
			onclick="searchPersonInformation()">搜索</a>
	</div>
</div>
<script>

	function getSelectionsIds() {
		var personList = $("#personList");
		var sels = personList.datagrid("getSelections");
		var ids = [];
		for (var i in sels) {
			ids.push(sels[i].personId);
		}
		ids = ids.join(",");
		return ids;
	}
	
	function addPersonInformation() {
		$("#personAddWindow").window("open");
	}
	
	function editPersonInformation() {
		var ids = getSelectionsIds();
			if (ids.length == 0) {
				$.messager.alert('提示', '必须选择一名职工才能编辑!');
				return;
			}
			if (ids.indexOf(',') > 0) {
				$.messager.alert('提示', '只能选择一名职工!');
				return;
			}

			$("#personEditWindow").window({
				onLoad : function() {
					//回显数据
					var data = $("#personList").datagrid("getSelections")[0];
					data.personBirthday = SAFETY.formatDate(data.personBirthday);
					data.personStartwork = SAFETY.formatDate(data.personStartwork);
					data.personStart3work = SAFETY.formatDate(data.personStart3work);
					data.personStartpost = SAFETY.formatDate(data.personStartpost);
					$("#personEditForm").form("load", data);
				}
			}).window("open");
	}
	
	function deletePersonInformation() {
		var ids = getSelectionsIds();
			if (ids.length == 0) {
				$.messager.alert('提示', '未选中需要删除的员工!');
				return;
			}
			$.messager.confirm('确认', '确定删除身份证号为 ' + ids + ' 的员工吗？', function(r) {
				if (r) {
					var params = {
						"ids" : ids
					};
					$.post("${pageContext.request.contextPath}/person/delete", params, function(data) {
						if (data.status == 200) {
							$.messager.alert('提示', '删除员工成功!', undefined, function() {
								$("#personList").datagrid("reload");
							});
						}
					});
				}
			});
	}

	function searchPersonInformation() {
		var personId = $("#personId").val();
			if (personId == "") {
				$.messager.alert('提示', '未输入需要查询的身份证号!');
				return;
			}
			
			if (!IdentityCodeValid($("#personId").val())) {
				$.messager.alert('提示', '输入的身份证号格式不正确!');
				return;
			}
			
			$("#personSearchWindow").window({
				onLoad : function() {
					$.post("${pageContext.request.contextPath}/person/" + personId,function(data) {
						if(data.status == 200) {
							data.data.personBirthday = SAFETY.formatDate(data.data.personBirthday);
							data.data.personStartwork = SAFETY.formatDate(data.data.personStartwork);
							data.data.personStart3work = SAFETY.formatDate(data.data.personStart3work);
							data.data.personStartpost = SAFETY.formatDate(data.data.personStartpost);
							$("#personSearchForm").form("load", data.data);
						} else {
							$.messager.alert('提示','没有这名员工信息！','info',function(){
								$("#personSearchWindow").window('close');
							});
						}
					});
				}
			}).window("open");
		} 

</script>