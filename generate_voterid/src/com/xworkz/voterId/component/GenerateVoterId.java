package com.xworkz.voterId.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class GenerateVoterId {

	public GenerateVoterId() {
		System.out.println("created\t " + this.getClass().getSimpleName());
	}

	@RequestMapping("VoterId.do")
	public String generateVoterID(@RequestParam String vName, @RequestParam String father, @RequestParam String dob,
			@RequestParam String gender, @RequestParam String address,Model model) {
		System.out.println("invoked a genaratedVoterId method");
		
		ArrayList<Object> list=new ArrayList<>();
		
		list.add(vName);
		list.add(father);
		list.add(gender);
		list.add(dob);
		list.add(address);
		
		System.out.println(vName);
		System.out.println(father);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(address);
		
		model.addAllAttributes(list);
		model.addAttribute("VoterId","Your Voter Id is: "+ RandamIdGenerater.generateRandomChars());
		return "/success.jsp";
	}

}
