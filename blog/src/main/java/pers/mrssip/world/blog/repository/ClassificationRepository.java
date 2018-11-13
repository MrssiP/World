package pers.mrssip.world.blog.repository;

import org.springframework.data.repository.CrudRepository;
import pers.mrssip.world.blog.domain.Entity.Classification;

/**
 * @author MrssiP
 * @date 2018/11/8
 */
public interface ClassificationRepository extends CrudRepository<Classification, Integer> {


}
