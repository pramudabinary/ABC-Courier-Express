package com.abc.system.repo;

import com.abc.system.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/13/22
 **/

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

    Optional<Admin> findAdminByNameAndPassword(String name, String password);
}
