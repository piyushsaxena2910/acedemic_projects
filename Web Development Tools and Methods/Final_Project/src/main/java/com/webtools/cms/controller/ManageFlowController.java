package com.webtools.cms.controller;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Page;

@Controller
@RequestMapping("/admin/manageApplicationFlow.htm")
public class ManageFlowController {
	private static final Logger logger = LoggerFactory.getLogger(ManageFlowController.class);
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doSubmitAction(@ModelAttribute("application") Application application, BindingResult result,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String applicationName = application.getApplicationName();
		System.out.println("Application name recieved ->" + applicationName);
		
		String[] sequence = request.getParameterValues("flow");
		String sequenceToSave = "";
		for(int i = 0; i < sequence.length; i++){
			sequenceToSave = sequenceToSave + " " + String.valueOf(sequence[i]);
		}
		sequenceToSave = sequenceToSave + " " + request.getParameter("productCatalogID");
		System.out.println("Sequence to save" + sequenceToSave);
		ApplicationDAO applicationDAO = new ApplicationDAO();
		applicationDAO.updateSequence(applicationName,sequenceToSave);
		ModelAndView mv = new ModelAndView("home");
	     return mv;
	}
	
}
