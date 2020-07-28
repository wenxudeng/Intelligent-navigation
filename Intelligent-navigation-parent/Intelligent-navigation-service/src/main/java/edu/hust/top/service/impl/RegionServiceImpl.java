package edu.hust.top.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.hust.top.bean.Region;
import edu.hust.top.bean.RegionExample;
import edu.hust.top.dao.RegionMapper;
import edu.hust.top.exception.RegionException;
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
        if(region == null || region.getRegionname() == null || "".equals(region.getRegionname())){
            throw new RegionException("园区名称不能为空");
        }
        // 将region对象放入数据库
        regionMapper.insertSelective(region);
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

    @Override
    public void updateRegion(Region region) {

        // 判断园区名称是否为空值
        if(region == null || region.getRegionname() == null || "".equals(region.getRegionname())){
            throw new RuntimeException("园区名称不能为空");
        }

        // 园区对象有效就更新
        regionMapper.updateByPrimaryKeySelective(region);
    }

    @Override
    public void deleteRegion(Integer regionid) {
        // 判断regionid是否有效
        if(regionid == null){
            throw new RuntimeException("当前对象不存在");
        }

        // 执行删除
        regionMapper.deleteByPrimaryKey(regionid);
    }

    @Override
    public List<Region> getRegionList() {

        // 不使用任何条件查询园区列表
        List<Region> regionList = regionMapper.selectByExample(new RegionExample());

        // 返回列表
        return regionList;
    }
}
