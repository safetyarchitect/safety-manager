<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="inspectionAddForm" class="inspectionForm" method="post">
	    <table cellpadding="5">
	         <tr>
	            <td>项目编号:</td>
	            <td><input id="inspectionId" class="easyui-textbox" type="text" name="inspectionId" data-options="required:true" style="width: 150px;" readonly="readonly"></input></td>
	            <td>检查日期:</td>
	            <td><input class="easyui-datebox" type="text" name="inspectionDate" data-options="required:true,validType:'date',editable:false" style="width: 100px;"></input></td>
	            <td>机组:</td>
		            <td>
		            	<select class="easyui-combobox" name="inspectionSet" data-options="required:true,editable:false" style="width: 60px;">
						    <option value="DCL" selected="selected">DCL</option>
						    <option value="RAF">RAF</option>
					   		<option value="FCL">FCL</option>
						</select>
		             </td>
            </tr>
	        <tr>
	            <td>检查问题:</td>
	            <td colspan="5"><input class="easyui-textbox" name="inspectionIssue" data-options="required:true,multiline:true,validType:'length[0,150]'"  style="height:100px;width: 500px;" maxlength="60"></input></td>
	        </tr>
	        <tr>
	            <td>负责人:</td>
	            <td><input class="easyui-textbox" type="text" name="inspectionDuty" data-options="required:true,validType:'length[2,3]'" style="width: 50px;" maxlength="3"></input></td>
	            <td>整改时限:</td>
	            <td><input class="easyui-datebox" type="text" name="inspectionEnddate" data-options="required:true,editable:false" style="width: 100px"></input></td>
	            <td>整改结果:</td>
	            <td>
	            	<select class="easyui-combobox" name="inspectionResult" data-options="required:false,editable:false" style="width: 80px;">
					    <option value="未完成" selected="selected">未完成</option>
					    <option value="完成">完成</option>
					</select>
	            </td>
	        </tr>
	        <tr>
	            <td>复查人:</td>
	            <td><input class="easyui-textbox" type="text" name="inspectionReviewperson" data-options="required:false,validType:'length[2,3]'" style="width: 60px;"></input></td>
	            <td>复查结果:</td>
	            <td>
	            	<select class="easyui-combobox" name="insepctionReviewresult" data-options="required:false,editable:false" style="width: 80px;">
					    <option value="合格" selected="selected">合格</option>
					    <option value="不合格">不合格</option>
					</select>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	$(function(){ 
		var date= new Date();
		$("#inspectionId").val(date.getFullYear().toString() + date.getMonth().toString() + date.getDate().toString() + date.getHours().toString() + date.getMinutes().toString() + date.getSeconds().toString());
	});
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#inspectionAddForm').form('validate')){
			$.messager.alert('提示','信息填写不完整或错误!');
			return ;
		}
		//ajax的post方式提交表单
		//alert($("#inspectionAddForm").serialize());//将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/inspection/save",$("#inspectionAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','添加检查问题信息成功!','info',function(){
					$("#inspectionAddWindow").window('close');
					$("#inspectionList").datagrid("reload");
				});
			}
		});
	}
	function clearForm(){
		$('#inspectionAddForm').form('reset');
	}
</script>
