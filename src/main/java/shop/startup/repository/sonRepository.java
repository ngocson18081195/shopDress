package shop.startup.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.startup.entity.Player;

/**
 * Create by ngocson on 23/02/2019
 */
@Repository
public interface sonRepository extends CrudRepository<Player, Integer> {
}
