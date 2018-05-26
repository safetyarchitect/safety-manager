package shougang.guigang.safety.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shougang.guigang.safety.pojo.TbJointinspection;
import shougang.guigang.safety.service.JointInspectionService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

/**
 * joint inspection controller
 * @author admin
 *
 */
@Controller
@RequestMapping("/inspection")
public class JointInspectionController extends TypeConvertorController {

	@Autowired
	private JointInspectionService jointInspectionService;
	
	@RequestMapping("/list")
	@ResponseBody
	private EasyUIDataGridResult getInspectionList(Integer page , Integer rows) {
		EasyUIDataGridResult result = jointInspectionService.getInspectionList(page , rows);
		return result;
	}
	
	@RequestMapping(value = "/search" , method = RequestMethod.POST)
	@ResponseBody
	private EasyUIDataGridResult searchInspectionList(Date StartInspectionDate 
			, Date endInspectionDate , String inspectionSet , String inspectionResult 
			, String inspectionDuty) throws ParseException {
		EasyUIDataGridResult result = jointInspectionService.searchInspectionList(StartInspectionDate
										, endInspectionDate, inspectionSet, inspectionResult, inspectionDuty);
		return result;
	}
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult createInspection(TbJointinspection jointinspection) {
		SafetyResult result = jointInspectionService.createInspection(jointinspection);
		return result;
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult updateInspection(TbJointinspection jointinspection) {
		SafetyResult result = jointInspectionService.updateInspection(jointinspection);
		return result;
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult deleteInspection(@RequestParam("ids") List<String> ids) {
		SafetyResult result = jointInspectionService.deleteInspection(ids);
		return result;
	}
}
