package com.bunny.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bunny.integration.service.IAuthLinkedIn;

@Controller
public class InitialController {

	@Autowired
	private IAuthLinkedIn authLinkedIn;

	@RequestMapping("/mergeProfiles")
	public void mergeProfiles(Model model) {
		String urlAuthLinked = authLinkedIn.authenticationLinkedUrl();
		model.addAttribute("urlAuthLinked", urlAuthLinked);
	}

}
