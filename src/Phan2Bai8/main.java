package Phan2Bai8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
//	1) Có bao nhiêu phần tử biên (ở hàng/cột đầu tiên hoặc hàng/cột cuối cùng) là ký tự số
	public static int countIsDigitBoundary(char[][] arr) {
		int count = 0;
		// dem phần tử la so ở hàng đầu tiên
		for (int j = 0; j < arr[0].length; j++) {
			if (Character.isDigit(arr[0][j])) {
				count++;
			}
		}
		// dem phần tử la so ở hàng cuối cùng
		for (int j = 0; j < arr[0].length; j++) {
			if (Character.isDigit(arr[arr.length - 1][j])) {
				count++;
			}
		}
		// dem phần tử la so ở cột đầu tiên
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i][0])) {
				count++;
			}
		}
		// dem phần tử la so ở cột cuối cùng
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i][arr[0].length - 1])) {
				count++;
			}
		}
		return count;
	}
//	2) Chuyển các kí tự chữ viết thường ở các vị trí biên thành các kí tự viết hoa
	public static void convertToUppercaseBoundary(char[][] arr) {
		// hàng đầu tiên
		for (int j = 0; j < arr[0].length; j++) {
				if (Character.isLowerCase(arr[0][j])) {
					arr[0][j] = Character.toUpperCase(arr[0][j]);
				}
		}
		//hàng cuối cùng
		for (int j = 0; j < arr[0].length; j++) {
			if (Character.isLowerCase(arr[arr.length - 1][j])) {
				arr[arr.length - 1][j] = Character.toUpperCase(arr[arr.length - 1][j]);
			}
		}
		//cột đầu tiên
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLowerCase(arr[i][0])) {
				arr[i][0] = Character.toUpperCase(arr[i][0]);
			}
		}
		//cột cuối cùng
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLowerCase(arr[i][arr[0].length - 1])) {
				arr[i][arr[0].length - 1] =  Character.toUpperCase(arr[i][arr[0].length - 1]);
			}
		}
	}
//	3) Tìm ký tự số xuất hiện nhiều nhất trong mảng
	public static char findMostFrequentChar(char[][] arr) {
        // Khởi tạo mảng tần suất
        int[] freq = new int[256]; // Mảng tần suất các ký tự ASCII
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            	if(Character.isDigit(arr[i][j])) {
            		char c = arr[i][j];
            		freq[c]++;
            	}
            }
        }

        // Tìm ký tự có tần suất cao nhất trong mảng tần suất
        char mostFreqChar = 0;
        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                mostFreqChar = (char) i;
                maxFreq = freq[i];
            }
        }

        return mostFreqChar;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = { { 'p', 'h', 'a', 'm', 'v' }, 
						 { 'a', 'n', 'g', 'i', 'g' }, 
						 { 'i', 'a', 'n', 'g', 'C' },
						 { 'N', 'T', 'T', 'K', '6' }, 
						 { '2', 'H', '6', 'M', 'c' } };
//		bug fixing
		System.out.println("Số phần tử biên có kí tự là số là: " + countIsDigitBoundary(arr));
		
		char[][] str = new char[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			str[i] = new char[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				str[i][j] = arr[i][j];
			}
		}
		main.convertToUppercaseBoundary(str);
		System.out.println("Mảng trước khi thay thế là:");
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Mảng sau khi thay thế là:");
		System.out.println(Arrays.deepToString(str));
		
		System.out.println("ký tự số xuất hiện nhiều nhất trong mảng: "+findMostFrequentChar(arr));
	}

}
