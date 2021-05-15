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
public class FPTUniversity extends University implements Role {

	private String place ;

	//Constructor
	
	public FPTUniversity() {
		super();
		this.place = "";
	}

	public FPTUniversity(int size, String name, String place) {
		super(size, name);
		this.place = place;
	}

	
	//Getter & setter

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	//Method
	
	@Override
	public void createWorker() {
		System.out.println("Providing human resources");
	}

	public String toString() {
		return ("FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon"); 
	}
		
}
