package com.qf.j1904;

import com.qf.j1904.mapper.Tb1Mapper;
import com.qf.j1904.pojo.Tb1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class J19040904SpbOracleApplicationTests {
    @Autowired
    private Tb1Mapper tb1Mapper;
    @Test
    public void contextLoads() {
        List<Tb1> all=tb1Mapper.findAll();
        for (Tb1 tb:all) {
            System.out.println(tb);
        }
    }

}
