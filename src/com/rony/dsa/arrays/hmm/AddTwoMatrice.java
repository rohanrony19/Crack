package com.rony.dsa.arrays.hmm;

public class AddTwoMatrice {
    public static void main(String[] args) {
        int[][] A = { {1, 1, 1},
                      {2, 2, 2}, 
                      {3, 3, 3},
                      {4, 4, 4} };
        int[][] B = { {1, 1, 1},
                      {2, 2, 2}, 
                      {3, 3, 3}, 
                      {4, 4, 4} };
        int[][] C = new int[4][3];

        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int[] row:C){
            for (int val:row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
