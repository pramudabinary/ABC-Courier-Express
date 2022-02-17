package com.abc.system.repo;

import com.abc.system.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Optional<Customer> findCustomerByName(String name);
}
