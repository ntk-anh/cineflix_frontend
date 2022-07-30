package com.cybersoft.cineflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("")
	public ModelAndView home() {
		//modelandview:1-trả ra giao diện cho đường dẫn, 2-trả giá trị cho giao diện xài
		//vì đang trả ra modelandview nên sẽ gọi modelandview
		ModelAndView andView= new ModelAndView("home");//tên file giao diện
		
//		int soA=15;
//		int soB=10;
//		int soC=7;
//		int soD=10;
//		
//		int tong=tinhTong(soA, soB);
//		
//		andView.addObject("tong", tong);
		return andView; 
	}
	
	
	private int tinhTong(int soA, int soB) {
		int tong=0;
		tong=soA+soB;
		return tong;
	}
}
