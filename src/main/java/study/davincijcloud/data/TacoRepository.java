package study.davincijcloud.data;

import org.springframework.data.repository.CrudRepository;
import study.davincijcloud.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
//    Taco save(Taco design);
}
