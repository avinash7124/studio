package studio.phanni.exception;

import java.io.FileNotFoundException;

import javax.servlet.annotation.WebServlet;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
@EnableWebMvc
public class GenericException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(value = FileNotFoundException.class)
	public ModelAndView handleAllException(HttpRequestHandler httpreq, Exception ex) {
		System.out.println(ex.getClass() + " ");

		ModelAndView model = new ModelAndView("main/error404");
		model.addObject("errMsg", "this is Exception.class");
		return model;

	}

}
