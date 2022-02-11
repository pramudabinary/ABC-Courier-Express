package com.abc.system.util;

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
@Getter
@Setter
public class StandardResponse {

    private String code;
    private String message;
    private Object date;
}
