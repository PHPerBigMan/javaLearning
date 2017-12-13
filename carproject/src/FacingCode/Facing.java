package FacingCode;

import java.util.*;

import carproject.Animal;

public class Facing {
	public static void main(String[] args) {
		carproject.Action action = new carproject.Action();
//		action.show();
		Action action2 = new Action();
//		action2.show();
		
		Random number = new Random();
		double numberCount = number.nextDouble() + number.nextInt(10);
		System.out.println(numberCount);
	}
}
