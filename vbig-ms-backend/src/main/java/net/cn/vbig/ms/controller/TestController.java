/*
 * 天虹商场股份有限公司所有.
 */
package net.cn.vbig.ms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2019/5/30
 */
@RestController
@RequestMapping("/tst")
public class TestController {

    @PostMapping("/test")
    public String test(String l) {
        return "ssssss";
    }

}
