package shougang.guigang.safety.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shougang.guigang.safety.pojo.TbJointinspection;
import shougang.guigang.safety.pojo.TbJointinspectionExample;

public interface TbJointinspectionMapper {
    long countByExample(TbJointinspectionExample example);

    int deleteByExample(TbJointinspectionExample example);

    int insert(TbJointinspection record);

    int insertSelective(TbJointinspection record);

    List<TbJointinspection> selectByExampleWithBLOBs(TbJointinspectionExample example);

    List<TbJointinspection> selectByExample(TbJointinspectionExample example);

    int updateByExampleSelective(@Param("record") TbJointinspection record, @Param("example") TbJointinspectionExample example);

    int updateByExampleWithBLOBs(@Param("record") TbJointinspection record, @Param("example") TbJointinspectionExample example);

    int updateByExample(@Param("record") TbJointinspection record, @Param("example") TbJointinspectionExample example);
}