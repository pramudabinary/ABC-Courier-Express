package com.abc.system.service;

import com.abc.system.dto.AdminDTO;
import com.abc.system.dto.json.request.LoginRequestDTO;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 2/13/22
 **/

public interface AdminService {

    AdminDTO adminLogin(LoginRequestDTO dto);

}
