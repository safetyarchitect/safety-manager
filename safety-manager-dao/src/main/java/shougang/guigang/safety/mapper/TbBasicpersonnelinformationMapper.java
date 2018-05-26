package shougang.guigang.safety.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shougang.guigang.safety.pojo.TbBasicpersonnelinformation;
import shougang.guigang.safety.pojo.TbBasicpersonnelinformationExample;

public interface TbBasicpersonnelinformationMapper {
    long countByExample(TbBasicpersonnelinformationExample example);

    int deleteByExample(TbBasicpersonnelinformationExample example);

    int insert(TbBasicpersonnelinformation record);

    int insertSelective(TbBasicpersonnelinformation record);

    List<TbBasicpersonnelinformation> selectByExample(TbBasicpersonnelinformationExample example);

    int updateByExampleSelective(@Param("record") TbBasicpersonnelinformation record, @Param("example") TbBasicpersonnelinformationExample example);

    int updateByExample(@Param("record") TbBasicpersonnelinformation record, @Param("example") TbBasicpersonnelinformationExample example);
}