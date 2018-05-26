package shougang.guigang.safety.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shougang.guigang.safety.pojo.TbOccupationhealth;
import shougang.guigang.safety.service.OccupationhealthService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

/**
 * occupation health controller
 * @author admin
 *
 */
@Controller
@RequestMapping("/occupation")
public class OccupationhealthController extends TypeConvertorController {

	@Autowired
	private OccupationhealthService occupationhealthService;
	
	@RequestMapping("/list")
	@ResponseBody
	private EasyUIDataGridResult getOccupationList(Integer page, Integer rows) {
		EasyUIDataGridResult result = occupationhealthService.getOccupationList(page, rows);
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	private SafetyResult createOccupation(TbOccupationhealth occupationhealth) {
		SafetyResult result = occupationhealthService.createOccupation(occupationhealth);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	private SafetyResult updateOccupation(TbOccupationhealth occupationhealth) {
		SafetyResult result = occupationhealthService.updateOccupation(occupationhealth);
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	private SafetyResult deleteOccupation(@RequestParam("ids") List<String> ids) {
		SafetyResult result = occupationhealthService.deleteOccupation(ids);
		return result;
	}
}
