package shougang.guigang.safety.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import shougang.guigang.safety.mapper.TbJointinspectionMapper;
import shougang.guigang.safety.pojo.TbJointinspection;
import shougang.guigang.safety.pojo.TbJointinspectionExample;
import shougang.guigang.safety.pojo.TbJointinspectionExample.Criteria;
import shougang.guigang.safety.service.JointInspectionService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;
import shougang.guigang.sanzuoyequ.common.utils.ExceptionUtil;

/**
 * joint inspection service
 * @author admin
 *
 */
@Service
public class JointInspectionServiceImpl implements JointInspectionService {

	@Autowired
	private TbJointinspectionMapper jointinspectionMapper;
	
	@Override
	public EasyUIDataGridResult getInspectionList(Integer page , Integer rows) {
		TbJointinspectionExample example = new TbJointinspectionExample();
		PageHelper.startPage(page, rows);
		List<TbJointinspection> list = jointinspectionMapper.selectByExampleWithBLOBs(example);
		PageInfo<TbJointinspection> pageInfo = new PageInfo<TbJointinspection>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	
	@Override
	public EasyUIDataGridResult searchInspectionList(Date StartInspectionDate, Date endInspectionDate,
			String inspectionSet, String inspectionResult, String inspectionDuty) throws ParseException {
		TbJointinspectionExample example = new TbJointinspectionExample();
		Criteria criteria = example.createCriteria();
		String dateStr = "2018-04-01";
		Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).parse(dateStr);
		if (StartInspectionDate == null) {
			StartInspectionDate = date;
		}
		
		if (endInspectionDate == null) {
			endInspectionDate = new Date(System.currentTimeMillis());
		}
		
		criteria.andInspectionDateBetween(StartInspectionDate, endInspectionDate).andInspectionConditionEqualTo(inspectionSet , inspectionResult , inspectionDuty);
		
		PageHelper.startPage(1, 10);
		List<TbJointinspection> list = jointinspectionMapper.selectByExampleWithBLOBs(example);
		if (list == null || list.size() == 0) {
			return null;
		}
		PageInfo<TbJointinspection> pageInfo = new PageInfo<TbJointinspection>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	
	@Override
	public SafetyResult createInspection(TbJointinspection jointinspection) {
		try {
			jointinspectionMapper.insert(jointinspection);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}
	
	@Override
	public SafetyResult updateInspection(TbJointinspection jointinspection) {
		TbJointinspectionExample example = new TbJointinspectionExample();
		Criteria criteria = example.createCriteria();
		criteria.andInspectionIdEqualTo(jointinspection.getInspectionId());
		try {
			jointinspectionMapper.updateByExampleWithBLOBs(jointinspection, example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}
	
	@Override
	public SafetyResult deleteInspection(List<String> ids) {
		TbJointinspectionExample example = new TbJointinspectionExample();
		Criteria criteria = example.createCriteria();
		criteria.andInspectionIdIn(ids);
		try {
			jointinspectionMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}
}
