package edu.hust.top.dao;

import edu.hust.top.bean.Trace;
import edu.hust.top.bean.TraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraceMapper {
    int countByExample(TraceExample example);

    int deleteByExample(TraceExample example);

    int deleteByPrimaryKey(Integer traceid);

    int insert(Trace record);

    int insertSelective(Trace record);

    List<Trace> selectByExample(TraceExample example);

    Trace selectByPrimaryKey(Integer traceid);

    int updateByExampleSelective(@Param("record") Trace record, @Param("example") TraceExample example);

    int updateByExample(@Param("record") Trace record, @Param("example") TraceExample example);

    int updateByPrimaryKeySelective(Trace record);

    int updateByPrimaryKey(Trace record);
}