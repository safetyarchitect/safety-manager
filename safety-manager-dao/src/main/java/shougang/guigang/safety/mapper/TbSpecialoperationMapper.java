package shougang.guigang.safety.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shougang.guigang.safety.pojo.TbSpecialoperation;
import shougang.guigang.safety.pojo.TbSpecialoperationExample;

public interface TbSpecialoperationMapper {
    long countByExample(TbSpecialoperationExample example);

    int deleteByExample(TbSpecialoperationExample example);

    int insert(TbSpecialoperation record);

    int insertSelective(TbSpecialoperation record);

    List<TbSpecialoperation> selectByExample(TbSpecialoperationExample example);

    int updateByExampleSelective(@Param("record") TbSpecialoperation record, @Param("example") TbSpecialoperationExample example);

    int updateByExample(@Param("record") TbSpecialoperation record, @Param("example") TbSpecialoperationExample example);
}