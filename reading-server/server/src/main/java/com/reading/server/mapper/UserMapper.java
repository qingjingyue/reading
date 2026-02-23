package com.reading.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reading.domain.po.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {

}
