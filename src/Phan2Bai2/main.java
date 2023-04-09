package Phan2Bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
//	1) Tìm số chẵn lớn thứ 2 trong mảng
	public static int findSecondLargestEven(int[][] arr) {
//		Tạo một mảng mới chỉ chứa các số chẵn trong mảng ban đầu
		List<Integer> evenNums = new ArrayList<Integer>();
		for (int[] row : arr) {
			for (int num : row) {
				if (num % 2 == 0) {
					evenNums.add(num);
				}
			}
		}
//		Sắp xếp mảng theo thứ tự giảm dần
		Collections.sort(evenNums, Collections.reverseOrder());
//		 Tìm số chẵn lớn thứ 2
		int secondLargestEven = -1;
		for (int num : evenNums) {
			if (num < evenNums.get(0) && num != evenNums.get(0)) {
				secondLargestEven = num;
				break;
			}
		}
		return secondLargestEven;
	}

//	2) Tính tổng các phần tử trên cột cho trước
	public static int sumColums(int[][] arr, int colums) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][colums];
		}
		return sum;
	}

//	3) Thay thế các phần tử bị thiếu (phần tử có giá trị = -1) trên 1 hàng bằng phần tử nhỏ nhất ở hàng đó
	public static String replaceMissingWithMin(int[][] arr, int rowIndex) {
//		Tìm phần tử nhỏ nhất trên hàng đó
		int minNum = Integer.MAX_VALUE;
		for (int num : arr[rowIndex]) {
			if (num < minNum) {
				minNum = num;
			}
		}
//		Thay thế các phần tử bị thiếu bằng phần tử nhỏ nhất đó
		for (int j = 0; j < arr[rowIndex].length; j++) {
			if (arr[rowIndex][j] == -1) {
				arr[rowIndex][j] = minNum;
			}
		}
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[][] arr = { { 5, 6, 7, -1 }, { -1, 19, 3, 8 }, { 3, 4, -1, 2 } };
		int colums = 2;
		int rowIndex = 1;
		System.out.println("Số chẵn lớn thứ 2 trong mảng là: " + findSecondLargestEven(arr));

		System.out.println("Tổng các phần tử trên cột " + colums + " là: " + sumColums(arr, colums));

//		bug fixing
		replaceMissingWithMin(arr, rowIndex);
		for (int[] arrResult : arr) {
			System.out.println(Arrays.toString(arrResult));
		}
	}

}
