package com.explore.users.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.explore.users.service.ErrorService;

@Controller
public class CustomErrorController implements ErrorController {

	@Autowired
	private ErrorService errorService;

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String renderErrorPage(final Model model,
			final HttpServletRequest request) {

		// Get the Http error code.
		final int error_code = getHttpStatusCode(request);
        
		// Generates Error message for corresponding Http Error Code.
		final String error_message = errorService
				.generateErrorMessage(error_code);

		model.addAttribute("errorMsg", error_message);
		return "error";
	}

	private int getHttpStatusCode(final HttpServletRequest request) {
		return (int) request.getAttribute("javax.servlet.error.status_code");
	}

	@Override
	public String getErrorPath() {	
		return "/error";
	}
}