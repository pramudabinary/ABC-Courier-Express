package com.abc.system.exception;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/12/22
 **/

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}
