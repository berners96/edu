package com.seedit.edu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sample")
public class SampleController {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/getSample.do")
	public void getSample(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.debug("===== getSample =====");
		System.out.println("getSample");
	}
}
