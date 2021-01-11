package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Member;

@Controller
public class RequestProc {

	@RequestMapping(value="/post")
	public  ModelAndView response(@ModelAttribute   ParamObject members) {

		ModelAndView mav =new  ModelAndView();
		mav.setViewName("index");
		mav.addObject("result", members.getMembers());

		return mav;

	}
	@RequestMapping(value="/")
	public String index(Model model) {

		ParamObject paramObject = new ParamObject();
		for (int i = 0; i < 10; i++ ) {
			paramObject.members.add(new Member());
		}
		model.addAttribute("paramObject", paramObject);

		return "index";

	}

	public static class ParamObject{
		private List<Member> members = new ArrayList<Member>();

		public void setMembers(List<Member> members) {
			this.members = members;
		}

		public List<Member> getMembers(){
			return members;
		}

	}
}