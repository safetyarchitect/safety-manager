package shougang.guigang.safety.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shougang.guigang.safety.pojo.TbGasalarm;
import shougang.guigang.safety.pojo.TbGasalarmExample;

public interface TbGasalarmMapper {
    long countByExample(TbGasalarmExample example);

    int deleteByExample(TbGasalarmExample example);

    int insert(TbGasalarm record);

    int insertSelective(TbGasalarm record);

    List<TbGasalarm> selectByExample(TbGasalarmExample example);

    int updateByExampleSelective(@Param("record") TbGasalarm record, @Param("example") TbGasalarmExample example);

    int updateByExample(@Param("record") TbGasalarm record, @Param("example") TbGasalarmExample example);
}