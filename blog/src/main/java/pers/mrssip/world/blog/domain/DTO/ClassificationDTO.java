package pers.mrssip.world.blog.domain.DTO;

import lombok.Data;
import pers.mrssip.world.blog.domain.Entity.Classification;

import java.sql.Timestamp;

/**
 * @author MrssiP
 * @date 2018/11/8
 */

@Data
public class ClassificationDTO {

    Integer id;

    String classification;

    Integer statusCode;

    Timestamp createTime;

    Timestamp updateTime;

    public ClassificationDTO(Classification classification){
        this.id = classification.getId();
        this.classification = classification.getClassification();
        this.statusCode = classification.getStatusCode();
        this.createTime = classification.getCreateTime();
        this.updateTime = classification.getUpdateTime();
    }
}
