package edu.hust.top.service;

import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Building;

/**
 * @author dwx
 * @create 2020-07-28 11:07
 */
public interface BuildingService {

    void addBuilding(Building building);

    PageInfo<Building> getBuildingList(Integer regionid, String keyword, Integer pageNum, Integer pageSize);

    Building selectBuildingById(Integer buildingid);

    void updateBuilding(Building building);

    void deleteBuilding(Integer buildingid);
}
