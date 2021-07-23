package study.davincijcloud.data;

import org.springframework.data.repository.CrudRepository;
import study.davincijcloud.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
