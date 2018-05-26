package shougang.guigang.safety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import shougang.guigang.safety.mapper.TbBasicpersonnelinformationMapper;
import shougang.guigang.safety.pojo.TbBasicpersonnelinformation;
import shougang.guigang.safety.pojo.TbBasicpersonnelinformationExample;
import shougang.guigang.safety.pojo.TbBasicpersonnelinformationExample.Criteria;
import shougang.guigang.safety.service.BasicpersonnelinformationService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;
import shougang.guigang.sanzuoyequ.common.utils.ExceptionUtil;

/**
 * personnel information service
 * 
 * @author admin
 *
 */
@Service
public class BasicpersonnelinformationServiceImpl implements BasicpersonnelinformationService {

	@Autowired
	private TbBasicpersonnelinformationMapper basicpersonnelinformationMapper;

	@Override
	public SafetyResult getPersonById(String personId) {
		try {
			TbBasicpersonnelinformationExample example = new TbBasicpersonnelinformationExample();
			Criteria criteria = example.createCriteria();
			criteria.andPersonIdEqualTo(personId);
			List<TbBasicpersonnelinformation> list = basicpersonnelinformationMapper.selectByExample(example);
			if(list == null || list.size() == 0) {
				return SafetyResult.build(400, "查询的信息不存在");
			}
			TbBasicpersonnelinformation basicpersonnelinformation = list.get(0);
			return SafetyResult.ok(basicpersonnelinformation);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@Override
	public EasyUIDataGridResult getPersonList(Integer page, Integer rows) {
		TbBasicpersonnelinformationExample example = new TbBasicpersonnelinformationExample();

		PageHelper.startPage(page, rows);
		List<TbBasicpersonnelinformation> list = basicpersonnelinformationMapper.selectByExample(example);
		PageInfo<TbBasicpersonnelinformation> pageInfo = new PageInfo<TbBasicpersonnelinformation>(list);

		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);

		return result;
	}

	@Override
	public SafetyResult createPerson(TbBasicpersonnelinformation basicpersonnelinformation) {
		try {
			basicpersonnelinformationMapper.insert(basicpersonnelinformation);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult updatePerson(TbBasicpersonnelinformation basicpersonnelinformation) {
		TbBasicpersonnelinformationExample example = new TbBasicpersonnelinformationExample();
		Criteria criteria = example.createCriteria();
		criteria.andPersonIdEqualTo(basicpersonnelinformation.getPersonId());
		try {
			basicpersonnelinformationMapper.updateByExample(basicpersonnelinformation, example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult deletePerson(List<String> ids) {
		TbBasicpersonnelinformationExample example = new TbBasicpersonnelinformationExample();
		Criteria criteria = example.createCriteria();
		criteria.andPersonIdIn(ids);
		try {
			basicpersonnelinformationMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

}
