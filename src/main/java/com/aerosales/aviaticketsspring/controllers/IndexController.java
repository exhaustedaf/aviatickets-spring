package com.aerosales.aviaticketsspring.controllers;

import com.aerosales.aviaticketsspring.repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}
