<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<table class="easyui-datagrid" id="inspectionList" title="检查项目信息" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'${pageContext.request.contextPath}/inspection/list',method:'get',pageSize:20" 
       toolbar="#tb_InspectionList">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'inspectionId',width:150,align:'center'">项目编号</th> 
            <th data-options="field:'inspectionDate',width:100,align:'center',formatter:SAFETY.formatDate">检查日期</th>
            <th data-options="field:'inspectionSet',width:60,align:'center'">机组</th>
            <th data-options="field:'inspectionIssue',width:360,align:'center'">检查问题</th>
            <th data-options="field:'inspectionDuty',width:50,align:'center'">负责人</th>
            <th data-options="field:'inspectionEnddate',width:100,align:'center',formatter:SAFETY.formatDate">整改时限</th>
            <th data-options="field:'inspectionResult',width:60,align:'center'">整改结果</th>
            <th data-options="field:'inspectionReviewperson',width:50,align:'center'">复查人</th>
            <th data-options="field:'insepctionReviewresult',width:60,align:'center'">复查结果</th>
        </tr>
    </thead>
</table>

<div id="inspectionAddWindow" class="easyui-window" title="添加问题项" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/inspection-add'" 
	 style="width:60%;height:60%;padding:10px;">
</div>

<div id="inspectionEditWindow" class="easyui-window" title="编辑问题信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/inspection-edit'" 
	 style="width:60%;height:60%;padding:10px;">
</div>

<div id="inspectionSearchWindow" class="easyui-window" title="查询问题信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/inspection-search'" 
	 style="width:80%;height:100%;padding:10px;">
</div>

<div id="tb_InspectionList" style="padding:5px;height:auto">
	<div style="margin-bottom:5px">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="addInspectionInformation()">新增</a> 
			<a href="#"	class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editInspectionInformation()">编辑</a> 
			<a href="#"	class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="deleteInspectionInformation()">删除</a>
	</div>
	<div>
		<form action="" method="post" id="searchInspectionInformation">
			<table>
				<tr>
					<td>开始日期: </td>
					<td><input class="easyui-datebox" name="StartInspectionDate" data-options="editable:false" style="width: 100px;"/></td>
					<td>结束日期:</td>
					 <td><input class="easyui-datebox" name="endInspectionDate" data-options="editable:false" style="width: 100px;"/></td>
					<td>机组:</td>
					<td><select class="easyui-combobox" name="inspectionSet" data-options="editable:false" style="width: 60px;">
						    <option value="" selected="selected">全部</option>
						    <option value="DCL">DCL</option>
						    <option value="RAF">RAF</option>
					   		<option value="FCL">FCL</option>
						</select>
					</td>
					<td>完成情况:</td>
					<td><select class="easyui-combobox" name="inspectionResult" data-options="editable:false" style="width: 80px;">
						    <option value="" selected="selected">全部</option>
						    <option value="未完成">未完成</option>
						    <option value="完成">完成</option>
						</select>
					</td>
					<td><input class="easyui-searchbox" type="text" name="inspectionDuty" data-options="validType:'length[0,3]'" 
				 					style="width: 100px;" maxlength="3"  prompt="负责人"/></td>
				    <td><a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="searchInspectionInformation()">搜索</a></td>
				</tr>
			</table>
		</form>
	</div>
</div>

<script>

    function getSelectionsIds(){
    	var inspectionList = $("#inspectionList");
    	var sels = inspectionList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].inspectionId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    function addInspectionInformation() {
    	$("#inspectionAddWindow").window("open");
    }
    
    function editInspectionInformation() {
    	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一项问题才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一项问题!');
        		return ;
        	}
        	
        	$("#inspectionEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#inspectionList").datagrid("getSelections")[0];
        			data.inspectionDate = SAFETY.formatDate(data.inspectionDate);
        			data.inspectionEnddate = SAFETY.formatDate(data.inspectionEnddate);
        			$("#inspectionEditForm").form("load",data);
        		}
        	}).window("open");
        }
    
    function deleteInspectionInformation() {
    	var ids = getSelectionsIds();
       	if(ids.length == 0){
       		$.messager.alert('提示','未选中需要删除的问题!');
       		return ;
       	}
       	$.messager.confirm('确认','确定删除编号为 '+ids+' 的问题吗？',function(r){
       	    if (r){
       	    	var params = {"ids":ids};
               	$.post("${pageContext.request.contextPath}/inspection/delete",params, function(data){
           			if(data.status == 200){
           				$.messager.alert('提示','删除问题成功!',undefined,function(){
           					$("#inspectionList").datagrid("reload");
           				});
           			}
           		});
       	    }
       	});
    }
    
    function searchInspectionInformation() {
		$("#inspectionSearchWindow").window({
			onLoad : function() {
				$.post("${pageContext.request.contextPath}/inspection/search",$("#searchInspectionInformation").serialize(),function(data) {
					if(data != null) {
						//回显数据
						$("#inspectionSearchList").datagrid("loadData",data);
					} else {
						$.messager.alert('提示','没有检查信息！','info',function(){
							$("#inspectionSearchWindow").window('close');
						});
					}
				});
			}
		}).window("open");
	}
    
</script>