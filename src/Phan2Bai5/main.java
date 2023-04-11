package Phan2Bai5;

import java.util.Arrays;

public class main {
//	1) Tìm phần tử lớn thứ 2 trên 2 đường chéo
	public static int findSecondMaxOnDiagonals(int[][] arr) {
		int maxOnDiagonals = Integer.MIN_VALUE;
		int secondMaxOnDiagonals = Integer.MIN_VALUE;
		int numRows = arr.length;
		int numCols = arr[0].length;
		for (int i = 0; i < numRows; i++) {
			if (i < numCols && arr[i][i] > maxOnDiagonals) {
				maxOnDiagonals = arr[i][i];
				secondMaxOnDiagonals = maxOnDiagonals;
			}
			if (i < numCols && arr[i][numCols - i - 1] > maxOnDiagonals) {
				maxOnDiagonals = arr[i][numCols - i - 1];
				secondMaxOnDiagonals = maxOnDiagonals;
			}
		}
		return secondMaxOnDiagonals;
	}

//	2) Tính tổng các phần tử trên 2 đường chéo
	public static int sumDiagonal(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
			sum += arr[i][arr.length - 1 - i];
		}
		return sum;
	}

//	3) Thay thế phần tử biên bị thiếu (phần tử có giá trị = -1) bằng giá trị biên lớn nhất

	public static void replaceMissingElements(int[][] arr) {
		int max = Integer.MIN_VALUE;
		// Tìm phần tử lớn nhất và lớn thứ 2 ở hàng đầu tiên
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[0][j] > max) {
				max = arr[0][j];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở hàng cuối cùng
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[arr.length - 1][j] > max) {
				max = arr[arr.length - 1][j];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở cột đầu tiên
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] > max) {
				max = arr[i][0];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở cột cuối cùng
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][arr[0].length - 1] > max) {
				max = arr[i][arr[0].length - 1];
			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == -1) {
					arr[i][j] = max;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 17, 3, -1 }, { 4, -1, 6, 7 }, { 8, 3, 10, 7 }, { 2, 13, -1, 15 } };
		System.out.println("Phần tử lớn thứ 2 trên 2 đường chéo: " + findSecondMaxOnDiagonals(arr));
		System.out.println("Tổng các phần tử trên 2 đường chéo: " + sumDiagonal(arr));

//		copy array 2D
		int[][] str = new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			str[i] = new int[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				str[i][j] = arr[i][j];
			}
		}
		main.replaceMissingElements(str);
		System.out.println("Mảng trước khi thay thế là:");
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Mảng sau khi thay thế là:");
		System.out.println(Arrays.deepToString(str));
	}

}
