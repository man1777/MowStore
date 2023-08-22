package com.MOWStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MOWStore.entity.Product;
import com.MOWStore.service.AuthorityService;
import com.MOWStore.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	ProductService ProductService;
	@Autowired AuthorityService auth;
	@RequestMapping("/home")
	public String home(Model model,@RequestParam("cid") Optional<String> cid) {
		if(cid.isPresent()) {
			List<Product> list = ProductService.findByCategoryId(cid.get());
			model.addAttribute("items", list);
		}
		else {
			List<Product> list = ProductService.findAll();
			model.addAttribute("items", list);
		}
		return "layout/home";
	}
	
	@RequestMapping({"/admin","/admin/home/index"})
	public String admin() {
		
		return "redirect:/assets/admin/index.html";
	}
	
	@RequestMapping("/dangnhap")
	public String getSignUp() {
		return "layout/dangnhap";
	}
	
	@RequestMapping("/caytrongnha")
	public String getCayTrongNha() {
		return "product/list3";
	}
}
