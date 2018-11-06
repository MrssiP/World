package pers.mrssip.world.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pers.mrssip.world.blog.manager.OssManager;
import pers.mrssip.world.blog.dao.BlogRepository;

/**
 * @author MrssiP
 * @date 2018/10/12
 */
@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private OssManager ossManager;

    @Value("${aliyun.oss.bucketName}")
    private String bucketName;

    //TODO Blog的CRUD

    public void listAll() {

        blogRepository.findAll().forEach(System.out::println);

//        ObjectListing objectListing = ossManager.list(bucketName, "");
    }

}
