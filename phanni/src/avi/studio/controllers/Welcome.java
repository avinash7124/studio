package avi.studio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/HelloWeb")
public class Welcome {
	

	@RequestMapping(method = RequestMethod.GET)
     public String index(ModelMap model) {
	    System.out.println(model.getClass());


         return "index.html";
     }
}
