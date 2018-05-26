<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="fireList" title="消防器材信息" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'${pageContext.request.contextPath}/fire/list',method:'get',pageSize:20,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'fireId',width:50,align:'center'">编号</th> 
            <th data-options="field:'fireSet',width:60,align:'center'">机组</th>
            <th data-options="field:'firePosition',width:100,align:'center'">位置</th>
            <th data-options="field:'firePowder',width:80,align:'center'">干粉灭火器</th>
            <th data-options="field:'fireCarbon',width:100,align:'center'">二氧化碳灭火器</th>
            <th data-options="field:'firePowdercar',width:60,align:'center'">干粉小车</th>
            <th data-options="field:'fireHydrant',width:60,align:'center'">消防栓</th>
            <th data-options="field:'fireProducedate',width:100,align:'center',formatter:SAFETY.formatDate">生产日期</th>
            <th data-options="field:'fireCheckoutdate',width:100,align:'center',formatter:SAFETY.formatDate">检验日期</th>
            <th data-options="field:'fireDuty',width:50,align:'center'">责任人</th>
            <th data-options="field:'fireUnit',width:60,align:'center'">责任单位</th>
            <th data-options="field:'fireIsinspect',width:60,align:'center'">是否检查</th>
            <th data-options="field:'fireIsintact',width:60,align:'center'">是否完好</th>
        </tr>
    </thead>
</table>

<div id="fireAddWindow" class="easyui-window" title="添加消防器材信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/fire-add'" 
	 style="width:60%;height:60%;padding:10px;">
</div>

<div id="fireEditWindow" class="easyui-window" title="编辑消防器材信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/fire-edit'" 
	 style="width:60%;height:60%;padding:10px;">
</div>

<script>

    function getSelectionsIds(){
    	var fireList = $("#fireList");
    	var sels = fireList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].fireId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$("#fireAddWindow").window("open");
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
        	
        	$("#fireEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#fireList").datagrid("getSelections")[0];
        			data.fireProducedate = SAFETY.formatDate(data.fireProducedate);
        			data.fireCheckoutdate = SAFETY.formatDate(data.fireCheckoutdate);
        			$("#fireEditForm").form("load",data);
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
        	$.messager.confirm('确认','确定删除编号为 '+ids+' 的消防器材吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("${pageContext.request.contextPath}/fire/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除信息成功!',undefined,function(){
            					$("#fireList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>