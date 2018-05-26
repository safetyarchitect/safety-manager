package shougang.guigang.safety.service;

import java.util.List;

import shougang.guigang.safety.pojo.TbOccupationhealth;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

public interface OccupationhealthService {

	EasyUIDataGridResult getOccupationList(Integer page , Integer rows);
	
	SafetyResult createOccupation(TbOccupationhealth occupationhealth);

	SafetyResult updateOccupation(TbOccupationhealth occupationhealth);

	SafetyResult deleteOccupation(List<String> ids);
}
