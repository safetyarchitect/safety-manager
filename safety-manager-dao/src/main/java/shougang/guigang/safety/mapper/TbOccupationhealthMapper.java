package shougang.guigang.safety.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shougang.guigang.safety.pojo.TbOccupationhealth;
import shougang.guigang.safety.pojo.TbOccupationhealthExample;

public interface TbOccupationhealthMapper {
    long countByExample(TbOccupationhealthExample example);

    int deleteByExample(TbOccupationhealthExample example);

    int insert(TbOccupationhealth record);

    int insertSelective(TbOccupationhealth record);

    List<TbOccupationhealth> selectByExample(TbOccupationhealthExample example);

    int updateByExampleSelective(@Param("record") TbOccupationhealth record, @Param("example") TbOccupationhealthExample example);

    int updateByExample(@Param("record") TbOccupationhealth record, @Param("example") TbOccupationhealthExample example);
}