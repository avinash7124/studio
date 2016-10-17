package studio.phanni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class Admin {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		System.out.println(model.getClass());
		return "admin/welcome";
	}

	
}
