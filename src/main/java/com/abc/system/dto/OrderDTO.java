package com.abc.system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/14/22
 **/

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderDTO implements Serializable {

    private String order_id;
    private String customer_name;
    private String customer_address;
    private String receiver_name;
    private String parcel_weight;

}
