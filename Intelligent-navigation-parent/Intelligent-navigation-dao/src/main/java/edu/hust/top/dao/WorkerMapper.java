package edu.hust.top.dao;

import edu.hust.top.bean.Worker;
import edu.hust.top.bean.WorkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkerMapper {
    int countByExample(WorkerExample example);

    int deleteByExample(WorkerExample example);

    int deleteByPrimaryKey(String workerid);

    int insert(Worker record);

    int insertSelective(Worker record);

    List<Worker> selectByExample(WorkerExample example);

    Worker selectByPrimaryKey(String workerid);

    int updateByExampleSelective(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByExample(@Param("record") Worker record, @Param("example") WorkerExample example);

    int updateByPrimaryKeySelective(Worker record);

    int updateByPrimaryKey(Worker record);
}