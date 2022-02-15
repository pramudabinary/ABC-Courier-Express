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

    private String orderId;
    private String customerName;
    private String customerAddress;
    private String receiverName;
    private String parcelWeight;

}
