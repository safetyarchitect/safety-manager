<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="occupationAddForm" class="occupationForm" method="post">
	    <table cellpadding="5">
	       <tr>
	            <td>身份证号:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalId" data-options="required:true" style="width: 150px;"></input></td>
	            <td>姓名:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalName" data-options="required:true" style="width: 60px;"></input></td>
	            <td>性别:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalSex" data-options="required:true" style="width: 50px;"></input></td>
	        </tr>
	         <tr>
	            <td>年龄:</td>
	            <td><input class="easyui-numberbox" type="text" name="occupationalAge" data-options="required:true" style="width: 50px;"></input></td>
	            <td>工作单位:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalUnit" data-options="required:true" style="width: 60px;"></input></td>
	            <td>班组:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalTeam" data-options="required:true" style="width: 120px;"></input></td>
	        </tr>
	        <tr>
	            <td>班次:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalTeamtype" data-options="required:true" style="width: 120px;"></input></td>
	            <td>岗位:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalPost" data-options="required:true" style="width: 100px;"></input></td>
	            <td>工种:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalWorktype" data-options="required:true" style="width: 120px;"></input></td>
	        </tr>
	         <tr>
	            <td>参加工作时间:</td>
	            <td><input class="easyui-datebox" type="text" name="occupationalStartwork" data-options="required:true" style="width: 100px;"></input></td>
	            <td>接害时间:</td>
	            <td><input class="easyui-datebox" type="text" name="occupationalTouchtime" data-options="required:true" style="width: 100px;"></input></td>
	            <td>职业危害种类:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalCategory" data-options="required:true" style="width: 260px;"></input></td>
	        </tr>
	        <tr>
	            <td>特种作业:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalSpecialitem" data-options="required:true" style="width: 100px;"></input></td>
	            <td>手机号:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalPhone" data-options="required:true" style="width: 100px;"></input></td>
	            <td>档案编号:</td>
	            <td><input class="easyui-textbox" type="text" name="occupationalDossiernumber" data-options="required:true" style="width: 200px;"></input></td>
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
		if(!$('#occupationAddForm').form('validate')){
			$.messager.alert('提示','信息未填写完整!');
			return ;
		}
		//ajax的post方式提交表单
		//alert($("#occupationAddForm").serialize());//将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/occupation/save",$("#occupationAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','添加员工职业健康信息成功!','info',function(){
					$("#occupationAddWindow").window('close');
					$("#occupationList").datagrid("reload");
				});
			}
		});
	}
	function clearForm(){
		$('#occupationAddForm').form('reset');
	}
</script>
