package Phan1Bai9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
//	1) Đếm số chuỗi có chiều dài hơn 4 ký tự trong mảng
	public static int countLenghtOfString(String[] arrStr) {
		int count = 0;
		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i].length() > 4) {
				count++;
			}
		}
		return count;
	}

//	2) Lấy ra chuỗi có chiều dài lớn nhất trong mảng
	public static String maxLenghtOfString(String[] arrStr) {
		if (arrStr == null || arrStr.length == 0) {
			return null;
		}

		String longestString = arrStr[0];
		for (int i = 1; i < arrStr.length; i++) {
			if (arrStr[i].length() > longestString.length()) {
				longestString = arrStr[i];
			}
		}
		return longestString;
	}

//	3) Lấy ra tất cả các chuỗi bắt đầu bằng ký tự số trong mảng (kiểu trả về là mảng)
	public static String[] findStringsStartingWithNumber(String[] arrStr) {
		if (arrStr == null || arrStr.length == 0) {
			return new String[0];
		}
		List<String> resultList = new ArrayList<String>();
		for (String arr : arrStr) {
			if (arr != null && arr.length() > 0 && Character.isDigit(arr.charAt(0))) {
				resultList.add(arr);
			}
		}
		return resultList.toArray(new String[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "Pham", "9Van", "0lOp", "Giangit", "hoc", "loP", "Cong", "8Nghe", "Lop", "5Thong", "Tin",
				"LOP", "K62" };
		System.out.println("So chuoi co chieu dai lon hon 4 trong mang la: " + countLenghtOfString(str));
		System.out.println("Chuoi co chieu dai lon nhat trong mang la: " + maxLenghtOfString(str));

		String[] result = findStringsStartingWithNumber(str);
		System.out.println("Mang cac ki tu bat dau bang ki tu so la: " + Arrays.toString(result));
	}

}
