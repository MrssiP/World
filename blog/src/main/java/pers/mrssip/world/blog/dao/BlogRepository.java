package pers.mrssip.world.blog.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import pers.mrssip.world.blog.domain.Blog;

/**
 * @author MrssiP
 * @date 2018/11/06
 */

@Component
public interface BlogRepository extends CrudRepository<Blog, Long> {}
