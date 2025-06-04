package com.project_EyeCare.EyeCare.controller;

import com.project_EyeCare.EyeCare.Repository.ItemRepository;
import com.project_EyeCare.EyeCare.Repository.PdRepository;
import com.project_EyeCare.EyeCare.entity.PD;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    @Autowired
    private final PdRepository pdRepository;
    private final ItemRepository itemRepository;

    @GetMapping("/products")
    public String productLIst(Model model) {
        List<PD> productList = pdRepository.findAll();
        model.addAttribute("products", productList);
        return "product/products";
    }



    //상품추가페이지
    @GetMapping("/write")
    String write(){
        return "/admin/adminproduct.html";
    }

    //상품 추가에 대한 내용
    @PostMapping("/add")
    String addPost(String brand,String name,int price){
        PD pd = new PD();
        pd.setBrand(brand);
        pd.setName(name);
        pd.setPrice(price);
        pdRepository.save(pd);
        return "redirect:/products";
    }




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