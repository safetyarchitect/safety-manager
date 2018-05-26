<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="alarmEditForm" class="alarmForm" method="post">
	    <table cellpadding="5">
	         <tr>
	            <td>报警器编码:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmId" data-options="required:true" style="width: 100px;"></input></td>
	            <td>报警器名称:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmName" data-options="required:true" style="width: 80px;"></input></td>
	            <td>报警器型号:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmType" data-options="required:true" style="width: 80px;"></input></td>
	        </tr>
	        <tr>
	            <td>报警器编号:</td>
	            <td><input class="easyui-numberbox" type="text" name="alarmNumber" data-options="required:true" style="width: 100px;"></input></td>
	            <td>机组:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmSet" data-options="required:true" style="width: 80px;"></input></td>
	            <td>存放点位:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmRoom" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>责任人:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmDuty" data-options="required:true" style="width: 60px;"></input></td>
	            <td>班组:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmTeam" data-options="required:true" style="width: 120px;"></input></td>
	            <td>检查日期:</td>
	            <td><input class="easyui-datebox" type="text" name="alarmDate" data-options="required:true" style="width: 100px;"></input></td>
	        </tr>
	        <tr>
	            <td>是否完好:</td>
	            <td><input class="easyui-numberbox" type="text" name="alarmIsintact" data-options="required:true" style="width: 60px;"></input></td>
	            <td>是否有电:</td>
	            <td><input class="easyui-numberbox" type="text" name="alarmIscharge" data-options="required:true" style="width: 60px;"></input></td>
	            <td>是否借出:</td>
	            <td><input class="easyui-numberbox" type="text" name="alarmIsborrow" data-options="required:true" style="width: 60px;"></input></td>
	        </tr>
	        <tr>
	            <td>接收人证件号:</td>
	            <td><input class="easyui-textbox" type="text" name="alarmBorrowid" data-options="required:true" style="width: 200px;"></input></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	function submitForm(){
		if(!$('#alarmEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		$.post("${pageContext.request.contextPath}/alarm/update",$("#alarmEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改报警器信息成功!','info',function(){
					$("#alarmEditWindow").window('close');
					$("#alarmList").datagrid("reload");
				});
			}
		});
	}
</script>
