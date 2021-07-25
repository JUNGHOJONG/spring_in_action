package study.davincijcloud.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import study.davincijcloud.domain.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
//    Taco save(Taco design);
}
