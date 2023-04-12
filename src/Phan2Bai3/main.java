package Phan2Bai3;

import java.util.Arrays;

public class main {
//	1) Tìm số lẻ lớn thứ 2 trong mảng
	public static int findSecondLargestOdd(int[][] arr) {
		int largestOdd = Integer.MIN_VALUE;
		int secondLargestOdd = Integer.MIN_VALUE;
		for (int[] row : arr) {
			for (int num : row) {
				if (num % 2 != 0) {
					if (num > largestOdd) {
						secondLargestOdd = largestOdd;
						largestOdd = num;
					} else if (num > secondLargestOdd && num != largestOdd) {
						secondLargestOdd = num;
					}
				}
			}
		}
		return secondLargestOdd;
	}

//	2) Tìm phần tử lớn nhất trên 2 đường chéo
	public static int findMaxOnDiagonals(int[][] arr) {
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
		return maxOnDiagonals;
	}

//	3) Thay thế các phần tử bị thiếu (phần tử có giá trị = -1) trên 1 cột bằng phần tử 	lớn nhất trên cột đó
	public static void replaceMissingElements(int[][] arr, int col) {
		int maxOnCol = Integer.MIN_VALUE;
		for (int[] row : arr) {
			if (row[col] != -1 && row[col] > maxOnCol) {
				maxOnCol = row[col];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == -1) {
				arr[i][col] = maxOnCol;
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, -1 }, { 4, -1, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };

		System.out.println("Số lẻ lớn thứ 2 trong mảng là: " + findSecondLargestOdd(arr));
		System.out.println("phần tử lớn nhất trên 2 đường chéo: " + findMaxOnDiagonals(arr));
		
//		copy array 2D
		int[][] str = new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			str[i] = new int[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				str[i][j] = arr[i][j];
			}
		}
		main.replaceMissingElements(str, 1);
		System.out.println("Mang sau khi duoc thay the la: ");
		for(int[] row : str) {
			System.out.println(Arrays.toString(row));
		}
	}

}
