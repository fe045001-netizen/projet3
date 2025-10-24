package com.exemple.tp;

import java.util.Scanner;

public class CarrePremiers {
	 public static void CarreImpaires(int n) {
	
	for(int i=0;i<n;i++) {
		int nombre=2*i+1;
		int carre=nombre*nombre;
		System.out.println(nombre+"a pour carre"+carre);
		
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("combien de valeurs voulu?");
		int n=sc.nextInt();
		
		CarreImpaires(n);
		
		  sc.close();

	}

}
