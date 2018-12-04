package pers.mrssip.world.web.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.mrssip.world.web.client.BlogClient;
import pers.mrssip.world.web.domain.Result;

import java.util.List;

/**
 * @author MrssiP
 * @date 2018/11/13
 */

@RestController
@RequestMapping("/web")
public class HelloController extends BaseController {

    @Autowired
    BlogClient blogClient;

    @GetMapping(value = "/hello")
    public Result hello() {
        return success(blogClient.list());
    }
}
