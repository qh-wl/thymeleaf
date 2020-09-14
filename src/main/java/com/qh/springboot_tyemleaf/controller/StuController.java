package com.qh.springboot_tyemleaf.controller;

import com.qh.springboot_tyemleaf.entity.Stu;
import com.qh.springboot_tyemleaf.mapper.StuMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("stu")
public class StuController {
    @Resource
    StuMapper stuMapper;

    @RequestMapping("findAll")
    public ModelAndView findAll(Model model){
        List<Stu> stus = stuMapper.selectAll();
        model.addAttribute("stuList",stus);
        return new ModelAndView("stuShow","stumodel",model);
    }
    @PostMapping("/add")
    public ModelAndView add(Stu stu){
        int i = stuMapper.insertSelective(stu);
        return new ModelAndView("redirect:/stu/findAll");
    }

    @RequestMapping("/findById")
    public ModelAndView findById(Integer stuId,Model model){
        Stu byId = stuMapper.findById(stuId);
        model.addAttribute("stuInfo",byId);
        return new ModelAndView("update","stumodel",model);
    }
    @PostMapping("/update")
    public ModelAndView update(Stu stu){
        int i = stuMapper.updateByPrimaryKeySelective(stu);
        return new ModelAndView("redirect:/stu/findAll");
    }
    @RequestMapping("/delete")
    public ModelAndView delete(Integer stuId){
        //int i = stuMapper.
        Integer integer = stuMapper.deleteById(stuId);
        return new ModelAndView("redirect:/stu/findAll");
    }
}
