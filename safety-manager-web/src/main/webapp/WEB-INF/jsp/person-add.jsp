<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="personAddForm" class="personForm" method="post">
	    <table cellpadding="5">
	         <tr>
	            <td>身份证号:</td>
	            <td><input class="easyui-textbox" type="text" name="personId" data-options="required:true" style="width: 150px;"></input></td>
	            <td>姓名:</td>
	            <td><input class="easyui-textbox" type="text" name="personName" data-options="required:true" style="width: 60px;"></input></td>
	            <td>密码:</td>
	            <td><input class="easyui-textbox" type="text" name="personPassword" data-options="required:true" style="width: 150px;"></input></td>
	        </tr>
	        <tr>
	            <td>性别:</td>
	            <td><input class="easyui-textbox" type="text" name="personSex" data-options="required:true" style="width: 50px;"></input></td>
	            <td>年龄:</td>
	            <td><input class="easyui-numberbox" type="text" name="personAge" data-options="required:true" style="width: 50px;"></input></td>
	            <td>出生日期:</td>
	            <td><input class="easyui-datebox" type="text" name="personBirthday" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>学历:</td>
	            <td><input class="easyui-textbox" type="text" name="personEducation" data-options="required:true" style="width: 50px;"></input></td>
	            <td>工作单位:</td>
	            <td><input class="easyui-textbox" type="text" name="personUnit" data-options="required:true" style="width: 60px;"></input></td>
	            <td>岗位:</td>
	            <td><input class="easyui-textbox" type="text" name="personPost" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>班组:</td>
	            <td><input class="easyui-textbox" type="text" name="personTeam" data-options="required:true" style="width: 120px;"></input></td>
	            <td>政治面貌:</td>
	            <td><input class="easyui-textbox" type="text" name="personPolitical" data-options="required:true" style="width: 60px;"></input></td>
	            <td>籍贯:</td>
	            <td><input class="easyui-textbox" type="text" name="personNativeplace" data-options="required:true" style="width: 120px;"></input></td>
	        </tr>
	        <tr>
	            <td>家庭住址:</td>
	            <td><input class="easyui-textbox" type="text" name="personAddress" data-options="required:true" style="width: 200px;"></input></td>
	            <td>开始工作时间:</td>
	            <td><input class="easyui-datebox" type="text" name="personStartwork" data-options="required:true" style="width: 100px;"></input></td>
	            <td>进入三作业区时间:</td>
	            <td><input class="easyui-datebox" type="text" name="personStart3work" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>进入现岗位时间:</td>
	            <td><input class="easyui-datebox" type="text" name="personStartpost" data-options="required:true" style="width: 100px;"></input></td>
	            <td>岗位类别:</td>
	            <td><input class="easyui-textbox" type="text" name="personPostlevel" data-options="required:true" style="width: 60px;"></input></td>
	            <td>工种:</td>
	            <td><input class="easyui-textbox" type="text" name="personWorktype" data-options="required:true" style="width: 120px;"></input></td>
	        </tr>
	        <tr>
	            <td>特种作业:</td>
	            <td><input class="easyui-textbox" type="text" name="personSpecial" data-options="required:true" style="width: 100px;"></input></td>
	            <td>一卡通号:</td>
	            <td><input class="easyui-textbox" type="text" name="personOnecard" data-options="required:true" style="width: 100px;"></input></td>
	            <td>手机号:</td>
	            <td><input class="easyui-textbox" type="text" name="personPhone" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>紧急联系人:</td>
	            <td><input class="easyui-textbox" type="text" name="personEmergencyperson" data-options="required:true" style="width: 80px;"></input></td>
	            <td>紧急联系电话:</td>
	            <td><input class="easyui-textbox" type="text" name="personEmergencynumber" data-options="required:true" style="width: 100px;"></input></td>
	            <td>退伍军人:</td>
	            <td><input class="easyui-numberbox" type="text" name="personIssoldier" data-options="required:true" style="width: 60px;"></input></td>
	        </tr>
	        <tr>
	            <td>工伤情况:</td>
	            <td><input class="easyui-numberbox" type="text" name="personIsinjury" data-options="required:true" style="width: 60px;"></input></td>
	            <td>管理员:</td>
	            <td><input class="easyui-numberbox" type="text" name="personIsadmin" data-options="required:true" style="width: 60px;"></input></td>
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
		if(!$('#personAddForm').form('validate')){
			$.messager.alert('提示','信息未填写完整!');
			return ;
		}
		//ajax的post方式提交表单
		//alert($("#personAddForm").serialize());//将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/person/save",$("#personAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','添加员工个人信息成功!','info',function(){
					$('#personAddForm').form('reset');
					$("#personAddWindow").window('close');
					$("#personList").datagrid("reload");
				});
			}
		});
	}
	function clearForm(){
		$('#personAddForm').form('reset');
	}
</script>
