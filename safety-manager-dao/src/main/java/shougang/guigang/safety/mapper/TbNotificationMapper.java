package shougang.guigang.safety.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shougang.guigang.safety.pojo.TbNotification;
import shougang.guigang.safety.pojo.TbNotificationExample;

public interface TbNotificationMapper {
    long countByExample(TbNotificationExample example);

    int deleteByExample(TbNotificationExample example);

    int insert(TbNotification record);

    int insertSelective(TbNotification record);

    List<TbNotification> selectByExampleWithBLOBs(TbNotificationExample example);

    List<TbNotification> selectByExample(TbNotificationExample example);

    int updateByExampleSelective(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);

    int updateByExampleWithBLOBs(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);

    int updateByExample(@Param("record") TbNotification record, @Param("example") TbNotificationExample example);
}