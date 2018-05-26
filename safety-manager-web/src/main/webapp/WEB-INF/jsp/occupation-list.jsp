<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="occupationList" title="职业健康信息" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'${pageContext.request.contextPath}/occupation/list',method:'get',pageSize:20,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'occupationalId',width:150,align:'center'">身份证号</th> 
        	<th data-options="field:'occupationalName',width:60,align:'center'">姓名</th> 
        	<th data-options="field:'occupationalSex',width:50,align:'center'">性别</th> 
        	<th data-options="field:'occupationalAge',width:50,align:'center'">年龄</th> 
        	<th data-options="field:'occupationalUnit',width:60,align:'center'">工作单位</th> 
        	<th data-options="field:'occupationalTeam',width:120,align:'center'">班组</th> 
        	<th data-options="field:'occupationalTeamtype',width:50,align:'center'">班次</th> 
        	<th data-options="field:'occupationalPost',width:100,align:'center'">岗位</th> 
        	<th data-options="field:'occupationalWorktype',width:120,align:'center'">工种</th> 
        	<th data-options="field:'occupationalStartwork',width:80,align:'center',formatter:SAFETY.formatDate">参加工作时间</th> 
        	<th data-options="field:'occupationalTouchtime',width:80,align:'center',formatter:SAFETY.formatDate">接害时间</th> 
        	<th data-options="field:'occupationalCategory',width:260,align:'center'">职业危害种类</th> 
        	<th data-options="field:'occupationalSpecialitem',width:100,align:'center'">特种作业</th> 
        	<th data-options="field:'occupationalPhone',width:100,align:'center'">手机号</th> 
        	<th data-options="field:'occupationalDossiernumber',width:80,align:'center'">档案编号</th> 
        </tr>
    </thead>
</table>

<div id="occupationAddWindow" class="easyui-window" title="添加职业健康信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/occupation-add'" 
	 style="width:60%;height:60%;padding:10px;">
</div>

<div id="occupationEditWindow" class="easyui-window" title="编辑职业健康信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/occupation-edit'" 
	 style="width:60%;height:60%;padding:10px;">
</div>
<script>

    function getSelectionsIds(){
    	var occupationList = $("#occupationList");
    	var sels = occupationList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].occupationalId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$("#occupationAddWindow").window("open");
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一条信息才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一条信息!');
        		return ;
        	}
        	
        	$("#occupationEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#occupationList").datagrid("getSelections")[0];
        			data.occupationalStartwork = SAFETY.formatDate(data.occupationalStartwork);
        			data.occupationalTouchtime = SAFETY.formatDate(data.occupationalTouchtime);
        			$("#occupationEditForm").form("load",data);
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中需要删除的信息!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除身份证号为 '+ids+' 的员工职业健康信息吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("${pageContext.request.contextPath}/occupation/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除信息成功!',undefined,function(){
            					$("#occupationList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>