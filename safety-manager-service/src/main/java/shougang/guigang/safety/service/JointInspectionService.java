package shougang.guigang.safety.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import shougang.guigang.safety.pojo.TbJointinspection;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

public interface JointInspectionService {

	EasyUIDataGridResult getInspectionList(Integer page , Integer rows);
	
	EasyUIDataGridResult searchInspectionList(Date StartInspectionDate , Date endInspectionDate 
												, String inspectionSet , String inspectionResult 
												, String inspectionDuty) throws ParseException;

	SafetyResult createInspection(TbJointinspection jointinspection);

	SafetyResult updateInspection(TbJointinspection jointinspection);

	SafetyResult deleteInspection(List<String> ids);
}
