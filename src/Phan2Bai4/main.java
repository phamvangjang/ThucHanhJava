package Phan2Bai4;

import java.util.Arrays;

public class main {
//	1) Tìm phần tử biên (ở hàng/cột đầu tiên hoặc hàng/cột cuối cùng) lớn thứ 2
	public static int findSecondLargest(int[][] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		// Tìm phần tử lớn nhất và lớn thứ 2 ở hàng đầu tiên
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[0][j] > max) {
				secondMax = max;
				max = arr[0][j];
			} else if (arr[0][j] > secondMax && arr[0][j] < max) {
				secondMax = arr[0][j];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở hàng cuối cùng
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[arr.length - 1][j] > max) {
				secondMax = max;
				max = arr[arr.length - 1][j];
			} else if (arr[arr.length - 1][j] > secondMax && arr[arr.length - 1][j] < max) {
				secondMax = arr[arr.length - 1][j];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở cột đầu tiên
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] > max) {
				secondMax = max;
				max = arr[i][0];
			} else if (arr[i][0] > secondMax && arr[i][0] < max) {
				secondMax = arr[i][0];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở cột cuối cùng
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][arr[0].length - 1] > max) {
				secondMax = max;
				max = arr[i][arr[0].length - 1];
			} else if (arr[i][arr[0].length - 1] > secondMax && arr[i][arr[0].length - 1] < max) {
				secondMax = arr[i][arr[0].length - 1];
			}
		}
		return secondMax;
	}

//	2) Tìm phần tử biên nhỏ nhất
	public static int findMinBoundary(int[][] arr) {
		int minBoundary = Integer.MAX_VALUE;
		// Tìm phần tử lớn nhất và lớn thứ 2 ở hàng đầu tiên
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[0][j] < minBoundary) {
				minBoundary = arr[0][j];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở hàng cuối cùng
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[arr.length - 1][j] < minBoundary) {
				minBoundary = arr[arr.length][j];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở cột đầu tiên
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] < minBoundary) {
				minBoundary = arr[i][0];
			}
		}
		// Tìm phần tử lớn nhất và lớn thứ 2 ở cột cuối cùng
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[i][arr[0].length - 1] < minBoundary) {
				minBoundary = arr[i][arr[0].length - 1];
			}
		}
		return minBoundary;
	}

//	3) Thay thế các phần tử bị thiếu ((phần tử có giá trị = -1) trong mảng bằng phần tử
//	   lớn nhất trên đường chéo (0,0), (1,1), ..., (n,m)
//	Tìm phần tử lớn nhất trên 2 đường chéo:
	public static void replaceMissingElements(int[][] arr) {
		int maxOnDiagonals = Integer.MIN_VALUE;
		int numRows = arr.length;
		int numCols = arr[0].length;
		for (int i = 0; i < numRows; i++) {
			if (i < numCols && arr[i][i] > maxOnDiagonals) {
				maxOnDiagonals = arr[i][i];
			}
			if (i < numCols && arr[i][numCols - i - 1] > maxOnDiagonals) {
				maxOnDiagonals = arr[i][numCols - i - 1];
			}
		}
//	Thay thế các phần tử bị thiếu:
		for (int i = 0; i < numCols; i++) {
			for (int j = 0; j < numRows; j++) {
				if (arr[i][j] == -1) {
					arr[i][j] = maxOnDiagonals;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 17, 3, -1 }, { 4, -1, 6, 7 }, { 8, 3, 10, 7 }, { 2, 13, -1, 15 } };

		System.out.println("Phần tử biên lớn thứ 2 là: " + findSecondLargest(arr));
		System.out.println("Phần tử biên nhỏ nhất là: " + findMinBoundary(arr));

//		copy array 2D
		int[][] str = new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			str[i] = new int[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				str[i][j] = arr[i][j];
			}
		}
		main.replaceMissingElements(str);
		System.out.println("Mảng sau khi thay thế là:");
		for(int[] row : str) {
			System.out.println(Arrays.toString(row));
		}

	}

}
