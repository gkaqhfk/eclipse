package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SignupVO;

import org.zerock.service.SignupService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Controller
@RequestMapping("/signup/*")
public class SingupController {
   
	@Inject
    private SignupService signupService;
    
    //SignUp GET
    @RequestMapping(value="/signup.do", method=RequestMethod.GET)
    public String signupGET() {
        return "signup/signup";
    }
    
    //SignUp PSOT
    @RequestMapping(value="/signup.do", method=RequestMethod.POST)
    public String signupPOST(SignupVO signVO) {
            
        signupService.insertMember(signVO);
            
        return "home";
    }
    
    @RequestMapping("/idcheck.do")
    @ResponseBody
    public Map<Object, Object> idcheck(@RequestBody SignupVO signVO) {
        Map<Object, Object> map = new HashMap<>();
        int count = signupService.idcheck(signVO);
        map.put("cnt", count);
        return map;
    }
    
	    
}

