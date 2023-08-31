package com.Onesoft.DeploymentPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Deployment {

	@GetMapping(value="/deployment")
	public String getval()
	{
		return "Welcomee=:::The Code is Successfully Deployed";
	}

}
