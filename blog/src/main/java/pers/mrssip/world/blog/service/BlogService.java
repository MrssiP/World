package pers.mrssip.world.blog.service;

import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pers.mrssip.world.blog.manager.OssManager;

/**
 * @author MrssiP
 * @date 2018/10/12
 */
@Service
public class BlogService {

    @Autowired
    private OssManager ossManager;

    @Value("${aliyun.oss.bucketName}")
    private String bucketName;

    //TODO Blog的CRUD

    public void listAll() {
        ObjectListing objectListing = ossManager.list(bucketName, "");
    }

}
