package Phan1Bai7;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//1) Đếm số chuỗi có ký tự đầu tiên được viết hoa trong mảng
public class main {
	public static int countUpperCaseStrings(String[] arrStr) {
		int count =0;
		for(String str : arrStr) {
			if(Character.isUpperCase(str.charAt(0))) {
				count++;
			}
		}
		return count;
	}
//	2) Xác định vị trí xuất hiện thứ 2 của một chuỗi cho trước trong mảng
	public static int findSecondIndex(String[] arrStr, String target) {		
		int count=0;
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i].equals(target)) {
				count++;
				if(count==2) {
					return i;
				}
			}
		}
		return -1; 
	}
//	3) Lấy ra tất cả các chuỗi có chứa 1 chuỗi cho trước (kiểu trả về là mảng)
	public static String[] findAllContainingStrings(String[] arrStr, String target) {
		List<String> result = new ArrayList<String>();
		for(String str : arrStr) {
			if(str.contains(target)) {
				result.add(str);
			}
		}
		return result.toArray(new String[0]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Pham", "Van", "Giang", "hoc", "lop it", "Cong", "Nghe" ,"lop", "Thong", "Tin", "lop", "K62"};
		String target = "op";
		System.out.println("So chuoi co ki tu dau tien duoc viet hoa la: "+countUpperCaseStrings(str));
		System.out.println("Vi tri xuat hien thu 2 cua chuoi cho truoc trong mang la: "+findSecondIndex(str, "lop"));
		System.out.println("Mang tra ve: "+Arrays.toString(findAllContainingStrings(str, target)));
	}

}
