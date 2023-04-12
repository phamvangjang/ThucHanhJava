package Phan2Bai9;

import java.util.Arrays;


public class main {
//	1) Có bao nhiêu phần tử nằm trên 2 đường chéo là ký tự chữ và viết hoa
	public static int countCharUppercase(char[][] arr) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i][i])) {
				count++;
			}
			if(Character.isUpperCase(arr[i][arr.length- i- 1])) {
				count++;
			}
		}
		return count;
	}
	
//	2) Chuyển tất cả các ký tự chữ viết thường ở 2 đường chéo sang ký tự viết hoa
	public static void convertLowerCaseToUpperCaseOnDiagonals(char[][] arr) {
		for(int i=0;i<arr.length;i++) {
			if(Character.isLowerCase(arr[i][i])) {
				arr[i][i]=Character.toUpperCase(arr[i][i]);
			}
			if(Character.isLowerCase(arr[i][arr.length-i-1])) {
				arr[i][arr.length-i-1]=Character.toUpperCase(arr[i][arr.length-i-1]);
			}
		}
	}
	
//	3) Tìm ký tự chữ viết hoa xuất hiện nhiều nhất trong mảng
	public static char findMostFrequentUpperCaseChar(char[][] arr) {
		int[] frequencies = new int[26]; // There are 26 uppercase letters in English
        char mostFrequentChar = 'A'; // Default value
        int maxFrequency = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (Character.isUpperCase(arr[i][j])) {
                    frequencies[arr[i][j] - 'A']++;
                    if (frequencies[arr[i][j] - 'A'] > maxFrequency) {
                        maxFrequency = frequencies[arr[i][j] - 'A'];
                        mostFrequentChar = arr[i][j];
                    }
                }
            }
        }

        return mostFrequentChar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = { { 'p', 'h', 'a', 'm', 'v', 'T'}, 
				 		 { 'a', 'n', 'g', 'i', 'g', 'r' }, 
				 		 { 'i', 'a', 'n', 'g', 'C', 'a' },
				 		 { 'N', 'T', 'T', 'K', '6', 'n' }, 
				 		 { '2', 'H', '6', 'M', 'c', 'g' },
				 		 { 'N', 'g', 'u', 'y', 'e', 'N' }}; 
		System.out.println("so phần tử nằm trên 2 đường chéo là ký tự chữ và viết hoa: "+countCharUppercase(arr));
		
//		copy array 2D
		char[][] str = new char[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			str[i] = new char[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				str[i][j] = arr[i][j];
			}
		}
		main.convertLowerCaseToUpperCaseOnDiagonals(str);
		System.out.println("Mang sau khi Chuyển ký tự chữ viết thường ở 2 đường chéo sang ký tự viết hoa: ");
		for(char[] row : str ) {
			System.out.println(Arrays.toString(row));
		}
		
//		bug fixing: case 2 ki tu co so lan xuat hien bang nhau =))
		System.out.println("ký tự chữ viết hoa xuất hiện nhiều nhất trong mảng: "+findMostFrequentUpperCaseChar(arr));
	}
	
}
