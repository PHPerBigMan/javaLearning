package FacingCode;

import java.util.Scanner;

public class Gussing {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 10);
		int guess;
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------请输入您要猜的数字-------");
		guess = scanner.nextInt();
		while(guess != num) {
			if(guess > num) {
				System.out.println("您猜测的数字过大，请重新输入");
				guess = scanner.nextInt();
			}
			if(guess < num) {
				System.out.println("您猜测的数字小了，请重新输入");
				guess = scanner.nextInt();
			}
		}
		
		System.out.println("恭喜您获得了胜利!!");
	}
}
