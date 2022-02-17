package com.abc.system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerDTO {

    private String code;
    private String name;
    private String address;
    private String email;
    private String gender;
    private String contact;
    private String password;
}
