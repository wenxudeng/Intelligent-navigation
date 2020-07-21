package edu.hust.top.test;

import edu.hust.top.bean.Beacon;
import edu.hust.top.dao.BeaconMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dwx
 * @create 2020-07-17 20:07
 */
// spring整合junit的注解
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config-mybatis.xml", "classpath:spring-config-tx.xml"})
public class MybatisTest {

    @Autowired
    private BeaconMapper beaconMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private Logger logger = LoggerFactory.getLogger(MybatisTest.class);

    @Test
    public void testSelectBeacon(){
        Beacon beacon = beaconMapper.selectByPrimaryKey(11);

        System.out.println(beacon.toString());
    }

    @Test
    public void testPasswordEncoder(){

        String encode = passwordEncoder.encode("123456");

        logger.info(encode);
    }
}
