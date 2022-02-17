package com.abc.system.controller;

import com.abc.system.dto.CustomerDTO;
import com.abc.system.exception.NotFoundException;
import com.abc.system.service.CustomerService;
import com.abc.system.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

@RestController
@RequestMapping("api/v1/system/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerFormController {

    private final CustomerService service;

    @PostMapping(path = "/register",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity registerCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getName().trim().length() <= 0) {
            throw new NotFoundException("Customer Name Can not be Empty");
        }
        service.registerCustomer(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @PutMapping(path = "/update",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getName().trim().length() <= 0) {
            throw new NotFoundException("Customer Name Can not be Empty");
        }
        service.updateCustomer(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.CREATED);
    }

}
