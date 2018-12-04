package pers.mrssip.world.blog.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pers.mrssip.world.blog.domain.DTO.AuthorDTO;
import pers.mrssip.world.blog.domain.DTO.BlogDTO;
import pers.mrssip.world.blog.domain.DTO.ClassificationDTO;
import pers.mrssip.world.blog.domain.Entity.Author;
import pers.mrssip.world.blog.domain.Entity.Blog;
import pers.mrssip.world.blog.domain.Entity.Classification;
import pers.mrssip.world.blog.manager.OssManager;
import pers.mrssip.world.blog.repository.AuthorRepository;
import pers.mrssip.world.blog.repository.BlogRepository;
import pers.mrssip.world.blog.repository.ClassificationRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    private ClassificationRepository classificationRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private OssManager ossManager;

    @Value("${aliyun.oss.bucketName}")
    private String bucketName;

    //TODO Blog的业务支持

    /**
     * 所有博客列表
     *
     * */
    public List<BlogDTO> list() {
        return StreamSupport.stream(blogRepository.findAll().spliterator(),true).map(this::transferBlog).collect(Collectors.toList());
    }

    public BlogDTO get(Integer id) {
        return blogRepository.findById(id).map(this::transferBlog).orElse(null);
    }

    /**
     * 创建一个默认为空的blog
     * 状态码为0 表示不显示
     * 返回ID值
     * */
    public Integer post() {
        Blog blog = new Blog();
        blog.setReadCount(0);
        blog.setStatusCode(0);
        return blogRepository.save(blog).getId();
    }

    /**
     * 修改blog
     * 传入Title、Content、Author、Classfication
     * */
    public boolean put(Blog blog) {
        if(Optional.ofNullable(blog.getId()).filter(blogRepository::existsById).isPresent()){
            Blog result = blogRepository.findById(blog.getId()).orElse(new Blog());
            result.setStatusCode(1);
            result.setTitle(blog.getTitle());
            result.setContent(blog.getContent());
            result.setAuthorId(blog.getAuthorId());
            result.setClassificationId(blog.getClassificationId());
//            result.setUpdateTime(new Timestamp(System.currentTimeMillis()));
            blogRepository.save(result);
            log.info("Put blog : {}", blog);
            return true;
        }else {
            log.error("Can not put, there is not blog with ID : {}", blog.getId());
            return false;
        }
    }

    public boolean delete(Integer id) {
        if(blogRepository.existsById(id)){
            blogRepository.deleteById(id);
            log.info("Delete blog by blogId : {}", id);
            return true;
        }else {
            log.error("Can not delete, there is not blog with ID : {}", id);
            return false;
        }
    }

    /**
     * 将Blog类型转换为BlogDTO
     * */
    private BlogDTO transferBlog(Blog blog){

        ClassificationDTO classficationDTO = new ClassificationDTO(classificationRepository.findById(blog.getClassificationId()).orElse(new Classification()));
        AuthorDTO authorDTO = new AuthorDTO(authorRepository.findById(blog.getAuthorId()).orElse(new Author()));

        return new BlogDTO(blog, classficationDTO, authorDTO);
    }

}