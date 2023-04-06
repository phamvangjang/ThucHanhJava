package Phan1Bai4;

public class main {
	
	public static int countUppercaseChars(String str) {
		int count=0;
		char c;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c>='A' && c<='Z') {
				count++;
			}
		}
		return count;
	}
	
	public static int uppercaseCharsIndexOfTwo(String str) {
		int index=0;
		char c;
		for(int i=0;i<=str.length();i++) {
			c=str.charAt(i);
			if(c>='A'&&c<='Z') {
				index++;
			}
			if(index==2) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello Guys, Welcome To JAVA Programming ";
		System.out.println("So ki tu viet hoa trong mang la: "+countUppercaseChars(str));
		System.out.println("Vi tri xuat hien cua ki tu viet hoa trong mang la: "+uppercaseCharsIndexOfTwo(str));
	}

}
