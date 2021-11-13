package com.example.web2is41rspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {
    @GetMapping("create")
    public String create(){
        return "create";
    }

    @GetMapping("read")
    public String read(){
        return "read";
    }

    @GetMapping("update")
    public String update(){
        return "update";
    }

    @GetMapping("delete")
    public String delete(){
        return "delete";
    }
}
