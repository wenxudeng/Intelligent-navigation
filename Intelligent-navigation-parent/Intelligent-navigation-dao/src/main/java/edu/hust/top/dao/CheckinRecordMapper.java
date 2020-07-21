package edu.hust.top.dao;

import edu.hust.top.bean.CheckinRecord;
import edu.hust.top.bean.CheckinRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckinRecordMapper {
    int countByExample(CheckinRecordExample example);

    int deleteByExample(CheckinRecordExample example);

    int deleteByPrimaryKey(Integer checkinrecordid);

    int insert(CheckinRecord record);

    int insertSelective(CheckinRecord record);

    List<CheckinRecord> selectByExample(CheckinRecordExample example);

    CheckinRecord selectByPrimaryKey(Integer checkinrecordid);

    int updateByExampleSelective(@Param("record") CheckinRecord record, @Param("example") CheckinRecordExample example);

    int updateByExample(@Param("record") CheckinRecord record, @Param("example") CheckinRecordExample example);

    int updateByPrimaryKeySelective(CheckinRecord record);

    int updateByPrimaryKey(CheckinRecord record);
}