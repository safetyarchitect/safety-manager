package shougang.guigang.safety.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shougang.guigang.safety.pojo.TbFireequipment;
import shougang.guigang.safety.pojo.TbFireequipmentExample;

public interface TbFireequipmentMapper {
    long countByExample(TbFireequipmentExample example);

    int deleteByExample(TbFireequipmentExample example);

    int insert(TbFireequipment record);

    int insertSelective(TbFireequipment record);

    List<TbFireequipment> selectByExample(TbFireequipmentExample example);

    int updateByExampleSelective(@Param("record") TbFireequipment record, @Param("example") TbFireequipmentExample example);

    int updateByExample(@Param("record") TbFireequipment record, @Param("example") TbFireequipmentExample example);
}