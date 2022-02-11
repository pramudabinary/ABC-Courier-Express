package com.abc.system.repo;

import com.abc.system.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {
}
