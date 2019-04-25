package com.xworkz.orm_integration.dao;

import java.util.List;

import com.xworkz.orm_integration.dto.PostOfficeDTO;

public interface IPostOfficeDAO {

	// hiberanate save operation using spring LSFB
	// public Integer save(PostOfficeDTO dto);

	// hiberanate update operation using spring LSFB
	// public Integer updateByPincode(int pincode, String branchName);

	// hiberanate delete operation using spring LSFB
	// public Integer deleteByPincode(int pincode);

	// hiberanate fetch operation using spring LSFB
	//public List<PostOfficeDTO> fetchByAll();
	
	// hiberanate fetch operation using spring LSFB by pincode
	
	public List<PostOfficeDTO> fetchByPincode(int pincode);

}
