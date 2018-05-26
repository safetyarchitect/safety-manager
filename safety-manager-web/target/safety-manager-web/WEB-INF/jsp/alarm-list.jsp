<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="alarmList" title="报警器基本信息" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'${pageContext.request.contextPath}/alarm/list',method:'get',pageSize:20,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'alarmId',width:100,align:'center'">报警器编码</th> 
            <th data-options="field:'alarmName',width:80,align:'center'">报警器名称</th>
            <th data-options="field:'alarmType',width:80,align:'center'">报警器型号</th>
            <th data-options="field:'alarmNumber',width:100,align:'center'">报警器编号</th>
            <th data-options="field:'alarmSet',width:80,align:'center'">机组</th>
            <th data-options="field:'alarmRoom',width:100,align:'center'">存放点位</th>
            <th data-options="field:'alarmDuty',width:60,align:'center'">责任人</th>
            <th data-options="field:'alarmTeam',width:100,align:'center'">班组</th>
            <th data-options="field:'alarmDate',width:100,align:'center',formatter:SAFETY.formatDate">检查日期</th>
            <th data-options="field:'alarmIsintact',width:60,align:'center'">是否完好</th>
            <th data-options="field:'alarmIscharge',width:60,align:'center'">是否有电</th>
            <th data-options="field:'alarmIsborrow',width:60,align:'center'">是否借出</th>
            <th data-options="field:'alarmBorrowid',width:200,align:'center'">接收人证件号</th>
        </tr>
    </thead>
</table>

<div id="alarmAddWindow" class="easyui-window" title="添加报警器信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/alarm-add'" 
	 style="width:60%;height:60%;padding:10px;">
</div>

<div id="alarmEditWindow" class="easyui-window" title="编辑报警器信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/alarm-edit'" 
	 style="width:60%;height:60%;padding:10px;">
</div>

<script>

    function getSelectionsIds(){
    	var alarmList = $("#alarmList");
    	var sels = alarmList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].alarmId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$("#alarmAddWindow").window("open");
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
        	
        	$("#alarmEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#alarmList").datagrid("getSelections")[0];
        			data.alarmDate = SAFETY.formatDate(data.alarmDate);
        			$("#alarmEditForm").form("load",data);
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中需要删除的报警器信息!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除编号为 '+ids+' 的报警器吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("${pageContext.request.contextPath}/alarm/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除报警器信息成功!',undefined,function(){
            					$("#alarmList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>