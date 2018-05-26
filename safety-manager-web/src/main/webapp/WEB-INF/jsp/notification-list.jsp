<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="notificationList" title="通知" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'${pageContext.request.contextPath}/notification/list',method:'get',pageSize:20,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'notificationId',width:60,align:'center'">通知编号</th> 
            <th data-options="field:'notificationTitle',width:200,align:'center'">通知标题</th>
            <th data-options="field:'notificationContent',width:360,align:'center'">通知内容</th>
            <th data-options="field:'notificationCreateperson',width:80,align:'center'">发布者</th>
            <th data-options="field:'notificationCreatetime',width:80,align:'center'">发布日期</th>
        </tr>
    </thead>
</table>

<div id="notificationAddWindow" class="easyui-window" title="添加通知信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/notification-add'" 
	 style="width:80%;height:80%;padding:10px;">
</div>

<div id="notificationEditWindow" class="easyui-window" title="编辑通知信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/notification-edit'" 
	 style="width:80%;height:80%;padding:10px;">
</div>

<script>

    function getSelectionsIds(){
    	var notificationList = $("#notificationList");
    	var sels = notificationList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].notificationId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$("#notificationAddWindow").window("open");
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
        	
        	$("#notificationEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#notificationList").datagrid("getSelections")[0];
        			data.notificationCreatetime = SAFETY.formatDate(data.notificationCreatetime);
        			$("#notificationEditForm").form("load",data);
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中需要删除的通知!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除编号为 '+ids+' 的通知吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("${pageContext.request.contextPath}/notification/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除通知信息成功!',undefined,function(){
            					$("#notificationList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>