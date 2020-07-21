package edu.hust.top.dao;

import edu.hust.top.bean.Beacon;
import edu.hust.top.bean.BeaconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BeaconMapper {
    int countByExample(BeaconExample example);

    int deleteByExample(BeaconExample example);

    int deleteByPrimaryKey(Integer beaconid);

    int insert(Beacon record);

    int insertSelective(Beacon record);

    List<Beacon> selectByExample(BeaconExample example);

    Beacon selectByPrimaryKey(Integer beaconid);

    int updateByExampleSelective(@Param("record") Beacon record, @Param("example") BeaconExample example);

    int updateByExample(@Param("record") Beacon record, @Param("example") BeaconExample example);

    int updateByPrimaryKeySelective(Beacon record);

    int updateByPrimaryKey(Beacon record);
}