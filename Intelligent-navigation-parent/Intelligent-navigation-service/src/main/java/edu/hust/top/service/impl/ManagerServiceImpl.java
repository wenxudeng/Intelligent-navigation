package edu.hust.top.service.impl;

import edu.hust.top.bean.Manager;
import edu.hust.top.bean.ManagerExample;
import edu.hust.top.constant.IntelligentNavigationConstant;
import edu.hust.top.dao.ManagerMapper;
import edu.hust.top.exception.ManagerException;
import edu.hust.top.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author dwx
 * @create 2020-07-18 8:45
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Integer doLogin(Manager manager) {
        // 1.判断传入的manager是否为空
        if(manager == null){
            throw new ManagerException(IntelligentNavigationConstant.MESSAGE_MANAGER_NULL);
        }
        // 2.获取管理员对象的姓名
        String managername = manager.getManagername();
        // 3.判断管理员姓名是否有效
        if(managername == null || managername.length() == 0){
            throw new ManagerException(IntelligentNavigationConstant.MESSAGE_MANAGER_NULL);
        }
        // 4.根据管理员姓名查询管理员
        ManagerExample managerExample = new ManagerExample();

        managerExample.createCriteria().andManagernameEqualTo(managername);

        List<Manager> managers = managerMapper.selectByExample(managerExample);
        // 5.判断查出的manager集合是否有效
        if(managers == null || managers.size() == 0){
            throw new ManagerException(IntelligentNavigationConstant.MESSAGE_MANAGER_NOT_EXISTS);
        }
        // 6.取出查到的管理员
        Manager managerFromDB = managers.get(0);

        // 7.匹配数据库表中的密码和表单密码
        if(!passwordEncoder.matches(manager.getManagerpwd(), managerFromDB.getManagerpwd())){
            throw new ManagerException(IntelligentNavigationConstant.MESSAGE_MANAGER_PASSWORD_ERROR);
        }

        return managerFromDB.getNamagerid();
    }

    @Override
    public void changeManagerPassword(Integer namagerid, String oldPwd, String newPwd, String newPwd2) {
        if(namagerid == null){
            throw new RuntimeException("系统错误！");
        }

        if(oldPwd == null || "".equals(oldPwd) || newPwd == null || "".equals(newPwd) || newPwd2 == null || "".equals(newPwd2)){
            throw new RuntimeException("密码不能为空");
        }

        if(!Objects.equals(newPwd, newPwd2)){
            throw new RuntimeException("两次新密码必须相同");
        }

        Manager manager = managerMapper.selectByPrimaryKey(namagerid);

        if(!passwordEncoder.matches(oldPwd, manager.getManagerpwd())){
            throw new RuntimeException("原始密码不正确");
        }

        String encode = passwordEncoder.encode(newPwd);

        Manager formManager = new Manager(namagerid, null, encode, null, null, null);

        managerMapper.updateByPrimaryKeySelective(formManager);
    }
}
