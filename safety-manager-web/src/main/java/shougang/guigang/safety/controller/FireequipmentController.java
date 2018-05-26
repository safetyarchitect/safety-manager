package shougang.guigang.safety.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shougang.guigang.safety.pojo.TbFireequipment;
import shougang.guigang.safety.service.FireequipmentService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

/**
 * fire equipment controller
 * @author admin
 *
 */
@Controller
@RequestMapping("/fire")
public class FireequipmentController extends TypeConvertorController {

	@Autowired
	private FireequipmentService fireequipmentService;
	
	@RequestMapping("/list")
	@ResponseBody
	private EasyUIDataGridResult getFireList(Integer page, Integer rows) {
		EasyUIDataGridResult result = fireequipmentService.getFireList(page, rows);
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	private SafetyResult createFireEquipment(TbFireequipment fireequipment) {
		SafetyResult result = fireequipmentService.createFireEquipment(fireequipment);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	private SafetyResult updateFireEquipment(TbFireequipment fireequipment) {
		SafetyResult result = fireequipmentService.updateFireEquipment(fireequipment);
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	private SafetyResult deleteFireEquipment(@RequestParam("ids") List<String> ids) {
		SafetyResult result = fireequipmentService.deleteFireEquipment(ids);
		return result;
	}
}
