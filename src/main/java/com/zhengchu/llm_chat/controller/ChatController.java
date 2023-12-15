package com.zhengchu.llm_chat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/llm")
public class ChatController {
    @RequestMapping("/chat")
    public String say(){
        return "Hello World";
    }
}
