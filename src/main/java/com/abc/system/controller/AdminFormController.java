package com.abc.system.controller;

import com.abc.system.dto.json.request.LoginRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
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

    @PostMapping(path = "/0auth/token",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void findAdminAndNameAnd(@RequestBody LoginRequestDTO dto) {

    }

}
