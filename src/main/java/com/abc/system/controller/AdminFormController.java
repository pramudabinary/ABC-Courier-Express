package com.abc.system.controller;

import com.abc.system.dto.AdminDTO;
import com.abc.system.dto.json.request.LoginRequestDTO;
import com.abc.system.service.AdminService;
import com.abc.system.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/13/22
 **/

@RestController
@RequestMapping
@RequiredArgsConstructor
@CrossOrigin
public class AdminFormController {

    private final AdminService service;

    @PostMapping(path = "/0auth/token",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findAdminAndNameAnd(@RequestBody LoginRequestDTO dto) {
        AdminDTO adminDTO = service.adminLogin(dto);
        return new ResponseEntity
                (new StandardResponse("200", "Login Success", adminDTO), HttpStatus.OK);
    }

}
