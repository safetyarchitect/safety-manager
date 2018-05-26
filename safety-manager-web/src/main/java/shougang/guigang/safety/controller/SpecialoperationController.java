package shougang.guigang.safety.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shougang.guigang.safety.pojo.TbSpecialoperation;
import shougang.guigang.safety.service.SpecialoperationService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

/**
 * special operation controller
 * @author admin
 *
 */
@Controller
@RequestMapping("/special")
public class SpecialoperationController extends TypeConvertorController {

	@Autowired
	private SpecialoperationService specialoperationService;
	
	@RequestMapping("/list")
	@ResponseBody
	private EasyUIDataGridResult getSpecialList(Integer page, Integer rows) {
		EasyUIDataGridResult result = specialoperationService.getSpecialList(page, rows);
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	private SafetyResult createSpecial(TbSpecialoperation specialoperation) {
		SafetyResult result = specialoperationService.createSpecial(specialoperation);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	private SafetyResult updateSpecial(TbSpecialoperation specialoperation) {
		SafetyResult result = specialoperationService.updateSpecial(specialoperation);
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	private SafetyResult deleteSpecial(@RequestParam("ids") List<String> ids) {
		SafetyResult result = specialoperationService.deleteSpecial(ids);
		return result;
	}
}
