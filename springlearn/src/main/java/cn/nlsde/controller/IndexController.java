package cn.nlsde.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangwj on 16/2/27.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/test")
    public Map test() {
        System.out.println("fs");
        Map<Integer, String> maps = new HashMap<Integer, String>();
        maps.put(1, "中国");
        maps.put(2, "2");
        maps.put(3, "3");
        return maps;
    }
}
