package pers.mrssip.world.blog.repository;

import org.springframework.data.repository.CrudRepository;
import pers.mrssip.world.blog.domain.Entity.Blog;

/**
 * @author MrssiP
 * @date 2018/11/06
 */
public interface BlogRepository extends CrudRepository<Blog, Integer> {}

