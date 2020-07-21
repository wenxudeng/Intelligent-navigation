package edu.hust.top.dao;

import edu.hust.top.bean.Destination;
import edu.hust.top.bean.DestinationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DestinationMapper {
    int countByExample(DestinationExample example);

    int deleteByExample(DestinationExample example);

    int deleteByPrimaryKey(Integer destinationid);

    int insert(Destination record);

    int insertSelective(Destination record);

    List<Destination> selectByExample(DestinationExample example);

    Destination selectByPrimaryKey(Integer destinationid);

    int updateByExampleSelective(@Param("record") Destination record, @Param("example") DestinationExample example);

    int updateByExample(@Param("record") Destination record, @Param("example") DestinationExample example);

    int updateByPrimaryKeySelective(Destination record);

    int updateByPrimaryKey(Destination record);
}