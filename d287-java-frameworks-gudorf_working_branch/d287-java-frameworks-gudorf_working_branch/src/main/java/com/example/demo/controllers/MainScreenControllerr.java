package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;

import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

/**
 *
 *
 *
 *
 */

@Controller
public class MainScreenControllerr {


    private final PartService partService;
    private final ProductService productService;









    public MainScreenControllerr(PartService partService, ProductService productService){
        this.partService=partService;
        this.productService=productService;
    }
    @GetMapping("/mainscreen")
    public String listPartsandProducts(Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){

        List<Part> partList=partService.listAll(partkeyword);
        theModel.addAttribute("parts",partList);
        theModel.addAttribute("partkeyword",partkeyword);

        List<Product> productList=productService.listAll(productkeyword);
        theModel.addAttribute("products", productList);
        theModel.addAttribute("productkeyword",productkeyword);
        return "mainscreen";
    }

    @Controller
    public static class MyController {
        @GetMapping("/about")
        public String about() {
            return "about";
        }
    }



}
