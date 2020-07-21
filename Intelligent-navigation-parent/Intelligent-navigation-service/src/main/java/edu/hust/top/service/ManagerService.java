package edu.hust.top.service;

import edu.hust.top.bean.Manager;

/**
 * @author dwx
 * @create 2020-07-18 8:45
 */
public interface ManagerService {


    Integer doLogin(Manager manager);

    void changeManagerPassword(Integer namagerid, String oldPwd, String newPwd, String newPwd2);
}
