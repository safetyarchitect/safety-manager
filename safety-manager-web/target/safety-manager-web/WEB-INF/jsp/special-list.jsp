<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="specialList" title="特种作业信息" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'${pageContext.request.contextPath}/special/list',method:'get',pageSize:20,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'specialId',width:150,align:'center'">身份证号</th> 
            <th data-options="field:'specialName',width:60,align:'center'">姓名</th>
            <th data-options="field:'specialSex',width:50,align:'center'">性别</th>
            <th data-options="field:'specialUnit',width:60,align:'center'">工作单位</th>
            <th data-options="field:'specialTeam',width:80,align:'center'">岗位</th>
            <th data-options="field:'specialCertificate',width:150,align:'center'">证件编号</th>
            <th data-options="field:'specialDossier',width:150,align:'center'">档案编号</th>
            <th data-options="field:'specialspecial',width:100,align:'center'">特种作业项目</th>
            <th data-options="field:'specialspecialcode',width:100,align:'center'">作业项目代号</th>
            <th data-options="field:'specialAuthority',width:160,align:'center'">发证机关</th>
            <th data-options="field:'specialApprovaldate',width:100,align:'center',formatter:SAFETY.formatDate">批准日期</th>
            <th data-options="field:'specialEffectivedate',width:100,align:'center',formatter:SAFETY.formatDate">有效日期</th>
            <th data-options="field:'specialReview1',width:100,align:'center',formatter:SAFETY.formatDate">复审记录1</th>
            <th data-options="field:'specialReview2',width:100,align:'center',formatter:SAFETY.formatDate">复审记录2</th>
            <th data-options="field:'specialReview3',width:100,align:'center',formatter:SAFETY.formatDate">复审记录3</th>
        </tr>
    </thead>
</table>

<div id="specialAddWindow" class="easyui-window" title="添加特种作业信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/special-add'" 
	 style="width:80%;height:80%;padding:10px;">
</div>

<div id="specialEditWindow" class="easyui-window" title="编辑特种作业信息" 
	 data-options="modal:true,closed:true,iconCls:'icon-save',href:'${pageContext.request.contextPath}/special-edit'" 
	 style="width:80%;height:80%;padding:10px;">
</div>

<script>

    function getSelectionsIds(){
    	var specialList = $("#specialList");
    	var sels = specialList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].specialId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$("#specialAddWindow").window("open");
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一名职工才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一名职工!');
        		return ;
        	}
        	
        	$("#specialEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#specialList").datagrid("getSelections")[0];
        			data.specialApprovaldate = SAFETY.formatDate(data.specialApprovaldate);
        			data.specialEffectivedate = SAFETY.formatDate(data.specialEffectivedate);
        			data.specialReview1 = SAFETY.formatDate(data.specialReview1);
        			data.specialReview2 = SAFETY.formatDate(data.specialReview2);
        			data.specialReview3 = SAFETY.formatDate(data.specialReview3);
        			$("#specialEditForm").form("load",data);
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
        	$.messager.confirm('确认','确定删除身份证号为 '+ids+' 员工的特种作业吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("${pageContext.request.contextPath}/special/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除信息成功!',undefined,function(){
            					$("#specialList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>