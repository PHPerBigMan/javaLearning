package FacingCode;

import java.util.Scanner;

public class Gussing {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 10);
		int guess;
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------��������Ҫ�µ�����-------");
		guess = scanner.nextInt();
		while(guess != num) {
			if(guess > num) {
				System.out.println("���²�����ֹ�������������");
				guess = scanner.nextInt();
			}
			if(guess < num) {
				System.out.println("���²������С�ˣ�����������");
				guess = scanner.nextInt();
			}
		}
		
		System.out.println("��ϲ�������ʤ��!!");
	}
}
