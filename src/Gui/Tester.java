/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dto.*;

/**
 *
 * @author Kaine
 */
public class Tester {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Colony obj1 = new BeeColony(2000, "honey", "land");
		System.out.println(obj1);
		obj1.grow();
		obj1.reproduce();
	}
	
}
