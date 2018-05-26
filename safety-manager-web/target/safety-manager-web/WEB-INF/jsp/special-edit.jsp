<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="specialEditForm" class="specialForm" method="post">
	    <table cellpadding="5">
	          <tr>
	            <td>身份证号:</td>
	            <td><input class="easyui-textbox" type="text" name="specialId" data-options="required:true" style="width: 150px;"></input></td>
	            <td>姓名:</td>
	            <td><input class="easyui-textbox" type="text" name="specialName" data-options="required:true" style="width: 60px;"></input></td>
	            <td>性别:</td>
	            <td><input class="easyui-textbox" type="text" name="specialSex" data-options="required:true" style="width: 50px;"></input></td>
	        </tr>
	        <tr>
	            <td>工作单位:</td>
	            <td><input class="easyui-textbox" type="text" name="specialUnit" data-options="required:true" style="width: 60px;"></input></td>
	            <td>岗位:</td>
	            <td><input class="easyui-textbox" type="text" name="specialTeam" data-options="required:true" style="width: 100px;"></input></td>
	            <td>证件编号:</td>
	            <td><input class="easyui-textbox" type="text" name="specialCertificate" data-options="required:true" style="width: 200px;"></input></td>
	        </tr>
	        <tr>
	            <td>档案编号:</td>
	            <td><input class="easyui-textbox" type="text" name="specialDossier" data-options="required:true" style="width: 200px;"></input></td>
	            <td>特种作业项目:</td>
	            <td><input class="easyui-textbox" type="text" name="specialItem" data-options="required:true" style="width: 120px;"></input></td>
	            <td>作业项目代号:</td>
	            <td><input class="easyui-textbox" type="text" name="specialItemcode" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>发证机关:</td>
	            <td><input class="easyui-textbox" type="text" name="specialAuthority" data-options="required:true" style="width: 200px;"></input></td>
	            <td>批准日期:</td>
	            <td><input class="easyui-datebox" type="text" name="specialApprovaldate" data-options="required:true" style="width: 100px;"></input></td>
	            <td>有效日期:</td>
	            <td><input class="easyui-datebox" type="text" name="specialEffectivedate" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>复审记录1:</td>
	            <td><input class="easyui-datebox" type="text" name="specialReview2" data-options="required:true" style="width: 100px;"></input></td>
	            <td>复审记录2:</td>
	            <td><input class="easyui-datebox" type="text" name="specialReview3" data-options="required:true" style="width: 100px;"></input></td>
	            <td>复审记录3:</td>
	            <td><input class="easyui-datebox" type="text" name="specialReview1" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	function submitForm(){
		if(!$('#specialEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		$.post("${pageContext.request.contextPath}/special/update",$("#specialEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改特种作业信息成功!','info',function(){
					$("#specialEditWindow").window('close');
					$("#specialList").datagrid("reload");
				});
			}
		});
	}
</script>
