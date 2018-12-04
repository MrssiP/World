package pers.mrssip.world.blog.domain.DTO;

import lombok.Data;
import pers.mrssip.world.blog.domain.Entity.Author;

import java.sql.Timestamp;

/**
 * @author MrssiP
 * @date 2018/11/8
 */

@Data
public class AuthorDTO {

    Integer id;

    Integer userId;

    String author;

    Integer statusCode;

    Timestamp createTime;

    Timestamp updateTime;

    public  AuthorDTO(Author author){
        this.id = author.getId();
        this.userId = author.getUserId();
        this.author = author.getAuthor();
        this.statusCode = author.getStatusCode();
        this.createTime = author.getCreateTime();
        this.updateTime = author.getUpdateTime();
    }

}
