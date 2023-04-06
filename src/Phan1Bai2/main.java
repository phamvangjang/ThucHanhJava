package Phan1Bai2;

import java.util.ArrayList;

//Cho mảng 1 chiều các số nguyên (int) hiện thực các phương thức sau:
public class main {
//	1) Đếm số phần tử là bội số của 2
	public static int countMultiplesOfTwo(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

//	2) Xác định vị trí xuất hiện cuối cùng của 1 số cho trước trong mảng
	public static int lastIndexOf(int[] arr, int num) {
		for (int i = arr.length; i >= 0; i--) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

//	3) Lấy ra các phần tử nhỏ hơn 1 số cho trước (kiểu trả về là mảng)
	public static int[] smallerThan(int[] arr, int num) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] < num) {
				result.add(arr[i]);
			}
		}
		int[] arrResult = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			arrResult[i] = result.get(i);
		}
		return arrResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		System.out.println("so phan tu boi cua 2 la: " + countMultiplesOfTwo(arr));
//		System.out.println("vi tri xuat hien cuoi cung cua "+8+ "trong mang cho truoc la: "+lastIndexOf(arr, 8)); 
//		bug fixing 
//		System.out.println(" mang cac phan tu nho hon"+10+"la: "+smallerThan(arr, 10));
//		bug fixing 
	}

}
