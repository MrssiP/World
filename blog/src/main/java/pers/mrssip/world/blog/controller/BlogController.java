package pers.mrssip.world.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.mrssip.world.blog.domain.Entity.Blog;
import pers.mrssip.world.blog.service.BlogService;

import java.util.List;

/**
 * @author MrssiP
 * @date 2018/10/12
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @ResponseBody
    @GetMapping("/listBlog")
    public List<Blog> listBlog(){
        return (List<Blog>) blogService.listAll();
    }


}
