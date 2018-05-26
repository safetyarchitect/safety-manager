<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="fireAddForm" class="fireForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>编号:</td>
	            <td><input class="easyui-textbox" type="text" name="fireId" data-options="required:true" style="width: 50px;"></input></td>
	            <td>机组:</td>
	            <td><input class="easyui-textbox" type="text" name="fireSet" data-options="required:true" style="width: 60px;"></input></td>
	            <td>位置:</td>
	            <td><input class="easyui-textbox" type="text" name="firePosition" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>干粉灭火器:</td>
	            <td><input class="easyui-numberbox" type="text" name="firePowder" data-options="required:true" style="width: 80px;"></input></td>
	            <td>二氧化碳灭火器:</td>
	            <td><input class="easyui-numberbox" type="text" name="fireCarbon" data-options="required:true" style="width: 100px;"></input></td>
	            <td>干粉小车:</td>
	            <td><input class="easyui-numberbox" type="text" name="firePowdercar" data-options="required:true" style="width: 60px;"></input></td>
	        </tr>
	        <tr>
	            <td>消防栓:</td>
	            <td><input class="easyui-numberbox" type="text" name="fireHydrant" data-options="required:true" style="width: 60px;"></input></td>
	            <td>生产日期:</td>
	            <td><input class="easyui-datebox" type="text" name="fireProducedate" data-options="required:true" style="width: 100px;"></input></td>
	            <td>检验日期:</td>
	            <td><input class="easyui-datebox" type="text" name="fireCheckoutdate" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>责任人:</td>
	            <td><input class="easyui-textbox" type="text" name="fireDuty" data-options="required:true" style="width: 50px;"></input></td>
	            <td>责任单位:</td>
	            <td><input class="easyui-textbox" type="text" name="fireUnit" data-options="required:true" style="width: 60px;"></input></td>
	            <td>是否检查:</td>
	            <td><input class="easyui-numberbox" type="text" name="fireIsinspect" data-options="required:true" style="width: 60px;"></input></td>
	            <td>是否完好:</td>
	            <td><input class="easyui-numberbox" type="text" name="fireIsintact" data-options="required:true" style="width: 60px;"></input></td>
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
		if(!$('#fireAddForm').form('validate')){
			$.messager.alert('提示','信息未填写完整!');
			return ;
		}
		//ajax的post方式提交表单
		//alert($("#fireAddForm").serialize());//将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/fire/save",$("#fireAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增消防器材信息成功!','info',function(){
					$('#fireAddForm').form('reset');
					$("#fireAddWindow").window('close');
					$("#fireList").datagrid("reload");
				});
			}
		});
	}
	
	function clearForm(){
		$('#fireAddForm').form('reset');
	}
</script>
