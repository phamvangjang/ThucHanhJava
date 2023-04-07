package Phan2Bai3;

public class main {
	private int[][] arr;
	private int n;
	private int m;
	
	public main(int[][] arr) {
		this.arr=arr;
		this.n=arr.length;
		this.m=arr[0].length;
	}
	
//	1) Tìm số lẻ lớn thứ 2 trong mảng
	public int findSecondLargestOdd(int[][] arr) {
		int largest = Integer.MAX_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int num=arr[i][j];
				if(num%2!=0) {
					if(num>largest) {
						secondLargest=largest;
						largest=num;
					}else if(num>secondLargest&&num!=largest) {
						secondLargest=num;
					}
				}
			}
		}
		return secondLargest;
	}
	
//	2) Tìm phần tử lớn nhất trên 2 đường chéo
	public int findMaxOnDiagonals() {
		int max = Integer.MIN_VALUE;
//		Tìm phần tử lớn nhất trên 2 đường chéo chính
		for(int i=0;i<Math.min(n, m);i++) {
			if(arr[i][i]>max) {
				max=arr[i][i];
			}
		}
//		Tìm phần tử lớn nhất trên 2 đường chéo phụ
		for(int i=0;i<Math.min(n, m);i++) {
			if(arr[i][m-i-1]>max) {
				max=arr[i][m-i-1];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 5,  6,  7, -1}, 
			            {-1, 19,  3,  8}, 
			            { 3,  4, -1,  2}, 
			            { 5,  8,  1, -1}};
//		bug fixing
//		System.out.println("Số lẻ lớn thứ 2 trong mảng là: "+findSecondLargestOdd(arr));
	}

}
