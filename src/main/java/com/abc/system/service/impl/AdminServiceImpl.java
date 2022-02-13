package com.abc.system.service.impl;

import com.abc.system.dto.AdminDTO;
import com.abc.system.dto.json.request.LoginRequestDTO;
import com.abc.system.entity.Admin;
import com.abc.system.exception.ApplicationException;
import com.abc.system.repo.AdminRepo;
import com.abc.system.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/13/22
 **/

@Service
@Transactional
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepo repo;
    private final ModelMapper mapper;

    @Override
    public AdminDTO adminLogin(LoginRequestDTO dto) {
        Optional<Admin> admin = repo.findAdminByNameAndPassword(dto.getUsername(), dto.getPassword());
        if (admin.isPresent()) {
            return mapper.map(admin.get(), AdminDTO.class);
        }
        throw new ApplicationException("401", "Incorrect username or password");
    }
}
