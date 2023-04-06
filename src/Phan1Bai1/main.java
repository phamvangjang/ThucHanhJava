package Phan1Bai1;

import java.util.ArrayList;

public class main {
	public static int countEven(int[] arr) {
//		1) Đếm số phần tử chẵn trong mảng
		int count = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}

	public static int findSecondEven(int[] arr) {
//		2) Xác định vị trí xuất hiện của số chẵn thứ 2 trong mảng
//		nếu ko tìm thấy return -1
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count += 1;
				if (count == 2) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int[] getOddElement(int[] arr) {
//		3) Lấy ra các phần tử lẻ trong mảng (kiểu trả về là mảng)
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		for (int num : arr) {
			if (num % 2 != 0) {
				oddList.add(num);
			}
		}
		int[] oddArr = new int[oddList.size()];
		for (int i = 0; i <= oddList.size(); i++) {
			oddArr[i] = oddList.get(i);
		}
		return oddArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
//		System.out.println("so phan tu chan trong mang la: "+ countEven(arr));
//		System.out.println("vi tri xuat hien so chan thu 2 trong mang la: "+findSecondEven(arr));
		System.out.println("day cac phan tu le la: " + getOddElement(arr));
	}

}
