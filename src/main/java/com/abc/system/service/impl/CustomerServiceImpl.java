package com.abc.system.service.impl;

import com.abc.system.dto.CustomerDTO;
import com.abc.system.entity.Customer;
import com.abc.system.repo.CustomerRepo;
import com.abc.system.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

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
        repo.save(mapper.map(dto, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }

}
