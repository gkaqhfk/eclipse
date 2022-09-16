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
    public void signupGET() {
        
    }
    
    //SignUp PSOT
    @RequestMapping(value="/signup.do", method=RequestMethod.POST)
    public String signupPOST(SignupVO signVO) {
            
        signupService.insertMember(signVO);
            
        return "home";
    }
    
    @RequestMapping("/idcheck.do")
    @ResponseBody
    public Map<Object, Object> idcheck(@RequestBody String username) {
        
        int count = 0;
        Map<Object, Object> map = new HashMap<Object, Object>();
 
        count = signupService.idcheck(username);
        map.put("cnt", count);
 
        return map;
    }
	    
}

