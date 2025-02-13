package day11_arrays_2Dmatrix;

public class P02AntiDiagonals {

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		PrintMatrix.printMatrix(diagonal(A));
		
		int[][] B = { { 1, 2 }, { 3,4 } };
		PrintMatrix.printMatrix(diagonal(B));
	}

	public static int[][] diagonal(int[][] A) {
		int N = A.length;
		// System.out.println(N);
		int M = 2 * N - 1;
		// System.out.println(M);
		int[][] tarr = new int[M][N];
		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			x = 0;
			y = N - 1;
			while (y > i) {
				tarr[i][y] = 0;
				y--;
			}
			while (x < N && y >= 0) {
				tarr[i][x] = A[x][y];
				y--;
				x++;
			}
		}
		int r = N;
		for (int i = 1; i < N; i++) {
			x = i;
			y = N - 1;
			while (x < N && y >= i) {
				tarr[r][N - y - 1] = A[x][y];
				y--;
				x++;
			}
			while (y >= 0) {
				tarr[r][N - y - 1] = 0;
				y--;
			}
			r++;
		}

		return tarr;

	}
}
