package pers.mrssip.world.blog.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pers.mrssip.world.blog.domain.Entity.Blog;
import pers.mrssip.world.blog.manager.OssManager;
import pers.mrssip.world.blog.repository.BlogRepository;

/**
 * @author MrssiP
 * @date 2018/10/12
 */

@Slf4j
@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private OssManager ossManager;

    @Value("${aliyun.oss.bucketName}")
    private String bucketName;

    //TODO Blog的业务支持

    /**
     * 所有博客列表
     *
     * */
    public Iterable<Blog> listAll() {

        log.info("test");
        return blogRepository.findAll();

//        ObjectListing objectListing = ossManager.list(bucketName, "");
    }

}


