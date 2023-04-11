package Phan2Bai6;

import java.util.Arrays;


public class main {
//	1) Có bao nhiêu ký tự số trong mảng 2 chiều
	public static int countCharIsNum(char[][] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				if(arr[i][j]>='0' && arr[i][j]<='9') {
					count++;
				}
			}
		}
		return count;
	}
	
//	2) Chuyển tất cả ký tự chữ viết thường trên 1 cột cho trước sang ký tự viết hoa
	public static void uppercaseForCols(char[][] arr) {
		int cols = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][cols]>='a' && arr[i][cols]<='z') {
				Character.toUpperCase(arr[i][cols]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = {{'p', 'h', 'a', 'm', 'v'},
						{'a', 'n', 'g', 'i', 'g'},
						{'i', 'a', 'n', 'g', 'C'},
						{'N', 'T', 'T', 'K', '6'},
						{'2', 'H', 'c', 'M', 'c'},};
		int cols = 2;
		System.out.println("so ký tự số trong mảng: "+countCharIsNum(arr));
		
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
//		System.out.println(arr[0][2]);
//		System.out.println("" + Character.toUpperCase(arr[0][2]));
	}
}
