package carproject;

import java.util.Scanner;

public class CarName {
	public static void main(String[] args) {
		int iYear;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		iYear = scanner.nextInt();
		if(iYear%4 == 0) {
			if(iYear % 100 ==0 ) {
				if(iYear % 400 ==0) {
					System.out.println("��������");
				}else {
					System.out.println("�ⲻ������");
				}
			}else
				System.out.println("��������");
		}else {
			System.out.println("�ⲻ������");
		}
	}
}
