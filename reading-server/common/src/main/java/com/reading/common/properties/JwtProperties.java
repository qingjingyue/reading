package com.reading.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "reading.jwt")
public class JwtProperties {

    // 请求头中的令牌名称
    private String tokenName = "token";
    // 密钥
    private String secretKey = "secretKey";
    // 过期时间(秒)
    private Long ttl = 24 * 60 * 60L;


}
