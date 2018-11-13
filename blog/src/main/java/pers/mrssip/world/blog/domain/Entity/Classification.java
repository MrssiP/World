package pers.mrssip.world.blog.domain.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

/**
 * @author MrssiP
 * @date 2018/11/8
 */

@Data
public class Classification {

    @Id
    Integer id;

    String classification;

    Integer statusCode;

    Timestamp createTime;

    Timestamp updateTime;

}
