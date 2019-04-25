package com.xworkz.orm_integration.util;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.orm_integration.dao.PostOfficeDAO;
import com.xworkz.orm_integration.dto.PostOfficeDTO;


public class DaoTester {
	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/spring.xml");
		PostOfficeDAO dao=container.getBean(PostOfficeDAO.class);
		
		PostOfficeDTO dto=new PostOfficeDTO();
		
		dto.setPincode(560045);
		dto.setBranchName("Bangalore");
		dto.setWorking(false);
		
		//hibernate save operation using spring LSFB
		/*Integer id=dao.save(dto);
		if(id!=0)
		{
			System.out.println("successfully saved");
		}
		else
		{
			System.out.println("data invalid cannot save");
		}*/
		
		
		//hibernate update operation using spring LSFB
		/*Integer id=dao.updateByPincode(560045, "Mangalore");
		if(id!=0)
		{
			System.out.println("successfully updated");
		}
		else
		{
			System.out.println("data invalid cannot updated");
		}*/
		
		//hibernate delete operation using spring LSFB
		/*Integer id=dao.deleteByPincode(560045);
		if(id!=0)
		{
			System.out.println("successfully deleted");
		}
		else
		{
			System.out.println("data invalid cannot delete");
		}*/
		
		//hibernate fetchAll operation using spring LSFB
		/*List<PostOfficeDTO> dto2=dao.fetchByAll();
		System.out.println(dto2);*/
		
		List<PostOfficeDTO> dtos=dao.fetchByPincode(561207);
		System.out.println(dtos);
		
	}

}
