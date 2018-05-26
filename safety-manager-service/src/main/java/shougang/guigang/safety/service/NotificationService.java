package shougang.guigang.safety.service;

import java.util.List;

import shougang.guigang.safety.pojo.TbNotification;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

public interface NotificationService {
	EasyUIDataGridResult getNotificationList(Integer page , Integer rows);

	SafetyResult createNotification(TbNotification notification);
	
	SafetyResult updateNotification(TbNotification notification);

	SafetyResult deleteNotification(List<Short> ids);
}
