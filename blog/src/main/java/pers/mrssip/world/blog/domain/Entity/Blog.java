package pers.mrssip.world.blog.domain.Entity;

import lombok.Cleanup;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.util.Set;

/**
 * @author MrssiP
 * @date 2018/11/06
 */

@Data
public class Blog {

    @Id
    Integer id;

    String title;

    Integer classificationId;

    Integer authorId;

    String content;

    Integer readCount;

    Integer statusCode;

    Timestamp createTime;

    Timestamp updateTime;
}
