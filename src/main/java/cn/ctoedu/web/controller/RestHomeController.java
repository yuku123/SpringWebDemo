package cn.ctoedu.web.controller;

import cn.ctoedu.base.ApiResponse;
import cn.ctoedu.base.LoginUserUtil;
import cn.ctoedu.service.ISmsService;
import cn.ctoedu.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {
    @GetMapping("/test")
    public String test(String model) {
        return "Hello, wali";
    }
}
