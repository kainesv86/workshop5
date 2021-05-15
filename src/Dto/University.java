/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dto;

/**
 *
 * @author Kaine
 */
public class University extends Organization{

	private String name;

	//Constructor
	
	public University() {
		super();
		this.name = "";
	}

	public University(int size, String name) {
		super(size);
		this.name = name;
	}

	
	//Getter & setter

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Method

	@Override
	public void communicateByTool() {
		System.out.println("In the university, people communicate by voice");
	}

	public void enroll() {
		System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
	}
	
	public void educate() {
		System.out.println("Provide education at university standard");
	}

	public String toString() {
		return ("encourage the advancement and development of knowledge");
	}
	
}



	
