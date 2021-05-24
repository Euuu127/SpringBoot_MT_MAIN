package com.iu.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iu.s1.board.BoardVO;

/**
=======================================
             Thymeleaf Project
=======================================
*/

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		//model.addAttribute("message", "Thymeleaf Project");
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(1L);
		boardVO.setTitle("title");
		boardVO.setWriter("writer");
		
		model.addAttribute("user", "mark");
		model.addAttribute("msg", "markonyou");
		
		System.out.println(boardVO.toString());
		return "index";
	}

}
