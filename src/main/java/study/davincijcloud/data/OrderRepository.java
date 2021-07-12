package study.davincijcloud.data;

import study.davincijcloud.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
