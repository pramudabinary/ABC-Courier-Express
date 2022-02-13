package com.abc.system.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/14/22
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Order implements Serializable {

    @Id
    private String order_id;
    private String customer_name;
    private String customer_address;
    private String receiver_name;
    private String parcel_weight;
}
