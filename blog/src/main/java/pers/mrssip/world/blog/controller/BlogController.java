package pers.mrssip.world.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.mrssip.world.blog.service.BlogService;

/**
 * @author MrssiP
 * @date 2018/10/12
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/listBlog")
    public String listAll(){
        blogService.listAll();
        return "yes";
    }


}
