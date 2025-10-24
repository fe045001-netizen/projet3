package com.exemple.tp;

import java.util.Scanner;

public class RotationMatrice {

	public static void afficheMatrice(int[][] A) {
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

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("Entrez N : ");
		int N = n.nextInt();
		int[][] A = new int[N][N];

		System.out.println("Entrez la matrice :");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = n.nextInt();
			}
		}

		System.out.println("\nMatrice avant rotation 90° horaire :");
		afficheMatrice(A);

		rotate90ClockwiseInPlace(A);

		System.out.println("\nMatrice après rotation 90° horaire :");
		afficheMatrice(A);
		
		n.close();
	}

}
