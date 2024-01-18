package com.adballon.capstone.controller;

import com.adballon.capstone.service.PayService;
import com.adballon.capstone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/pay")
public class PayController {
    private final PayService payService;


}
