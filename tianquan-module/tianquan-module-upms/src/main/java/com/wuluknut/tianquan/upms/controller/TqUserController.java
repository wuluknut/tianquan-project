package com.wuluknut.tianquan.upms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户配置类
 *
 * @author <a href="mailto:wuluknut@gmail.com" rel="nofollow">wuluknut</a>
 * @version 0.0.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class TqUserController {

    @RequestMapping("info")
    public String info() {
        return "user";
    }
}
