package com.jobiak.mvcjsp.model;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class SignupController 
{
	@GetMapping("/signup")
	public String doString(Model model)
	{
		SignupBean signupBean = new SignupBean();
		model.addAttribute("signupBean",signupBean);
		return "signup";
	}
	@PostMapping("/signupform")
	public String doStringForm(@Valid @ModelAttribute("signupBean")SignupBean signupBean,BindingResult errors,Model model)
	{
		System.out.println(signupBean);
		if(errors.hasErrors())
		{
			return "signup";
		}
		model.addAttribute("signupBean",signupBean);
		return "success";
		
	}

}
