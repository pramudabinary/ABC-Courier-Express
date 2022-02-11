package com.abc.system.service.impl;

import com.abc.system.dto.CustomerDTO;
import com.abc.system.entity.Customer;
import com.abc.system.exception.ValidateException;
import com.abc.system.repo.CustomerRepo;
import com.abc.system.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo repo;
    private final ModelMapper mapper;

    @Override
    public void registerCustomer(CustomerDTO dto) {
        if (repo.existsById(dto.getCode())) {
            throw new ValidateException("Customer Already Exist");
        }
        repo.save(mapper.map(dto, Customer.class));
    }

}
