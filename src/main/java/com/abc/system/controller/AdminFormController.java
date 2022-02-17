package com.abc.system.controller;

import com.abc.system.dto.AdminDTO;
import com.abc.system.dto.CustomerDTO;
import com.abc.system.dto.OrderDTO;
import com.abc.system.dto.json.request.LoginRequestDTO;
import com.abc.system.service.AdminService;
import com.abc.system.service.CustomerService;
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
 * @since 2/13/22
 **/

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/system/admin")
@CrossOrigin
public class AdminFormController {

    private final AdminService service;
    private final CustomerService customerService;
    private final OrderService orderService;

    @PostMapping(path = "/0auth/token", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findAdminByNameAndPassword(@RequestBody LoginRequestDTO dto) {
        AdminDTO adminDTO = service.adminLogin(dto);
        return new ResponseEntity(new StandardResponse("200", "Login Success", adminDTO), HttpStatus.OK);
    }

    @GetMapping(path = "/customer-delete", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity(new StandardResponse("200", "Done", null), HttpStatus.OK);
    }

    @GetMapping(path = "/get-all-customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCustomers() {
        ArrayList<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity(new StandardResponse("200", "Done", allCustomers), HttpStatus.OK);
    }

    @GetMapping(path = "/get-all-orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllOrders() {
        ArrayList<OrderDTO> allPlaceOrders = orderService.getAllPlaceOrders();
        return new ResponseEntity(new StandardResponse("200", "Done", allPlaceOrders), HttpStatus.OK);
    }

    @DeleteMapping(path = "/cancel-order", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteOrder(@RequestParam String order_id) {
        orderService.deleteOrder(order_id);
        return new ResponseEntity(new StandardResponse("200", "Done", null), HttpStatus.OK);
    }
}
