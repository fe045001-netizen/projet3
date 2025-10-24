package com.exemple.tp;

import java.util.Scanner;

public class FenetreDistincts {
	
	public static void nombreDistinctsFenetre(int[] T, int n, int k) {
        int MAXV = 100000;
        int[] freq = new int[MAXV + 1]; 
        int distinct = 0;

        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;
        }

        
        System.out.print(distinct);

        for (int i = k; i < n; i++) {
            int o = T[i - k];
            freq[o]--;
            if (freq[o] == 0) distinct--;

            int in = T[i];
            if (freq[in] == 0) distinct++;
            freq[in]++;

            System.out.print(" " + distinct);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau n : ");

        int n = sc.nextInt();
        System.out.print("Entrez la taille de la fenêtre k : ");
        int k = sc.nextInt();

        int[] T = new int[n];
        System.out.println("Entrez les " + n + " éléments du tableau :");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        nombreDistinctsFenetre(T, n, k);

        sc.close();
    }
}
