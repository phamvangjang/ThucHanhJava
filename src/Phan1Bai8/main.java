package Phan1Bai8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class main {
//	1) Đếm số lần xuất hiện của một chuỗi cho trước trong mảng (không phân biệt chữ hoa chữ thường)
	public static int countIndexOfString(String[] arrStr, String target) {
		int count = 0;
		for (int i = 0; i < arrStr.length; i++) {
			if (arrStr[i].equalsIgnoreCase(target)) {
				count++;
			}
		}
		return count;
	}

//	2) Xác định vị trí xuất hiện cuối cùng của chuỗi cho trước trong mảng
	public static int locationIndexOfString(String[] arrStr, String target) {
		int count = 0;
		for (int i = arrStr.length - 1; i > 0; i--) {
			if (arrStr[i].equalsIgnoreCase(target)) {
				return i;
			}
		}
		return -1;
	}

//	3) Lấy ra tất cả các chuỗi có chiều dài lớn hơn 4 ký tự trong mảng (kiểu trả về là mảng)
	public static String[] getLongStrings(String[] arrStr) {
		List<String> result = new ArrayList<String>();
		for (String str : arrStr) {
			if (str.length() > 4) {
				result.add(str);
			}
		}
		return result.toArray(new String[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target = "lop";
		String[] str = { "Pham", "Van", "lOp", "Giang", "hoc", "loP", "Cong", "Nghe", "Lop", "Thong", "Tin", "LOP",
				"K62" };
		System.out.println("So lan xuat hien cua chuoi " + target + " la: " + countIndexOfString(str, target));
		System.out.println(
				"Vi tri xuat hien cuoi cung cua chuoi " + target + " la: " + locationIndexOfString(str, target));

		String[] result = getLongStrings(str);
		System.out.println("Mang co cac chuoi lon hon 4 ki tu la: " + Arrays.toString(result));
	}

}
