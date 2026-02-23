package com.reading.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reading.domain.dto.AccountLoginDTO;
import com.reading.domain.dto.PhoneLoginDTO;
import com.reading.domain.po.User;
import com.reading.domain.vo.UserInfoVO;

public interface UserService extends IService<User> {
    void register(AccountLoginDTO userLoginDTO);

    UserInfoVO loginByAccount(AccountLoginDTO userLoginDTO);

    UserInfoVO loginByPhone(PhoneLoginDTO phoneLoginDTO);

    void sendPhoneCode(String phone);
}
