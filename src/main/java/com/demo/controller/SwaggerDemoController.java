package com.demo.controller;

import com.demo.dataObject.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/*
 *@ClassName: SwaggerDemoController
 *@Description: TODO
 *@author: 郑波
 *@date: 2019-04-02 22:17
 *@version: 1.0
 */
@RestController
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User s(User s){
        System.out.println(s);
        return s;
    }


}
