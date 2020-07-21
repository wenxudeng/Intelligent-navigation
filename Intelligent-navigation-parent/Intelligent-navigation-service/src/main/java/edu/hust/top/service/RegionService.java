package edu.hust.top.service;

import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Region;

/**
 * @author dwx
 * @create 2020-07-19 15:37
 */
public interface RegionService {

    void addRegion(Region region);

    PageInfo<Region> getRegionList(String keyword, Integer pageNum, Integer pageSize);

    Region selectRegionById(Integer regionid);
}
