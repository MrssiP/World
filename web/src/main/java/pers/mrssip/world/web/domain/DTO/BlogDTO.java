package pers.mrssip.world.web.domain.DTO;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author MrssiP
 * @date 2018/11/20
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