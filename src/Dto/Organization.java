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
public abstract class Organization {
	private int size;

	public Organization() {
		this.size = 0;
	}

	public Organization(int size) {
		this.size = size;
	}

	// Getter & Setter

	public int getSize() {
		return this.size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	//Method

	public abstract void communicateByTool(); 

	public String toString() {
		return ("The organization's size is" + size);
	}
	
	

	
}
