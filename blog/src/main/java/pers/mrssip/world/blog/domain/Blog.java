package pers.mrssip.world.blog.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author MrssiP
 * @date 2018/11/06
 */
@Data
public class Blog {

    @Id
    Long id;

    String title;
}
