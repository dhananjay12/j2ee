package com.mynotes.spring.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
 
 
@Controller
@RequestMapping("/")
public class AppController {
 
    @RequestMapping(value = { "/","/home"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }
 
    @RequestMapping(value = { "/products"}, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "products";
    }
 
    @RequestMapping(value = { "/admin"}, method = RequestMethod.GET)
    public String contactUs(ModelMap model) {
        return "admin";
    }
    
    @RequestMapping(value = { "/login"}, method = RequestMethod.GET)
    public String viewLogin(ModelMap model) {
        return "login";
    }
}
