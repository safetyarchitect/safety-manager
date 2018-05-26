package shougang.guigang.safety.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shougang.guigang.safety.pojo.TbBasicpersonnelinformation;
import shougang.guigang.safety.service.BasicpersonnelinformationService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

/**
 * person information controller
 * @author admin
 *
 */
@Controller
@RequestMapping("/person")
public class BasicpersonnelinformationController extends TypeConvertorController {

	@Autowired
	private BasicpersonnelinformationService basicpersonnelinformationService;
	
	@RequestMapping("/{personId}")
	@ResponseBody
	private SafetyResult getPersonById(@PathVariable String personId) {
		SafetyResult result = basicpersonnelinformationService.getPersonById(personId);
		return result;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	private EasyUIDataGridResult getPersonList(Integer page , Integer rows) {
		EasyUIDataGridResult result = basicpersonnelinformationService.getPersonList(page, rows);
		return result;
	}
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult createPerson(TbBasicpersonnelinformation basicpersonnelinformation) {
		SafetyResult result = basicpersonnelinformationService.createPerson(basicpersonnelinformation);
		return result;
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult updatePerson(TbBasicpersonnelinformation basicpersonnelinformation) {
		SafetyResult result = basicpersonnelinformationService.updatePerson(basicpersonnelinformation);
		return result;
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult deletePerson(@RequestParam("ids") List<String> ids) {
		SafetyResult result = basicpersonnelinformationService.deletePerson(ids);
		return result;
	}
}
