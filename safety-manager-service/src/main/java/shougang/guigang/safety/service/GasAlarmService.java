package shougang.guigang.safety.service;

import java.util.List;

import shougang.guigang.safety.pojo.TbGasalarm;
import shougang.guigang.sanzuoyequ.common.pojo.EasyUIDataGridResult;
import shougang.guigang.sanzuoyequ.common.pojo.SafetyResult;

public interface GasAlarmService {

	EasyUIDataGridResult getAlarmList(Integer page, Integer rows);

	SafetyResult createAlarm(TbGasalarm gasalarm);

	SafetyResult updateAlarm(TbGasalarm gasalarm);

	SafetyResult deleteAlarm(List<String> ids);
}
