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
public class Colony extends Organization {

	private String place; 

	//Getter & setter

	public String getPlace() {
		return this.place;
	} 

	public void setPlace(String place) {
		this.place = place;
	} 

	//Constructor
	public Colony() {
		super();		
		this.place = "";
	}

	public Colony(int size, String place) {
		super(size);		
		this.place = place;
	}
	
	// Method
	@Override
	public void communicateByTool() {
		System.out.println("The colony communicate by sound");
	}

	public void grow() {
		System.out.println("An annual cycle of growth that begins in spring");
	}

	public void reproduce() {
		System.out.println("Colony can reproduce itself through a process");
	}

	public String toString() {
		return ("The colony size is " + this.getSize() + ", the colony's place is " + this.place);
	}

	
}
