package pers.mrssip.world.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.mrssip.world.blog.repository.BlogRepository;
import pers.mrssip.world.blog.service.BlogService;

/**
 * @author MrssiP
 * @date 2018/11/7
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class BlogTest {

    @Autowired
    BlogService blogService;

    @Autowired
    BlogRepository blogRepository;

    @Test
    public void test(){

    }

    @Test
    public void listAll(){
        blogService.listAll();
    }



}


