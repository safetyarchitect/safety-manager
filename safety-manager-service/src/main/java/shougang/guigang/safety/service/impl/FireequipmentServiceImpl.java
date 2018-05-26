package shougang.guigang.safety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import shougang.guigang.safety.mapper.TbFireequipmentMapper;
import shougang.guigang.safety.pojo.TbFireequipment;
import shougang.guigang.safety.pojo.TbFireequipmentExample;
import shougang.guigang.safety.pojo.TbFireequipmentExample.Criteria;
import shougang.guigang.safety.service.FireequipmentService;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;
import shougang.guigang.sanzuoyequ.common.utils.ExceptionUtil;

/**
 * fire equipment service
 * @author admin
 *
 */
@Service
public class FireequipmentServiceImpl implements FireequipmentService {

	@Autowired
	private TbFireequipmentMapper fireequipmentMapper;
	
	@Override
	public EasyUIDataGridResult getFireList(Integer page, Integer rows) {
		TbFireequipmentExample example = new TbFireequipmentExample();
		
		PageHelper.startPage(page, rows);
		List<TbFireequipment> list = fireequipmentMapper.selectByExample(example);
		PageInfo<TbFireequipment> pageInfo = new PageInfo<TbFireequipment>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		
		return result;
	}

	@Override
	public SafetyResult createFireEquipment(TbFireequipment fireequipment) {
		fireequipmentMapper.insert(fireequipment);
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult updateFireEquipment(TbFireequipment fireequipment) {
		TbFireequipmentExample example = new TbFireequipmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andFireIdEqualTo(fireequipment.getFireId());
		try {
			fireequipmentMapper.updateByExample(fireequipment, example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

	@Override
	public SafetyResult deleteFireEquipment(List<String> ids) {
		TbFireequipmentExample example = new TbFireequipmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andFireIdIn(ids);
		try {
			fireequipmentMapper.deleteByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return SafetyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return SafetyResult.ok();
	}

}
