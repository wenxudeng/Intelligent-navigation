package edu.hust.top.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Region;
import edu.hust.top.dao.RegionMapper;
import edu.hust.top.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dwx
 * @create 2020-07-19 15:37
 */
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public void addRegion(Region region) {
        // 将region对象放入数据库
        regionMapper.insert(region);
    }

    @Override
    public PageInfo<Region> getRegionList(String keyword, Integer pageNum, Integer pageSize) {
        // 1.调用PageHelper的静态方法，开启分页功能
        PageHelper.startPage(pageNum, pageSize);

        // 2.执行查询
        List<Region> list = regionMapper.selectRegionListByKeyword(keyword);

        // 3.封装到PageInfo对象中
        return new PageInfo<>(list);
    }

    @Override
    public Region selectRegionById(Integer regionid) {
        // 调用dao层方法查询region对象
        Region region = regionMapper.selectByPrimaryKey(regionid);

        // 判断查到的region对象是否为空
        if(region == null){

            throw new RuntimeException("数据库中没有此对象");
        }

        return region;
    }
}
