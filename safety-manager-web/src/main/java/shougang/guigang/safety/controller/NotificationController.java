package shougang.guigang.safety.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shougang.guigang.safety.pojo.TbNotification;
import shougang.guigang.safety.service.NotificationService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

/**
 * notification controller
 * @author admin
 *
 */
@Controller
@RequestMapping("/notification")
public class NotificationController extends TypeConvertorController {

	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping("/list")
	@ResponseBody
	private EasyUIDataGridResult getNotificationList(Integer page , Integer rows) {
		EasyUIDataGridResult result = notificationService.getNotificationList(page, rows);
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	private SafetyResult createNotification(TbNotification notification) {
		SafetyResult result = notificationService.createNotification(notification);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	private SafetyResult updateNotification(TbNotification notification) {
		SafetyResult result = notificationService.updateNotification(notification);
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	private SafetyResult deleteNotification(@RequestParam("ids") List<Short> ids) {
		SafetyResult result = notificationService.deleteNotification(ids);
		return result;
	}
	
	
}
