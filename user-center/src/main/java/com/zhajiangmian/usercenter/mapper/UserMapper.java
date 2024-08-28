package com.zhajiangmian.usercenter.mapper;

import com.zhajiangmian.usercenter.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 26481
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-08-25 11:18:32
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




