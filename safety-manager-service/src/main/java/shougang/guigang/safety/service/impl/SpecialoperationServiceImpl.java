package shougang.guigang.safety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import shougang.guigang.safety.mapper.TbSpecialoperationMapper;
import shougang.guigang.safety.pojo.TbSpecialoperation;
import shougang.guigang.safety.pojo.TbSpecialoperationExample;
import shougang.guigang.safety.pojo.TbSpecialoperationExample.Criteria;
import shougang.guigang.safety.service.SpecialoperationService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;
import shougang.guigang.sanzuoyequ.common.utils.ExceptionUtil;

/**
 * special operation service
 * @author admin
 *
 */
@Service
public class SpecialoperationServiceImpl implements SpecialoperationService {

	@Autowired
	private TbSpecialoperationMapper specialoperationMapper;
	
	@Override
	public EasyUIDataGridResult getSpecialList(Integer page, Integer rows) {
		TbSpecialoperationExample example = new TbSpecialoperationExample();
		
		PageHelper.startPage(page, rows);
		List<TbSpecialoperation> list = specialoperationMapper.selectByExample(example);
		PageInfo<TbSpecialoperation> pageInfo = new PageInfo<TbSpecialoperation>(list);
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		
		return result;
	}

	@Override
	public SafetyResult createSpecial(TbSpecialoperation specialoperation) {
		try {
			specialoperationMapper.insert(specialoperation);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult updateSpecial(TbSpecialoperation specialoperation) {
		TbSpecialoperationExample example = new TbSpecialoperationExample();
		Criteria criteria = example.createCriteria();
		criteria.andSpecialIdEqualTo(specialoperation.getSpecialId());
		try {
			specialoperationMapper.updateByExample(specialoperation, example);
		} catch (Exception e) {
			e.printStackTrace();
			SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult deleteSpecial(List<String> ids) {
		TbSpecialoperationExample example = new TbSpecialoperationExample();
		Criteria criteria = example.createCriteria();
		criteria.andSpecialIdIn(ids);
		try {
			specialoperationMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

}
