package com.wanyibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Axiugai
 * */
@Controller
public class MyController {

	@RequestMapping("list")
	public String getlist() {
		// A xiugai le yihang
		
		return "list";
		// B xiugai  yihang 
	}
	
}
