package com.atguigu.crowd.mvc.handler;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.ParamData;
import com.atguigu.crowd.entity.Student;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.util.CrowdUtil;
import com.atguigu.crowd.util.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author JSQ
 * @ClassName TestHandler.java
 * @Description TODO
 * @createTime 2021年03月09日 23:25:00
 */
@Controller
public class TestHandler {
    @Autowired
    private AdminService adminService;

    Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @ResponseBody
    @RequestMapping("/send/array04.json")
    public ResultEntity<Student> testReceiveComposeObject(@RequestBody Student student, HttpServletRequest request) {
        logger.info(student.toString());

        boolean judgeResult = CrowdUtil.judgeRequestType(request);
        logger.info("judgeResult:" + judgeResult);

        //此处返回自己手动编辑的返回类型，ajax所接收的数据类型就应该是json类型
        return ResultEntity.successWithData(student);
    }

    @ResponseBody
    @RequestMapping("/send/array03.html")
    public String testReceiveArrayThree(@RequestBody List<Integer> array) {

        for (Integer number : array) {
            logger.info("number=" + number);
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping("/send/array02.html")
    public String testReceiveArrayTwo(ParamData paramData) {
        List<Integer> array = paramData.getArray();
        for (Integer number : array) {
            System.out.println("number=" + number);
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping("/send/array01.html")
    public String testReceiveArrayOne(@RequestParam("array[]") List<Integer> array) {
        for (Integer number : array) {
            System.out.println(number);
        }
        return "success";
    }

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap, HttpServletRequest request) {

        boolean judgeResult = CrowdUtil.judgeRequestType(request);
        logger.info("judgeResult:" + judgeResult);

        List<Admin> adminList = adminService.getAlll();
        modelMap.addAttribute("adminList", adminList);
        Logger logger = LoggerFactory.getLogger(TestHandler.class);
        System.out.println("------------------------");
        //2.根据不同日志级别打印日志
        logger.debug("*****************************");
        //System.out.println(10 / 0);
        String a = null;
        System.out.println(a.length());
        return "target";
    }
}
