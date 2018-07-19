package com.luying.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspTest {
	@ResponseBody
	@RequestMapping("/hello")
	public Map<String, Object> hello(Map<String, Object> map){
		map.put("name", "lijian");
		return map;
	}
}
