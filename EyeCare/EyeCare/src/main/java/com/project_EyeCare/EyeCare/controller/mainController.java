package com.project_EyeCare.EyeCare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    //메인페이지
    @GetMapping("/index")
    public String main() {
        return "/main.html";
    }

    //병원 찾기
    @GetMapping("/hospital")
    public String hospital() {
        return "/hospital.html";
    }



}