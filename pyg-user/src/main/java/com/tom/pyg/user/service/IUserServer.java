package com.tom.pyg.user.service;

import com.user.vo.PygUserVO;

public interface IUserServer  {

    PygUserVO getUserById(Long userId);
}
