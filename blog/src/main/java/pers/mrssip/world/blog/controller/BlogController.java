package pers.mrssip.world.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.mrssip.world.blog.domain.DTO.BlogDTO;
import pers.mrssip.world.blog.domain.Entity.Blog;
import pers.mrssip.world.blog.service.BlogService;

import java.util.List;
import java.util.Optional;

/**
 * @author MrssiP
 * @date 2018/10/12
 */
@Slf4j
@RestController
@RequestMapping("/blog")
public class BlogController{

    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public List<BlogDTO> list(){
        return blogService.list();
    }

    @GetMapping("/get/{id}")
    public BlogDTO get(@PathVariable Integer id){
        return blogService.get(id);
    }

    @PostMapping("/post")
    public Integer post(){
        return blogService.post();
    }

    @PutMapping("/put")
    public boolean put(@RequestBody Blog blog){
        return blogService.put(blog);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Integer id){
        return blogService.delete(id);
    }
}
