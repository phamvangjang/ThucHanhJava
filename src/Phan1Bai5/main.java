package Phan1Bai5;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
//	1) Đếm số ký tự là số trong mảng
	public static int countCharDigit(char[] str) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (Character.isDigit(str[i])) {
				count++;
			}
		}
		return count;
	}

//	2) Xác định vị trí xuất hiện cuối cùng của 1 ký tự cho trước trong mảng
	public static int lastIndexOf(char[] str, char c) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] == c) {
				return i;
			}
		}
		return -1;
	}

//	3) Lấy ra tất cả các ký tự là số trong mảng (kiểu trả về là mảng)
	public static String getElementsDigit(char[] str) {
		ArrayList<Character> result = new ArrayList<Character>();
		for (int i = 0; i < str.length; i++) {
			if (Character.isDigit(str[i])) {
				result.add(str[i]);
			}
		}

		char[] arrResult = new char[result.size()];
		for (int i = 0; i < result.size(); i++) {
			arrResult[i] = result.get(i);
		}
		return Arrays.toString(arrResult);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = { 'H', 'e', 'L', 'l', '1', '9', 'o', 'I', 'f', 'u', 'n', 'n', 'y', 'G', 'u', 'Y', 's', 'I', 'a',
				'm', '2', '0' };
		System.out.println("So ki tu la so trong mang la: " + countCharDigit(str));
		System.out.println("Vi tri xuat hien  cuoi cung cua ki tu " + 'I' + " la: " + lastIndexOf(str, 'I'));
		System.out.println("Mang cac ki tu la so trong mang la: " + getElementsDigit(str));

	}

}
