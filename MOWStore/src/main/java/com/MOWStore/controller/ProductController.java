package com.MOWStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MOWStore.entity.Product;
import com.MOWStore.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService ProductService;
	
	@RequestMapping("/product/list")
	public String list(Model model, @RequestParam("cid") Optional<String> cid) {
		if(cid.isPresent()) {
			List<Product> list = ProductService.findByCategoryId(cid.get());
			model.addAttribute("items", list);
		}
		else {
			List<Product> list = ProductService.findAll();
			model.addAttribute("items", list);
		}
		
		return "product/list3";
	}
	@RequestMapping("/product/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Product item = ProductService.findById(id);
		model.addAttribute("item",item);
		return "product/detail";
	}
	
}
