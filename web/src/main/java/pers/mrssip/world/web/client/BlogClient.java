package pers.mrssip.world.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MrssiP
 * @date 2018/11/13
 */

@Component
@FeignClient("blog")
public interface BlogClient {

    @GetMapping("/blog/list")
    List<Object> list();

    @GetMapping("/blog/get/{id}")
    Object get(@PathVariable("id") Integer id);

    @PostMapping("/blog/post")
    Integer post();

    @PutMapping("/blog/put")
    boolean put(@RequestBody Object blog);

    @DeleteMapping("/blog/delete/{id}")
    boolean delete(@PathVariable("id") Integer id);
}

