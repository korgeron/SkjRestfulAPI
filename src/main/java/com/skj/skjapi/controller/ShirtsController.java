package com.skj.skjapi.controller;

import com.skj.skjapi.models.Shirt;
import com.skj.skjapi.repos.Shirts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShirtsController {

    @Autowired
    private Shirts shirts;

    @GetMapping("/shirts/add")
    public String addShirtHTML(){
        return "index";
    }

    @PostMapping("/shirts/add")
    public String addShirt(String name, String size, String price){
        shirts.save(new Shirt(name, size, Long.parseLong(price)));
        return "redirect:/api/shirts/all-products";
    }
}
