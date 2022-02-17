package com.abc.system.controller;

import com.abc.system.dto.OrderDTO;
import com.abc.system.exception.NotFoundException;
import com.abc.system.service.OrderService;
import com.abc.system.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/15/22
 **/

@RestController
@RequestMapping("api/v1/system/order")
@RequiredArgsConstructor
@CrossOrigin
public class OrderFormController {

    private final OrderService service;

    @PostMapping(path = "/place-order",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity placeOrder(@RequestBody OrderDTO dto) {
        service.placeOrder(dto);
        return new ResponseEntity
                (new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @PutMapping(path = "/update",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateOrder(@RequestBody OrderDTO dto) {
        if (dto.getCustomerName().trim().length() <= 0) {
            throw new NotFoundException("Customer Name Can not be Empty");
        } else if (dto.getParcelWeight().trim().length() <= 0) {
            throw new NotFoundException("Parcel Weight Can not be Empty");
        }
        service.updateOrder(dto);
        return new ResponseEntity
                (new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/delete",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteOrder(@RequestParam String order_id) {
        service.deleteOrder(order_id);
        return new ResponseEntity
                (new StandardResponse("200", "Done", null), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCustomers(String name) {
        ArrayList<OrderDTO> list = service.getAllPlaceOrdersByCustomerName(name);
        return new ResponseEntity(new StandardResponse("200", "Done", list), HttpStatus.OK);
    }

}
