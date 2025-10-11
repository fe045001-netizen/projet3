package TP3;


import java.util.Scanner;

public class ExercicesTp3 {

	public static class  SerieHarmonique {
		public static double sommeHarmoni(int n) {
			double somme = 0.0;
			for (int i = 1; i <= n; i++) {
				somme += 1.0 / i;
			}
			return somme;
		}
	}

	public static class Triangle {
		public static void traingleEtoile(int n) {
			int largeur = 2 * n - 1;
			char[][] matrice = new char[n][largeur];
			for (int i = 0; i < n; i++) {
				int nbEtoiles = 2 * (i + 1) - 1;
				for (int j = 0; j < nbEtoiles; j++) {
					matrice[i][j] = '*';
				}
				for (int j = nbEtoiles; j < largeur; j++) {
					matrice[i][j] = ' ';
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < largeur; j++) {
					System.out.print(matrice[i][j]);
				}
				System.out.println();
			}
		}
	}

	public static class CareeImpaires {
		public static int carre(int x) {
			return x * x;
		}
	}

	public static class utilitaire {

		public static void affiche(double[][] t) {
			for (int i = 0; i < t.length; i++) {
	            for (int j = 0; j < t[i].length; j++) {
	                System.out.print(t[i][j] + " ");
	            }
	            System.out.println();
	       }

		}
	    public static boolean regulier(double[][] t) {
		        if (t.length == 0) return true;
		        int n = t[0].length;
		        for (int i = 1; i < t.length; i++) {
		            if (t[i].length != n) return false;
		        }
		        return true;
		    }
	    public static double[] sommeLignes(double[][] t) {
	        double[] sommes = new double[t.length];
	        for (int i = 0; i < t.length; i++) {
	            for (int j = 0; j < t[i].length; j++) {
	                sommes[i] += t[i][j];
	            }
	        }
	        return sommes;
	    }
	    
	    public static double[][] somme(double[][] t1, double[][] t2) {
	        if (!regulier(t1) || !regulier(t2)) return null;
	        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

	        int lignes = t1.length;
	        int colonnes = t1[0].length;
	        double[][] resultat = new double[lignes][colonnes];

	        for (int i = 0; i < lignes; i++) {
	            for (int j = 0; j < colonnes; j++) {
	                resultat[i][j] = t1[i][j] + t2[i][j];
	            }
	        }
	        return resultat;
	    }
	}
	public class RotationMatrice {

	   
	    public static void afficheM(int[][] A) {
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length; j++) {
	                System.out.print(A[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	   
	    public static void rotate90ClockwiseInPlace(int[][] A) {
	        int N = A.length;

	        for (int i = 0; i < N; i++) {
	            for (int j = i + 1; j < N; j++) {
	                int tmp = A[i][j];
	                A[i][j] = A[j][i];
	                A[j][i] = tmp;
	            }
	        }

	      
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N / 2; j++) {
	                int tmp = A[i][j];
	                A[i][j] = A[i][N - 1 - j];
	                A[i][N - 1 - j] = tmp;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez n:");
		int n = sc.nextInt();
		System.out.println("La somme est : " + SerieHarmonique.sommeHarmoni(n));

		System.out.print("Entrez la hauteur du triangle : ");
		int h = sc.nextInt();
		Triangle.traingleEtoile(h);

		System.out.print("Entrez le nombre de valeurs : ");
		int x = sc.nextInt();

		System.out.println("Combien de valeurs : " + x);
		for (int i = 0; i < x; i++) {
			int nombre = 2 * i + 1;
			System.out.println(nombre + " a pour carre " + CareeImpaires.carre(nombre));
		}
		System.out.println("Entrez N : ");
		   System.out.print("\nEntrez N (taille de la matrice) : ");
	        int N = sc.nextInt();
	        int[][] A = new int[N][N];
	        System.out.println("Entrez la matrice :");
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                A[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("\nMatrice originale :");
	        RotationMatrice.afficheM(A);

	        RotationMatrice.rotate90ClockwiseInPlace(A);

	        System.out.println("\nMatrice après rotation 90° horaire :");
	        RotationMatrice.afficheM(A);
	     // test 
	        double[][] t1 = {{1, 2, 3}, {4, 5, 6}};
	        double[][] t2 = {{1, 1, 1}, {2, 2, 2}};
	        
	        System.out.println("Affichage t1:");
	        utilitaire.affiche(t1);
	        
	        System.out.println("\nRégulier: " + utilitaire.regulier(t1));
	        
	        System.out.print("\nSommes lignes: ");
	        for (double s : utilitaire.sommeLignes(t1)) {
	            System.out.print(s + " ");
	        }
	        
	        System.out.println("\n\nSomme t1+t2:");
	        utilitaire.affiche(utilitaire.somme(t1, t2));
	        sc.close();
	    }

}
