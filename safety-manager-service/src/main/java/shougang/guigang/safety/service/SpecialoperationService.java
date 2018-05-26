package shougang.guigang.safety.service;

import java.util.List;

import shougang.guigang.safety.pojo.TbSpecialoperation;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

public interface SpecialoperationService {

	EasyUIDataGridResult getSpecialList(Integer page , Integer rows);
	
	SafetyResult createSpecial(TbSpecialoperation specialoperation);

	SafetyResult updateSpecial(TbSpecialoperation specialoperation);

	SafetyResult deleteSpecial(List<String> ids);
}
