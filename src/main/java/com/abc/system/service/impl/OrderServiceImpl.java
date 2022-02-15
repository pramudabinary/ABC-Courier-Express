package com.abc.system.service.impl;

import com.abc.system.dto.OrderDTO;
import com.abc.system.entity.Customer;
import com.abc.system.entity.Order;
import com.abc.system.exception.ValidateException;
import com.abc.system.repo.CustomerRepo;
import com.abc.system.repo.OrderRepo;
import com.abc.system.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/15/22
 **/

@Service
@Transactional
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepo repo;
    private final CustomerRepo customerRepo;
    private final ModelMapper mapper;

    @Override
    public void placeOrder(OrderDTO dto) {
        Optional<Customer> name = customerRepo.findCustomerByName(dto.getCustomerName());
        if (name.isPresent()) {
            repo.save(mapper.map(dto, Order.class));
        }
        throw new ValidateException("Customer Name is Wrong!!");

    }

    @Override
    public void deleteOrder(String id) {

    }

    @Override
    public OrderDTO searchOrder(String id) {
        return null;
    }

    @Override
    public ArrayList<OrderDTO> getAllPlaceOrders() {
        return null;
    }

    @Override
    public void updateOrder(OrderDTO dto) {

    }
}
