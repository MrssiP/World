package pers.mrssip.world.blog.manager;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * @author MrssiP
 * @date  2018/10/12
 *
 * 面向OSS上的object进行CRUD
 * 目前仅对阿里云{mrssip} Bucket操作
 *
 * TODO 后期移植到zone项目 通过eureka调用
 * */

@Component
public class OssManager {

    @Value("${aliyun.oss.endpoint}")
    private String endpoint;
    @Value("${aliyun.oss.accessKeyId}")
    private String accessKeyId;
    @Value("${aliyun.oss.accessKeySecret}")
    private String accessKeySecret;

    /**
     * 上传文件
     * @param bucketName bucket
     * @param objectName object
     *
     * */
    public PutObjectResult upload(String bucketName, String objectName, InputStream inputStream){
        OSSClient ossClient = getClient();
        try {
            return ossClient.putObject(bucketName, objectName, inputStream);
        }catch (Exception e) {

        } finally{
            ossClient.shutdown();
        }
        return null;
    }

    /**
     * 列举所有的object
     * */
    public ObjectListing list(String bucketName, String prefix){
        OSSClient ossClient = getClient();
        try {
            return ossClient.listObjects(new ListObjectsRequest(bucketName).withPrefix(prefix));
        }catch (Exception e) {

        } finally{
            ossClient.shutdown();
        }
        return null;
    }


    public boolean delete(String bucketName, String objectName){
        OSSClient ossClient = getClient();
        try {
            if(ossClient.doesObjectExist(bucketName, objectName)){
                ossClient.deleteObject(bucketName, objectName);
                return true;
            }else {
                System.out.println("object do not exist");
            }
        }catch (Exception e) {

        } finally{
            ossClient.shutdown();
        }
        return false;
    }

    /**
     * 获取文件对应的url
     * */
    public String getUrl(String bucketName, String objectName){
        //TODO 通过签名访问
        return bucketName + "." + endpoint + "/" + objectName;
    }

    /**
     * 生成OSSClient
     * */
    private OSSClient getClient(){
        return new OSSClient(endpoint, accessKeyId, accessKeySecret);
    }


}