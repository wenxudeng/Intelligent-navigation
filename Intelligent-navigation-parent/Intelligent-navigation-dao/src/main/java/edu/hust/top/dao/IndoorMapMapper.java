package edu.hust.top.dao;

import edu.hust.top.bean.IndoorMap;
import edu.hust.top.bean.IndoorMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndoorMapMapper {
    int countByExample(IndoorMapExample example);

    int deleteByExample(IndoorMapExample example);

    int deleteByPrimaryKey(Integer indoormapid);

    int insert(IndoorMap record);

    int insertSelective(IndoorMap record);

    List<IndoorMap> selectByExample(IndoorMapExample example);

    IndoorMap selectByPrimaryKey(Integer indoormapid);

    int updateByExampleSelective(@Param("record") IndoorMap record, @Param("example") IndoorMapExample example);

    int updateByExample(@Param("record") IndoorMap record, @Param("example") IndoorMapExample example);

    int updateByPrimaryKeySelective(IndoorMap record);

    int updateByPrimaryKey(IndoorMap record);
}