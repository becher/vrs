package com.project.controller;

import com.project.service.ITest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TestController6 {

	@SuppressWarnings("unused")
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ITest iTest;

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", iTest.getValue());
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warn message");
		logger.error("Error message");

		return "/WEB-INF/view/index.jsp";
	}

}
