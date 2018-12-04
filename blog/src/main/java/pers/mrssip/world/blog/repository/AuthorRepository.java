package pers.mrssip.world.blog.repository;

import org.springframework.data.repository.CrudRepository;
import pers.mrssip.world.blog.domain.Entity.Author;

/**
 * @author MrssiP
 * @date 2018/11/21
 */

public interface AuthorRepository extends CrudRepository<Author, Integer> {}
