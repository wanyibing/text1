package com.wanyibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * BAxiugai111 
 * */
@Controller
public class MyController {

	@RequestMapping("list")
	public String getlist() {
		// A xiugai le yihang
		//BBBBBBBBBBB
		return "list";
		// B xiugai  yihang 
	}
	
}
