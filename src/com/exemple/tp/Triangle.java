package com.exemple.tp;
import java.util.Scanner;

public class Triangle {
	
	public static void triangleEtoile(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("");
			}
			for(int e=1;e<=2*i-1;e++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("entrez le nombre de lignes voulu?");
		int n=sc.nextInt();
		
		triangleEtoile(n);
		
		  sc.close();
	}

}
