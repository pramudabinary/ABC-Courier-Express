package com.abc.system.repo;

import com.abc.system.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/15/22
 **/

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
}
