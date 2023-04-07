package Phan1Bai4;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
//	1) Đếm số ký tự viết hoa trong mảng
	public static int countUppercaseChars(String str) {
		int count = 0;
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				count++;
			}
		}
		return count;
	}

//	2) Xác định vị trí xuất hiện của ký tự chữ viết hoa thứ 2 trong mảng
	public static int uppercaseCharsIndexOfTwo(String str) {
		int index = 0;
		char c;
		for (int i = 0; i <= str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				index++;
			}
			if (index == 2) {
				return i;
			}
		}
		return -1;
	}

//	3) Lấy ra tất cả các ký tự chữ viết thường trong mảng (kiểu trả về là mảng)
	public static String getElementsLowercase(char[] str) {
		ArrayList<Character> result = new ArrayList<Character>();
		for (char c : str) {
			if (Character.isLowerCase(c)) {
				result.add(c);
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
		String str = "Hello Guys, Welcome To JAVA Programming ";
		char[] Str = { 'H', 'e', 'L', 'l', 'o', 'G', 'u', 'Y', 's' };
		System.out.println("So ki tu viet hoa trong mang la: " + countUppercaseChars(str));
		System.out.println("Vi tri xuat hien cua ki tu viet hoa trong mang la: " + uppercaseCharsIndexOfTwo(str));
		System.out.println("Cac ki tu chu thuong trong mang la: " + getElementsLowercase(Str));
	}

}
