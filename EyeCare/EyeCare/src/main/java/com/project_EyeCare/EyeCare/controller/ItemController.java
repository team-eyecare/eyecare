package com.project_EyeCare.EyeCare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    //상품페이지
    @GetMapping("/products")
    public String product(){
        return "/product/products.html";
    }

}
