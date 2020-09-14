package com.qh.springboot_tyemleaf.test;

import com.qh.springboot_tyemleaf.entity.Stu;
import com.qh.springboot_tyemleaf.mapper.StuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
//
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Resource
    StuMapper stuMapper;

    @Test
    public void test(){
        List<Stu> stus = stuMapper.selectAll();
        System.out.println(stus);
    }
}
