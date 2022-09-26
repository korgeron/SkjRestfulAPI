package com.skj.skjapi.controller;


import com.skj.skjapi.models.Shirt;
import com.skj.skjapi.repos.Shirts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/shirts")
public class ApiController {

    private final Shirts shirts;

    public ApiController(Shirts shirts) {
        this.shirts = shirts;
    }

    @GetMapping("/all-products")
    public List<Shirt> allProducts() {
        return shirts.findAll();
    }



}
