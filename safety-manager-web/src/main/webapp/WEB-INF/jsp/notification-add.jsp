<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="notificationAddForm" class="notificationForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>通知标题:</td>
	            <td><input class="easyui-textbox" type="text" name="notificationTitle" data-options="required:true" style="width: 200px;"></input></td>
	        </tr>
	        <tr>
	            <td>通知内容:</td>
	            <td><input class="easyui-textbox" name="notificationContent" data-options="multiline:true,validType:'length[0,150]'" style="height:60px;width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>发布者:</td>
	            <td><input class="easyui-textbox" type="text" name="notificationCreateperson" data-options="required:true" style="width: 80px;"></input></td>
	        </tr>
	        <tr>
	            <td>发布日期:</td>
	            <td><input class="easyui-datebox" type="text" name="notificationCreatetime" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#notificationAddForm').form('validate')){
			$.messager.alert('提示','信息未填写完整!');
			return ;
		}
		//ajax的post方式提交表单
		//alert($("#notificationAddForm").serialize());//将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/notification/save",$("#notificationAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','添加通知成功!','info',function(){
					$('#notificationAddForm').form('reset');
					$("#notificationAddWindow").window('close');
					$("#notificationList").datagrid("reload");
				});
			}
		});
	}
	function clearForm(){
		$('#notificationAddForm').form('reset');
	}
</script>
