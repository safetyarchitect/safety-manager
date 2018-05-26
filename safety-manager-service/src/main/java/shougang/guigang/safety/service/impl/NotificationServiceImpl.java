package shougang.guigang.safety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import shougang.guigang.safety.mapper.TbNotificationMapper;
import shougang.guigang.safety.pojo.TbNotification;
import shougang.guigang.safety.pojo.TbNotificationExample;
import shougang.guigang.safety.pojo.TbNotificationExample.Criteria;
import shougang.guigang.safety.service.NotificationService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;
import shougang.guigang.sanzuoyequ.common.utils.ExceptionUtil;

/**
 * notification service
 * @author admin
 *
 */
@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private TbNotificationMapper notificationMapper;
	
	@Override
	public EasyUIDataGridResult getNotificationList(Integer page, Integer rows) {
		TbNotificationExample example = new TbNotificationExample();
		PageHelper.startPage(page, rows);
		List<TbNotification> list = notificationMapper.selectByExampleWithBLOBs(example);
		PageInfo<TbNotification> pageInfo = new PageInfo<TbNotification>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	
	@Override
	public SafetyResult createNotification(TbNotification notification) {
		try {
			notificationMapper.insert(notification);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult updateNotification(TbNotification notification) {
		TbNotificationExample example = new TbNotificationExample();
		Criteria criteria = example.createCriteria();
		criteria.andNotificationIdEqualTo(notification.getNotificationId());
		try {
			notificationMapper.updateByExampleWithBLOBs(notification, example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult deleteNotification(List<Short> ids) {
		TbNotificationExample example = new TbNotificationExample();
		Criteria criteria = example.createCriteria();
		criteria.andNotificationIdIn(ids);
		try {
			notificationMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}
}
