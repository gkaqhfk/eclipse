package org.zerock.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/includes/*")

public class includesController {

@Autowired
	private HttpSession session;
	

	
	 @GetMapping("/header") 
	 public String list(HttpServletRequest request,Model model) throws Exception {
		 	
		
	        session.getAttribute("username");
	        log.info("username");
	        
			/*
			 * session.setAttribute("ssName", "admin");
			 */
			return "includes/header";
		
		 
	 }
	 
	 @GetMapping("/footer") 
	 public String getFooter(Model model) throws Exception {
		
			return "includes/footer";
		
		 
	 }

}
