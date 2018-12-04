package pers.mrssip.world.blog.domain.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

/**
 * @author MrssiP
 * @date 2018/11/21
 */

@Data
public class Author {

    @Id
    Integer id;

    Integer userId;

    String author;

    Integer statusCode;

    Timestamp createTime;

    Timestamp updateTime;
}
