package com.reading.server.controller.user;


import com.reading.common.result.Result;
import com.reading.domain.dto.AccountLoginDTO;
import com.reading.domain.dto.PhoneLoginDTO;
import com.reading.domain.vo.UserInfoVO;
import com.reading.server.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Tag(name = "用户模块")
@Slf4j
@RestController
@RequestMapping("/user/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    public Result<Void> register(@Valid @RequestBody AccountLoginDTO userLoginDTO) {
        userService.register(userLoginDTO);
        return Result.success();
    }

    @Operation(summary = "账号密码登录")
    @PostMapping("/login/account")
    public Result<UserInfoVO> loginByAccount(@Valid @RequestBody AccountLoginDTO userLoginDTO) {
        UserInfoVO userInfoVO = userService.loginByAccount(userLoginDTO);
        return Result.success(userInfoVO);
    }

    @Operation(summary = "手机号验证码登录")
    @PostMapping("/login/phone")
    public Result<UserInfoVO> loginByPhone(@Valid @RequestBody PhoneLoginDTO phoneLoginDTO) {
        UserInfoVO userInfoVO = userService.loginByPhone(phoneLoginDTO);
        return Result.success(userInfoVO);
    }

    @Operation(summary = "获取验证码")
    @GetMapping("/login/phone/code")
    public Result<Void> getPhoneCode(@RequestParam("phone") String phone) {
        userService.sendPhoneCode(phone);
        return Result.success();
    }
}
