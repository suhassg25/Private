package com.ty.controller;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.ty.dao.UserDao;
import com.ty.dto.UserDto;



public class UserController {

	public static String random(String name)
	{	int sum=0;
		Random r=new Random();
		for(int i=1;i<5;i++)
		{
			int a=r.nextInt(1,9);
					sum=(sum*10)+a;
		}
		return name+sum;
	}
	
	public static void main(String[] args) {
		UserDto dto=new UserDto();
		UserDao dao=new UserDao();
		Scanner scanner=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter 1 to save \n2 to fetch all \n3 to update \n4 to find by id");
			switch(scanner.nextInt())
			{
			case 1 : {
				System.out.println("Enter name");
				dto.setName(scanner.next());
				System.out.println("Enter address");
				dto.setAddress(scanner.next());
				System.out.println("Company name ");
				String name =scanner.next();
				dto.setCompany(name);
				dto.setId(random(name));
				System.out.println("Enter salary");
				dto.setSalary(scanner.nextDouble());
				
				dao.saveUser(dto);
			}
			break;
			case 2 :
			{
				List<UserDto> l = dao.findall();
				for(UserDto u : l)
				{
					System.out.println(u.getId()+"  "+u.getName()+ "   "+u.getAddress()+"  "+u.getCompany()+"  "+u.getSalary() );
				}
			}break;
			case 3 :
			{
				System.out.println("Enter id");
			UserDto dto1	=dao.findUser(scanner.next());
				System.out.println("Enter name");
				dto1.setName(scanner.next());
				System.out.println("Enter address");
				dto1.setAddress(scanner.next());
				System.out.println("Company name ");
				String name =scanner.next();
				dto1.setCompany(name);
				System.out.println("Enter salary");
				dto1.setSalary(scanner.nextDouble());
				
				dao.update(dto1);
			}break;
			case 4:
			{
				System.out.println("Enter id");
				UserDto u =dao.findUser(scanner.next());
				System.out.println(u.getId()+"  "+u.getName()+ "   "+u.getAddress()+"  "+u.getCompany()+"  "+u.getSalary() );
			}break;
			
			default : System.out.println("Invalid selection");
			}
		}
	}
}
