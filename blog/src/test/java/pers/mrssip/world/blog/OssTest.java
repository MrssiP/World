package pers.mrssip.world.blog;

import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.PutObjectResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.mrssip.world.blog.manager.OssManager;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OssTest {

    @Autowired
    OssManager ossManager;

    @Value("${aliyun.oss.bucketName}")
    private String bucketName;

    @Test
    public void list(){
        ObjectListing objectListing = ossManager.list(bucketName, "");
        for (OSSObjectSummary objectSummary : objectListing.getObjectSummaries()) {
            System.out.println(" - " + objectSummary.getKey() + "  " +
                    "(size = " + objectSummary.getSize() + ")");
        }
    }

    @Test
    public void create() throws FileNotFoundException {
        PutObjectResult result = ossManager.upload(bucketName,"MESSI/test.txt",  new FileInputStream("D:\\project\\test.txt"));
    }

    @Test
    public void delete(){
        ossManager.delete(bucketName, "MESSI/test.txt");
    }

    @Test
    public void url(){
        System.out.println(ossManager.getUrl(bucketName, "MESSI/test.txt"));
    }

    static int x, y;

    @Test
    public void test() {
        x++;
        myMethod();
        System.out.println(x + y + ++x);
    }

    public static void myMethod() {
        y = x++ + ++x;
    }

}
