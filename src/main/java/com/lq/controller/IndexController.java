package com.lq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: springboot-community
 * @Package: com.lq.controller
 * @ClassName: IndexController
 * @Author: liqiang
 * @Date: 2020/3/6 0006 15:40
 * @Version: 1.0
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
