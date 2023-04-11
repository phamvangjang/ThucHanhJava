package Phan2Bai6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
//	1) Có bao nhiêu ký tự số trong mảng 2 chiều
	public static int countDigits(char[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (Character.isDigit(arr[i][j])) {
					count++;
				}
			}
		}
		return count;
	}

//	2) Chuyển tất cả ký tự chữ viết thường trên 1 cột cho trước sang ký tự viết hoa
	public static void uppercaseForCols(char[][] arr) {
		int cols = 2;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLowerCase(arr[i][cols])) {
				arr[i][cols] = Character.toUpperCase(arr[i][cols]);
			}
		}
	}

//	3) Tìm ký tự xuất hiện nhiều nhất trên 2 đường chéo
	public static char findMostFrequentCharacter(char[][] arr) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int maxCount = 0;
		char mostFrequentChar = ' ';
		// count characters in the main diagonal
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i][i];
			int count = map.getOrDefault(c, 0) + 1;
			map.put(c, count);
			if (count > maxCount) {
				maxCount = count;
				mostFrequentChar = c;
			}
		}
		// count characters in the secondary diagonal
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i][arr.length - i - 1];
			int count = map.getOrDefault(c, 0) + 1;
			map.put(c, count);
			if (count > maxCount) {
				maxCount = count;
				mostFrequentChar = c;
			}
		}
		return mostFrequentChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = { { 'p', 'h', 'a', 'm', 'v' }, { 'a', 'n', 'g', 'i', 'g' }, { 'i', 'a', 'n', 'g', 'C' },
				{ 'N', 'T', 'T', 'K', '6' }, { '2', 'H', 'c', 'M', 'c' }, };
		System.out.println("so ký tự số trong mảng: " + countDigits(arr));

		char[][] str = new char[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			str[i] = new char[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				str[i][j] = arr[i][j];
			}
		}
		main.uppercaseForCols(str);
		System.out.println("Mảng trước khi thay thế là:");
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Mảng sau khi thay thế là:");
		System.out.println(Arrays.deepToString(str));

		System.out.println("ký tự xuất hiện nhiều nhất trên 2 đường chéo: " + findMostFrequentCharacter(arr));
	}
}
