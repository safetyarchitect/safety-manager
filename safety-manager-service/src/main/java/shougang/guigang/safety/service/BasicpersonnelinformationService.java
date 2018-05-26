package shougang.guigang.safety.service;

import java.util.List;

import shougang.guigang.safety.pojo.TbBasicpersonnelinformation;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

public interface BasicpersonnelinformationService {

	SafetyResult getPersonById(String personId);
	
	EasyUIDataGridResult getPersonList(Integer page , Integer rows);
	
	SafetyResult createPerson(TbBasicpersonnelinformation basicpersonnelinformation);
	
	SafetyResult updatePerson(TbBasicpersonnelinformation basicpersonnelinformation);

	SafetyResult deletePerson(List<String> ids);
}
