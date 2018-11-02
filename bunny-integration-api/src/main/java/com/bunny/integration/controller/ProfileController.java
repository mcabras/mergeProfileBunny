package com.bunny.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bunny.integration.dto.ResultDto;
import com.bunny.integration.service.IAuthLinkedIn;
import com.bunny.integration.service.IMergeProfilesService;

@Controller
public class ProfileController {

	@Autowired
	private IMergeProfilesService mergeProfile;

	@Autowired
	private IAuthLinkedIn authLinkedIn;
	
	@RequestMapping("/profile")
	public void profile(@RequestParam(value = "code") String code, Model model) {
		model.addAttribute("code", code);
	}

	@RequestMapping("/merge")
	public void merge(@RequestParam(value = "code") String code, @RequestParam(value = "personId") String personId, Model model) {
		String accessToken = authLinkedIn.accessToken(code);
		ResultDto response = mergeProfile.mergeProfiles(accessToken, personId);
		model.addAttribute("id", response.getId());
		model.addAttribute("firstName", response.getFirstName());
		model.addAttribute("lastName", response.getLastName());
		model.addAttribute("headline", response.getHeadline());
		model.addAttribute("category", response.getCategory());
		model.addAttribute("role", response.getRole());
		model.addAttribute("fromMonth", response.getFromMonth());
		model.addAttribute("fromYear", response.getFromYear());
		model.addAttribute("toMonth", response.getToMonth());
		model.addAttribute("toYear", response.getToYear());
	}
	

}
