package edu.hust.top.service;

import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Region;

import java.util.List;

/**
 * @author dwx
 * @create 2020-07-19 15:37
 */
public interface RegionService {

    void addRegion(Region region);

    PageInfo<Region> getRegionList(String keyword, Integer pageNum, Integer pageSize);

    Region selectRegionById(Integer regionid);

    void updateRegion(Region region);

    void deleteRegion(Integer regionid);

    List<Region> getRegionList();
}
