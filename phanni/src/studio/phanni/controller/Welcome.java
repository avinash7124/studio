package studio.phanni.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class Welcome {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		System.out.println(model.getClass());
		return "welcome";
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(ModelMap model) {
		System.out.println(model.getClass() + " error");
		return "main/error404";
	}
	

}
