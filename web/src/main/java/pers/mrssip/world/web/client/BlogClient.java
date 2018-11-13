package pers.mrssip.world.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author MrssiP
 * @date 2018/11/13
 */

@FeignClient("blog")
public interface BlogClient {

    @GetMapping("/blog/listBlog")
    List<Object> listBlog();
}

