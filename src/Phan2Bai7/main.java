package Phan2Bai7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
//	1) Có bao nhiêu ký tự chữ viết hoa trên mảng 2 chiều
	public static int countIsUppercase(char[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (Character.isUpperCase(arr[i][j])) {
					count++;
				}
			}
		}
		return count;
	}

//	2) Chuyển tất cả các ký tự chữ viết thường trên 1 hàng cho trước sang ký tự viết hoa
	public static void convertToUppercaseForRow(char[][] arr) {
		int row = 1;
		for (int j = 0; j < arr[0].length; j++) {
			if (Character.isLowerCase(arr[row][j])) {
				arr[row][j] = Character.toUpperCase(arr[row][j]);
			}
		}
	}

//	3) Tìm ký tự xuất hiện nhiều nhất ở biên của mảng (hàng/cột đầu tiên hoặc hàng/cột cuối cùng)
	public static char findMostFrequentChar(char[][] arr) {
		// Tạo một HashMap để đếm số lần xuất hiện của các ký tự
		Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

		// Duyệt các phần tử của hàng đầu tiên và hàng cuối cùng
		for (int i = 0; i < arr[0].length; i++) {
			charCounts.put(arr[0][i], charCounts.getOrDefault(arr[0][i], 0) + 1);
			charCounts.put(arr[arr.length - 1][i], charCounts.getOrDefault(arr[arr.length - 1][i], 0) + 1);
		}

		// Duyệt các phần tử của cột đầu tiên và cột cuối cùng (trừ đi phần tử ở góc
		// trên trái và góc dưới phải để tránh đếm trùng lặp)
		for (int i = 1; i < arr.length - 1; i++) {
			charCounts.put(arr[i][0], charCounts.getOrDefault(arr[i][0], 0) + 1);
			charCounts.put(arr[i][arr[0].length - 1], charCounts.getOrDefault(arr[i][arr[0].length - 1], 0) + 1);
		}

		// Tìm ký tự xuất hiện nhiều nhất trong HashMap
		char mostFrequentChar = '\0';
		int maxCount = 0;
		for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostFrequentChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		return mostFrequentChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = { { 'p', 'h', 'a', 'm', 'v' }, { 'a', 'n', 'g', 'i', 'g' }, { 'i', 'a', 'n', 'g', 'C' },
				{ 'N', 'T', 'T', 'K', '6' }, { '2', 'H', 'c', 'M', 'c' }, };
		System.out.println("Số ký tự chữ viết hoa trên mảng: " + countIsUppercase(arr));

		char[][] str = new char[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			str[i] = new char[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				str[i][j] = arr[i][j];
			}
		}
		main.convertToUppercaseForRow(str);
		System.out.println("Mảng sau khi thay thế là:");
		for(char[] row : str) {
			System.out.println(Arrays.toString(row));
		}

		System.out.println("ký tự xuất hiện nhiều nhất ở biên của mảng: " + findMostFrequentChar(arr));
	}

}
