package Phan2Bai1;

import java.lang.Math;

public class main {
//	1) Tìm số nguyên tố lớn thứ 2 trong mảng
//	kiểm tra số nguyên tố
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int findSecondLargestPrime(int[][] arr) {
		int largestPrime = Integer.MAX_VALUE;
		int secondLargestPrime = Integer.MIN_VALUE;
//		tìm sô nguyên tố lớn nhất
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (isPrime(arr[i][j]) && arr[i][j] > largestPrime) {
					largestPrime = arr[i][j];
				}
			}
		}
//		tìm sô nguyên tố lớn thứ hai
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (isPrime(arr[i][j]) && arr[i][j] > secondLargestPrime) {
					secondLargestPrime = arr[i][j];
				}
			}
		}

		if (secondLargestPrime != Integer.MIN_VALUE) {
			return secondLargestPrime;
		} else {
			return -1;
		}
	}

//	2) Tính tổng các phần tử trên hàng cho trước
	public static int sumRow(int[][] arr, int row) {
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum += arr[row][j];
		}
		return sum;
	}

//	3) Thay thế phần tử biên bị thiếu (phần tử có giá trị = -1) bằng giá trị biên nhỏ nhất
	public static void replaceMissingBorder(int[][] arr) {
		int minBorderValue = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == 0 || j == 0 || i == arr.length - 1 || j == arr[0].length - 1) {
					if (arr[i][j] != -1 && arr[i][j] < minBorderValue) {
						minBorderValue = arr[i][j];
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0 || j == 0 || i == arr.length - 1 || j == arr[0].length - 1) {
					if (arr[i][j] == -1) {
						arr[i][j] = minBorderValue;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 5, 6, 7, -1 }, { 15, 19, 3, 8 }, { 3, 4, -1, 2 } };
		int row = 1;

		int secondLargestPrime = findSecondLargestPrime(arr);
		if (secondLargestPrime != -1) {
			System.out.println("So nguyen to lon thu 2 la: " + secondLargestPrime);
		} else {
			System.out.println("Khong tim thay so nguyen to lon thu 2");
		}

		System.out.println("Tong cac phan tu tren hang " + row + " la: " + sumRow(arr, row));

		replaceMissingBorder(arr);
		System.out.println("Mảng sau khi thay thế phần tử biên bị thiếu:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
