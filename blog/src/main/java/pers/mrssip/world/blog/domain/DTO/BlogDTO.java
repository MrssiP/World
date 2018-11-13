package pers.mrssip.world.blog.domain.DTO;

import lombok.Data;
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
}
