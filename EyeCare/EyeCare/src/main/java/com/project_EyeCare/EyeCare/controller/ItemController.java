package com.project_EyeCare.EyeCare.controller;

import com.project_EyeCare.EyeCare.Repository.PdRepository;
import com.project_EyeCare.EyeCare.entity.PD;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    @Autowired
    private final PdRepository pdRepository;

    @GetMapping("/products")
    public String productLIst(Model model) {
        List<PD> productList = pdRepository.findAll();
        model.addAttribute("products", productList);
        return "product/products";






//        List<Product> products = itemRepository.findAll();
//
//        System.out.println("=== Products from DB ===");
//        for (Product product : products) {
//            System.out.println("상품명: " + product.name + ", 가격: " + product.price);
//        }
//
//        model.addAttribute("products", products);
//        return "product/products";
    }
}