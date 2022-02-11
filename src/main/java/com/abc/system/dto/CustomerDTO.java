package com.abc.system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerDTO implements Serializable {

    private String code;
    private String name;
    private String address;
    private String email;
    private String contact;
}
