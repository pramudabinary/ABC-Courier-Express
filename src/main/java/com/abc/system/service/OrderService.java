package com.abc.system.service;

import com.abc.system.dto.OrderDTO;

import java.util.ArrayList;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/15/22
 **/

public interface OrderService {

    void placeOrder(OrderDTO dto);

    void deleteOrder(String id);

    OrderDTO searchOrder(String id);

    ArrayList<OrderDTO> getAllPlaceOrders();

    void updateOrder(OrderDTO dto);

}
