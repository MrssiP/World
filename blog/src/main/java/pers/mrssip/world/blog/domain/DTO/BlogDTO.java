package pers.mrssip.world.blog.domain.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import pers.mrssip.world.blog.domain.Entity.Blog;
import pers.mrssip.world.blog.domain.Entity.Classification;

import java.sql.Timestamp;

/**
 * @author MrssiP
 * @date 2018/11/8
 */

@Data
public class BlogDTO {

    Integer id;

    String title;

    ClassificationDTO classification;

    AuthorDTO author;

    String content;

    Integer readCount;

    Integer statusCode;

    Timestamp createTime;

    Timestamp updateTime;

    public BlogDTO(Blog blog, ClassificationDTO classification, AuthorDTO author){
        this.id = blog.getId();
        this.title = blog.getTitle();
        this.classification = classification;
        this.author = author;
        this.content = blog.getContent();
        this.readCount = blog.getReadCount();
        this.statusCode = blog.getStatusCode();
        this.createTime = blog.getCreateTime();
        this.updateTime = blog.getUpdateTime();
    }
}
