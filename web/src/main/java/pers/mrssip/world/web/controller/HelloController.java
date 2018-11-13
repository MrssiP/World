package pers.mrssip.world.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.mrssip.world.web.client.BlogClient;

import java.util.List;

/**
 * @author MrssiP
 * @date 2018/11/13
 */

@RestController
@RequestMapping("/web")
public class HelloController {

    @Autowired
    BlogClient blogClient;

    @ResponseBody
    @GetMapping(value = "/hello")
    public List<Object> hello() {
        return  blogClient.listBlog();
    }


}
