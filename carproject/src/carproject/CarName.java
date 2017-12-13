package carproject;

import java.util.Scanner;

public class CarName {
	public static void main(String[] args) {
		int iYear;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字");
		iYear = scanner.nextInt();
		if(iYear%4 == 0) {
			if(iYear % 100 ==0 ) {
				if(iYear % 400 ==0) {
					System.out.println("这是闰年");
				}else {
					System.out.println("这不是闰年");
				}
			}else
				System.out.println("这是闰年");
		}else {
			System.out.println("这不是闰年");
		}
	}
}
