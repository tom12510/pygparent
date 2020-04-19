package com.tom.pyg.user.controller;

import com.base.BaseResponse;
import com.tom.pyg.user.service.IUserServer;
import com.user.vo.PygUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pyg/user")
public class UserController {

    @Autowired
    private IUserServer userServer;

    @PostMapping("/getUserById")
    public BaseResponse getUserById(@RequestParam("userId")Long userId){
        PygUserVO  pygUserVO = userServer.getUserById(userId);
        return BaseResponse.SUCCESS(pygUserVO);
    }
}
