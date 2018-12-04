package pers.mrssip.world.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.mrssip.world.web.client.BlogClient;
import pers.mrssip.world.web.domain.Result;

import java.util.List;

/**
 * @author MrssiP
 * @date 2018/11/23
 */

@RestController
@RequestMapping("/blog")
public class BlogController extends BaseController {

    @Autowired
    BlogClient blogClient;

    @GetMapping("/list")
    public Result list(){
        return success(blogClient.list());
    }

    @GetMapping("/get/{id}")
    public Result get(@PathVariable Integer id){
        return success(blogClient.get(id));
    }

    @PostMapping("/post")
    public Result post(){
        return success(blogClient.post());
    }

    @PutMapping("/put")
    public Result put(@RequestBody Object blog){
        return success(blogClient.put(blog));
    }

    @DeleteMapping("/delete/{id}")
    public Result deleta(@PathVariable Integer id){
        return success(blogClient.delete(id));
    }
}
