package com.abc.system.service;

import com.abc.system.dto.CustomerDTO;

import java.util.ArrayList;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

public interface CustomerService {

    void registerCustomer(CustomerDTO dto);

    void deleteCustomer(String id);

    CustomerDTO searchCustomer(String id);

    ArrayList<CustomerDTO> getAllCustomers();

    void updateCustomer(CustomerDTO dto);
}
