package de.hfu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Scanner wird benutzt für die Eingabe
		String eingabe;
		Scanner scan = new Scanner(System.in);
		
		eingabe = scan.nextLine();
		
		//Hier wird Alles Groß
		eingabe  = eingabe.toUpperCase();
		
		//Hier wird die Ausgabe wieder ausgegeben
		System.out.println(eingabe);

	}

}
