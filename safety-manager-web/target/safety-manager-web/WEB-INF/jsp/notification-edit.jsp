<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="notificationEditForm" class="notificationForm" method="post">
		<input type="hidden" name="notificationId"/>
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
	</div>
</div>
<script type="text/javascript">
	function submitForm(){
		if(!$('#notificationEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		$.post("${pageContext.request.contextPath}/notification/update",$("#notificationEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改通知成功!','info',function(){
					$("#notificationEditWindow").window('close');
					$("#notificationList").datagrid("reload");
				});
			}
		});
	}
</script>
