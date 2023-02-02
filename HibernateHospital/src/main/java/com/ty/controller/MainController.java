package com.ty.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;

import com.ty.dao.BranchDao;
import com.ty.dao.HospitalDao;
import com.ty.dao.PersonDao;
import com.ty.dto.Address;
import com.ty.dto.Branches;
import com.ty.dto.Encounter;
import com.ty.dto.Hospital;
import com.ty.dto.Medorder;
import com.ty.dto.Person;
import com.ty.dto.Tablets;

public class MainController {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		HospitalDao dao = new HospitalDao();
		Hospital hospital = new Hospital();
		BranchDao branchdao = new BranchDao();
		Person person = new Person();
		PersonDao personDao = new PersonDao();
		
	
		
		System.out.println("Enter the Choice 1 to add Hospital details \n2 to add Person details \n3 for hospital details");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter the hospital name");
			hospital.setName(sc.next());
			boolean a = true;
			List<Branches> listB = new ArrayList<Branches>();
			while (a) {
				System.out.println("Press 1 to create branch \n2 to cancel");
				switch (sc.nextInt()) {
				case 1:
					Branches branches = new Branches();
					Address address = new Address();
					System.out.println("Enter the branch name");
					branches.setName(sc.next());
					System.out.println("Enter the Phone");
					branches.setPhone(sc.nextLong());

					System.out.println("Enter the location");
					address.setLocation(sc.next());
					address.setBranches(branches);
					branches.setAddress(address);
					listB.add(branches);
					break;
				default:
					a = false;
					break;
				}
			}
			hospital.setBranches(listB);
			dao.saveHospital(hospital);
			System.out.println("Saved");
			break;
		case 2:
			System.out.println("Enter the person name");
			person.setName(sc.next());
			System.out.println("Enter the phone");
			person.setPhone(sc.nextLong());
			List<Encounter> listE = new ArrayList<Encounter>();
			List<Medorder> listM = new ArrayList<Medorder>();
			List<Tablets> listT = new ArrayList<Tablets>();
			boolean b = true;
			while (b) {
				System.out.println("Press 1 to add Encounter \n2 to cancel");
				switch (sc.nextInt()) {
				case 1:
					Encounter encounter = new Encounter();
					System.out.println("Enter the Reason");
					encounter.setReason(sc.next());
					
					encounter.setBranches(branchdao.findBranch());
					boolean c = true;
					while (c) {
						System.out.println(" press 1 to create medorder \n2 to cancel");
						switch (sc.nextInt()) {
						case 1:
							Medorder medorder = new Medorder();
							System.out.println("Enter The details");
							medorder.setDetails(sc.next());
							boolean d = true;
							while (d) {
								System.out.println(" press 1 to add tablets \n2 to cancel");
								switch (sc.nextInt()) {
								case 1:
									Tablets tablets = new Tablets();
									System.out.println("Enter the name");
									tablets.setName(sc.next());
									
									System.out.println("Enter the price");
									tablets.setPrice(sc.nextInt());
									listT.add(tablets);
									break;

								default:
									d = false;
									
									
								}
							}
							medorder.setTablets(listT);
							listM.add(medorder);
							break;
						default:
							c = false;
							
						}
					}
					encounter.setMedorder(listM);
					listE.add(encounter);
					break;
					
								
				default:
					b = false; 
					break;
				}

			}
			person.setEncounter(listE);
			personDao.savePerson(person);
			System.out.println("saved");
			break;
		case 3 :
		{
			List<Hospital> hosp=  dao.getAll();
			for(Hospital h : hosp)
			{
				System.out.println(h);
			}
		}break;
		default : System.out.println("Provide a valid input");
			
		}
	}
}
