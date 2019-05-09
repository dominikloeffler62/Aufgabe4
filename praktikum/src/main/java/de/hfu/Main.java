package de.hfu;

import java.util.Scanner;

public class Main {

	/**Die Main Methode*/
	public static void main(String[] args) {
		
		String eingabe;
		Scanner scan = new Scanner(System.in);
		
		eingabe = scan.nextLine();
		
		eingabe  = eingabe.toUpperCase();
		
		System.out.println(eingabe);

	}

}
