package Phan1Bai6;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
//	1) Đếm số ký tự viết thường trong mảng
	public static int countLowercase(char[] str) {
		int count =0;
		for(int i=0;i<str.length;i++) {
			if(Character.isLowerCase(str[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean containsChar(char[] str, char c) {
		for(int i=0;i<str.length;i++) {
			if(Character.toLowerCase(str[i]) == Character.toLowerCase(c)) {
				return true;
			}
		}
		return false;
	}
//	2) Kiểm tra xem mảng ký tự trên có chứa 1 ký tự chữ cho trước hay không (không phân biệt viết hoa hay thường)
	public static String getElementsUppercase(char[] str) {
		ArrayList<Character> result = new ArrayList<Character>();
		for(int i=0;i<str.length;i++) {
			if(Character.isUpperCase(str[i])) {
				result.add(str[i]);
			}
		}
		
		char[] arrResult = new char[result.size()];
		for(int i=0; i< result.size();i++) {
			arrResult[i] = result.get(i);
		}
		return Arrays.toString(arrResult);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'H','e','L','l','o','G','u','Y','s','I','a','m','2','0'};
		System.out.println("So ki tu chu viet thuong trong mang la: "+countLowercase(str));
		
		
		if(containsChar(str, 'g')) {
			System.out.println("Mang co chua ki tu: "+'g');
		}else {
			System.out.println("Mang KHONG chua ki tu: "+'g');
		}
		
		System.out.println("Mang cac ki tu viet hoa la: "+getElementsUppercase(str));
	}
}
