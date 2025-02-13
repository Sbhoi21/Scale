package day11_arrays_2Dmatrix;

public class PrintMatrix {

	public static void main(String[] args) {

	}

	public static void printMatrix(int[][] c) {

//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c[i].length; j++) {
//				System.out.println("c[" + i + "][" + j + "]= " + c[i][j]);
//			}
//		}
		System.out.println("matrix = ");
		for (int i = 0; i < c.length; i++) {
			System.out.print("[");
			for (int j = 0; j < c[i].length; j++) {
				System.out.print("\t" + c[i][j] + ",");
			}
			System.out.print("]\n");

		}

	}

	public static void printArray(int[] c) {
		System.out.print("Array = {");
		for (int i = 0; i < c.length; i++) {
			System.out.print("\t" + c[i] + ",");
		}
		System.out.print("}");
	}

}
