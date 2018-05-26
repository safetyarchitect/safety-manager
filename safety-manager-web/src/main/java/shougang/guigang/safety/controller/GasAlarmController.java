package shougang.guigang.safety.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shougang.guigang.safety.pojo.TbGasalarm;
import shougang.guigang.safety.service.GasAlarmService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

/**
 * gas alarm controller
 * @author admin
 *
 */
@Controller
@RequestMapping("/alarm")
public class GasAlarmController extends TypeConvertorController {

	@Autowired
	private GasAlarmService gasAlarmService;
	
	@RequestMapping("/list")
	@ResponseBody
	private EasyUIDataGridResult getAlarmList(Integer page, Integer rows) {
		EasyUIDataGridResult result = gasAlarmService.getAlarmList(page, rows);
		return result;
	}
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult createAlarm(TbGasalarm gasalarm) {
		SafetyResult result = gasAlarmService.createAlarm(gasalarm);
		return result;
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult updateAlarm(TbGasalarm gasalarm) {
		SafetyResult result = gasAlarmService.updateAlarm(gasalarm);
		return result;
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	@ResponseBody
	private SafetyResult deleteAlarm(@RequestParam("ids") List<String> ids) {
		SafetyResult result = gasAlarmService.deleteAlarm(ids);
		return result;
	}
}
