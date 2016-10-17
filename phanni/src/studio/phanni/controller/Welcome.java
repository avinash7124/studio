package studio.phanni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import studio.phanni.exception.ResourceNotFoundException;

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
		System.out.println(model.getClass() + " ");
		return "main/error404";
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceNotFoundException(ModelMap model) {
		System.out.println(model.getClass() + " ");
		return "main/error404";

	}

}
