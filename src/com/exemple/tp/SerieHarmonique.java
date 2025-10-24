package com.exemple.tp;
import java.util.Scanner;
public  class SerieHarmonique {
  public static double somme(int n) {
	double somme=0.0 ;
	for(int i = 1;i<=n;i++)
	{
		somme += 1.0 / i;

	}
	return somme;

}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     System.out.print("Entrez la valeur de n : ");
     int n = sc.nextInt();

     if (n <= 0) {
         System.out.println("n doit être un entier positif !");
     } else {
         double s = somme(n);
         System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + s);
     }

     sc.close();
 
	

}
}


