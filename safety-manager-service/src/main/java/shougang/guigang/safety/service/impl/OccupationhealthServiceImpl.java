package shougang.guigang.safety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import shougang.guigang.safety.mapper.TbOccupationhealthMapper;
import shougang.guigang.safety.pojo.TbOccupationhealth;
import shougang.guigang.safety.pojo.TbOccupationhealthExample;
import shougang.guigang.safety.pojo.TbOccupationhealthExample.Criteria;
import shougang.guigang.safety.service.OccupationhealthService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;
import shougang.guigang.sanzuoyequ.common.utils.ExceptionUtil;
/**
 * occupation health service
 * @author admin
 *
 */
@Service
public class OccupationhealthServiceImpl implements OccupationhealthService {

	@Autowired
	private TbOccupationhealthMapper occupationhealthMapper;
	@Override
	public EasyUIDataGridResult getOccupationList(Integer page, Integer rows) {
		TbOccupationhealthExample example = new TbOccupationhealthExample();
		
		PageHelper.startPage(page, rows);
		List<TbOccupationhealth> list = occupationhealthMapper.selectByExample(example);
		PageInfo<TbOccupationhealth> pageInfo = new PageInfo<TbOccupationhealth>(list);
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		
		return result;
	}
	@Override
	public SafetyResult createOccupation(TbOccupationhealth occupationhealth) {
		occupationhealthMapper.insert(occupationhealth);
		return SafetyResult.ok();
	}
	@Override
	public SafetyResult updateOccupation(TbOccupationhealth occupationhealth) {
		TbOccupationhealthExample example = new TbOccupationhealthExample();
		Criteria criteria = example.createCriteria();
		criteria.andOccupationalIdEqualTo(occupationhealth.getOccupationalId());
		try {
			occupationhealthMapper.updateByExample(occupationhealth, example);
		} catch (Exception e) {
			e.printStackTrace();
			SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}
	@Override
	public SafetyResult deleteOccupation(List<String> ids) {
		TbOccupationhealthExample example = new TbOccupationhealthExample();
		Criteria criteria = example.createCriteria();
		criteria.andOccupationalIdIn(ids);
		try {
			occupationhealthMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

}
