package com.spinach.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spinach.entity.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long userid);
}
