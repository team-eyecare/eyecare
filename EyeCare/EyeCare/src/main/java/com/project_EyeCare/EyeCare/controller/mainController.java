package com.project_EyeCare.EyeCare.controller;

import com.project_EyeCare.EyeCare.Repository.ItemRepository;
import com.project_EyeCare.EyeCare.Repository.PdRepository;
import com.project_EyeCare.EyeCare.entity.PD;
import com.project_EyeCare.EyeCare.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class mainController {

    private final PdRepository pdRepository;

    @Autowired
    public mainController(PdRepository pdRepository) {
        this.pdRepository = pdRepository;
    }

    //메인페이지
    @GetMapping("/index")
    public String maindPd(Model model) {
        List<PD> samplePd = pdRepository.findAll();

        model.addAttribute("products", samplePd);
        return "/main";
    }

    //병원 찾기
    @GetMapping("/hospital")
    public String hospital() {
        return "/hospital";
    }



}