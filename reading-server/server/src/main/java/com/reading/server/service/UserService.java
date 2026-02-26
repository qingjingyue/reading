package com.reading.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reading.domain.dto.EmailLoginDTO;
import com.reading.domain.dto.PhoneLoginDTO;
import com.reading.domain.po.User;
import com.reading.domain.vo.UserInfoVO;

public interface UserService extends IService<User> {


    UserInfoVO loginByPhone(PhoneLoginDTO phoneLoginDTO);

    void sendVerifyCode(String type, String value);

    UserInfoVO loginByEmail(EmailLoginDTO emailLoginDTO);
}
