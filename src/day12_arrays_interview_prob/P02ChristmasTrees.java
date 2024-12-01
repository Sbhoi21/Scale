package day12_arrays_interview_prob;

public class P02ChristmasTrees {

	
//	Q2. Christmas Trees
//	Unsolved
//	feature icon
//	Using hints except Complete Solution is Penalty free now
//	Use Hint
//	Problem Description
//
//	You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
//	The cost of these trees is Bp + Bq + Br.
//
//
//	You are to choose 3 trees such that their total cost is minimum. Return that cost.
//
//	If it is not possible to choose 3 such trees return -1.
//
//
//	Problem Constraints
//	1 <= A[i], B[i] <= 109
//	3 <= size(A) = size(B) <= 3000
//
//	Input Format
//	First argument is an integer array A.
//	Second argument is an integer array B.
//
//	Output Format
//	Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 1, 6, 4, 2, 6, 9 };
		int[] B = { 2, 5, 7, 3, 2, 7 };
		System.out.println(minCost(A, B));
		
	}
	
	public static int minCost(int[] A, int[] B) {
        int n = A.length;
        int minCost = Integer.MAX_VALUE;

        for (int q = 1; q < n - 1; q++) {
            int leftMinCost = Integer.MAX_VALUE;
            int rightMinCost = Integer.MAX_VALUE;

            // Find minimum cost for the left tree with A[p] < A[q]
            for (int p = 0; p < q; p++) {
                if (A[p] < A[q]) {
                    leftMinCost = Math.min(leftMinCost, B[p]);
                }
            }

            // Find minimum cost for the right tree with A[q] < A[r]
            for (int r = q + 1; r < n; r++) {
                if (A[q] < A[r]) {
                    rightMinCost = Math.min(rightMinCost, B[r]);
                }
            }

            if (leftMinCost != Integer.MAX_VALUE && rightMinCost != Integer.MAX_VALUE) {
                minCost = Math.min(minCost, B[q] + leftMinCost + rightMinCost);
            }
        }

        return (minCost == Integer.MAX_VALUE) ? -1 : minCost;
	
		
	}

}
