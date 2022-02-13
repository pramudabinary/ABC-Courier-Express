package com.abc.system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/13/22
 **/

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AdminDTO implements Serializable {

    private String id;
    private String name;
    private String address;
    private String email;
    private String contact;
    private String password;
}
