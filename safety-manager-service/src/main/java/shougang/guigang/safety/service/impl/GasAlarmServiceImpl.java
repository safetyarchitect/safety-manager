package shougang.guigang.safety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import shougang.guigang.safety.mapper.TbGasalarmMapper;
import shougang.guigang.safety.pojo.TbGasalarm;
import shougang.guigang.safety.pojo.TbGasalarmExample;
import shougang.guigang.safety.pojo.TbGasalarmExample.Criteria;
import shougang.guigang.safety.service.GasAlarmService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;
import shougang.guigang.sanzuoyequ.common.utils.ExceptionUtil;

/**
 * gas alarm service
 * @author admin
 *
 */
@Service
public class GasAlarmServiceImpl implements GasAlarmService {

	@Autowired
	private TbGasalarmMapper gasalarmMapper;
	@Override
	public EasyUIDataGridResult getAlarmList(Integer page, Integer rows) {
		TbGasalarmExample example = new TbGasalarmExample();
		PageHelper.startPage(page, rows);
		List<TbGasalarm> list = gasalarmMapper.selectByExample(example);
		PageInfo<TbGasalarm> pageInfo = new PageInfo<TbGasalarm>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}
	@Override
	public SafetyResult createAlarm(TbGasalarm gasalarm) {
		try {
			gasalarmMapper.insert(gasalarm);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}
	@Override
	public SafetyResult updateAlarm(TbGasalarm gasalarm) {
		TbGasalarmExample example = new TbGasalarmExample();
		Criteria criteria = example.createCriteria();
		criteria.andAlarmIdEqualTo(gasalarm.getAlarmId());
		try {
			gasalarmMapper.updateByExample(gasalarm, example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}
	@Override
	public SafetyResult deleteAlarm(List<String> ids) {
		TbGasalarmExample example = new TbGasalarmExample();
		Criteria criteria = example.createCriteria();
		criteria.andAlarmIdIn(ids);
		try {
			gasalarmMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

}
