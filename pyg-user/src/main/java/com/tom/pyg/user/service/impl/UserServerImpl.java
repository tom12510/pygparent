package com.tom.pyg.user.service.impl;

import com.tom.pyg.user.mapper.PygUserMapper;
import com.tom.pyg.user.service.IUserServer;
import com.user.entity.PygUser;
import com.user.vo.PygUserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements IUserServer {

    @Autowired
    private PygUserMapper pygUserMapper;

    @Override
    public PygUserVO getUserById(Long userId) {
        PygUser pygUser = pygUserMapper.selectById(userId);
        PygUserVO pygUserVO = new PygUserVO();
        BeanUtils.copyProperties(pygUser,pygUserVO);
        return pygUserVO;
    }
}
