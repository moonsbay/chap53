package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import com.example.util.Alpha;
import com.example.util.Color;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AlphaController {
	
	@GetMapping("/alpha")
	String alpha(HttpServletRequest request) {
		
		Alpha[][] alphas = new Alpha[20][40];
		for(int i=0; i<20; i++) {
			for(int j=0; j<40; j++) {
				alphas[i][j] = new Alpha();
			}
		}
		
		request.setAttribute("alphas", alphas);
		
		return "alpha";
	}
	
	@GetMapping("/alpha2")
	String alpha2(Integer line, Integer column, String ch, Color fg, Color bg, HttpServletRequest request) {  //Charater ch로 바꾸면
		System.out.printf("[%s, %s]\n", line, column);
		Alpha[][] alphas = new Alpha[20][40];
		for(int i=0; i<20; i++) {
			for(int j=0; j<40; j++) {
				alphas[i][j] = new Alpha();
				alphas[i][j].setFg(Color.Black);
				alphas[i][j].setBg(Color.Black);
			}
		}
		if(line != null && column != null && ch != null) {
		  
			var alpha = new Alpha();
			alpha.setCh(ch.charAt(0));                                                    // alpha.setCh(ch); 가 된다
			alphas[line-1][column-1]= alpha;
			alpha.setFg(fg);
			alpha.setBg(bg);
		    
		}
		request.setAttribute("alphas", alphas);
		
		
		String[] chs = new String[26];
		for(int i=0; i<26; i++) {
			chs[i]=(char)('A'+i)+ "";
		}
		request.setAttribute("chs", chs);
		
		request.setAttribute("colors", Color.values());
		
		return "alpha2";
	}
	
}
