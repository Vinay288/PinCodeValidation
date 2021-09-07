package com.bridgglabz.pincodevalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PinCodeValidation {
	public static boolean pincodeValidation(String pincode) {
		String pincodeRegex = "^[0-9]{6}$";
		return Pattern.matches(pincodeRegex, pincode);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter pincode");
		String pincode=scanner.nextLine();
		while(!pincodeValidation(pincode)) {
			System.out.println("Invalid pincode.Enter again");
			pincode=scanner.nextLine();
		}
		System.out.println("Valid pincode");
		String checkPincode = "A400088";
		System.out.println("Pincode to be checked:"+checkPincode);
		if(pincodeValidation(checkPincode))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		checkPincode = "400088B";
		System.out.println("Pincode to be checked:"+checkPincode);
		if(pincodeValidation(checkPincode))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}
}
