package Phan1Bai3;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
	public static int sumElementIndexOfEven(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static int twoTimeOfIndex(int[] arr, int x) {
		int time = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				time++;
			}
			if (time == 2) {
				return i;
			}
		}
		return -1;
	}

	public static String getElementMultiplesOfTwo(int[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result.add(arr[i]);
			}
		}

		int[] arrResult = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			arrResult[i] = result.get(i);
		}

		return Arrays.toString(arrResult);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 10, 5, 6, 7, 8, 9, 81, 11, 12, 10, 13, 14, 15 };
		System.out.println("Tong cac phan tu o vi tri chan la: " + sumElementIndexOfEven(arr));
		System.out.println("Vi tri xuat hien thu 2 cua so " + 10 + " trong mang la: " + twoTimeOfIndex(arr, 10));
		System.out.println("Cac phan tu la boi so cua 2 trong mang la: " + getElementMultiplesOfTwo(arr));
	}

}
