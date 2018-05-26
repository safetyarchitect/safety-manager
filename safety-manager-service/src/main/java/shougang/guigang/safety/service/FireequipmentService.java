package shougang.guigang.safety.service;

import java.util.List;

import shougang.guigang.safety.pojo.TbFireequipment;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

public interface FireequipmentService {

	EasyUIDataGridResult getFireList(Integer page , Integer rows);
	
	SafetyResult createFireEquipment(TbFireequipment fireequipment);

	SafetyResult updateFireEquipment(TbFireequipment fireequipment);

	SafetyResult deleteFireEquipment(List<String> ids);
}
