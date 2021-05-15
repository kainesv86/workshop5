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
public class FPTUniversity extends Colony implements Role {

	private String type;

	//Constructor
	
	public FPTUniversity() {
		super();
		this.type = "";
	}

	public FPTUniversity(int size, String type, String place) {
		super(size, place);
		this.type = type;
	}

	
	//Getter & setter

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//Method
	
	@Override
	public void createWorker() {
		System.out.println("Worker bees perform all the work of the bees");
	}

	public String toString() {
		return ("The colony's type is " + this.type + ", size about " + this.getSize() + ", and the place is " + this.getPlace()); 
	}
		
}
