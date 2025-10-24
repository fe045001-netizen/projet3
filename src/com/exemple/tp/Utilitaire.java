package com.exemple.tp;

public class Utilitaire {
	 
	 public static void affiche(double t[][]) {
		 for(int i=0;i<t.length;i++) {
			 for (int j=0;j<t[i].length;j++) {
				 System.out.println(t[i][j]+"");
				 
			 }
			 System.out.println();
		 } 
	 }
	  public static boolean regulier(double t[][]) {
		  int taille=t[0].length;
		  for(int i=1;i<t.length;i++) {
			  if(t[i].length!=taille)
				  return false ;
		  }
		  return true;
	}
	  public static double[] sommeLignes(double [][]t) {
		  double []somme=new double[t.length];
		  for(int i=0;i<t.length;i++) {
			  for(int j=0;j<t[i].length;j++)
			  somme [i]+=t[i][j];
		  }
		  return somme;
	  }
	  public static double[][] somme(double[][] t1, double[][] t2){
		  if(!regulier(t1)||!regulier(t2)) {
			  return null;
		  }
		  if(t1.length!=t2.length||t1[0].length!=t2[0].length) {
			  return null;
		  }
		  double[][] somme=new double[t1.length][t1[0].length];
		  for(int i=0;i<t1.length;i++) {
			  for(int j=0;j<t1[i].length;j++)
			  somme [i][j]=t1[i][j]+t2[i][j];
		  }
		  return somme;
		  
		  
	  }
	public static void main(String[] args) {
		double[][] t1= {{15,23,33},{44,56,76}};
		double[][] t2= {{20,22,32},{42,58,79}};
		System.out.println("Tableau t1 :");
		affiche(t1);System.out.println("Tableau t2 :");affiche(t2);
		System.out.println("Tableau t1 est-il régulier? "+regulier(t1)+"Tableau t2 est-il régulier?"+regulier(t2));
		System.out.println("la somme des lignes de Tableau t1 :");
		 double [] sommeLignest1= sommeLignes(t1);
		 for (int i = 0; i < sommeLignest1.length; i++) {
		        System.out.println("Ligne " + i + " : " + sommeLignest1[i]);
		    }
		 System.out.println("la somme du t1 et t2:");
		  double [][]somme=somme(t1,t2);
		  if (somme != null) {
		        affiche(somme);
		    } else {
		        System.out.println("Erreur, t1 et t2 irrégulier ou dimensions différentes");
		    }
				
		}

	}


