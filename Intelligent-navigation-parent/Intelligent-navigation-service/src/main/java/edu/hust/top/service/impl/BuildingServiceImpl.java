package edu.hust.top.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Building;
import edu.hust.top.dao.BuildingMapper;
import edu.hust.top.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dwx
 * @create 2020-07-28 11:07
 */
@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingMapper buildingMapper;


    @Override
    public void addBuilding(Building building) {
        // 判断building对象中建筑名称是否为空
        if(building == null || building.getBuildingname() == null || "".equals(building.getBuildingname())){
            throw new RuntimeException("建筑名称不能为空！");
        }

        // 判断该建筑所属园区是否有效
        if(building.getRegionid() == 0){
            throw new RuntimeException("请选择有效的所属园区或者添加园区");
        }

        // 执行添加
        buildingMapper.insert(building);
    }

    @Override
    public PageInfo<Building> getBuildingList(Integer regionId, String keyword, Integer pageNum, Integer pageSize) {
        // 1.调用PageHelper的静态方法，开启分页功能
        PageHelper.startPage(pageNum, pageSize);

        // 2.执行查询
        List<Building> list = buildingMapper.selectBuildingListByRegionIdAndKeyword(regionId, keyword);

        // 3.封装到PageInfo对象中
        return new PageInfo<>(list);
    }

    @Override
    public Building selectBuildingById(Integer buildingid) {
        // 调用dao层方法查询Building对象
        Building building = buildingMapper.selectByPrimaryKey(buildingid);

        // 判断查到的Building对象是否为空
        if(building == null){
            throw new RuntimeException("数据库中没有此对象");
        }

        return building;
    }

    @Override
    public void updateBuilding(Building building) {
        // 判断Building名称是否为空值
        if(building == null || building.getBuildingname() == null || "".equals(building.getBuildingname())){
            throw new RuntimeException("建筑物名称不能为空!");
        }

        // Building对象有效就更新
        buildingMapper.updateByPrimaryKeySelective(building);
    }

    @Override
    public void deleteBuilding(Integer buildingid) {
        // 判断buildingid是否有效
        if(buildingid == null){
            throw new RuntimeException("当前对象不存在");
        }

        // 执行删除
        buildingMapper.deleteByPrimaryKey(buildingid);
    }
}
