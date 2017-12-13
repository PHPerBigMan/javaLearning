package carproject;

public class Computer {
	public static void main(String[] args) {
		Pad iPad = new Pad();
		Lenovo lenovo = new Lenovo();
		Color color = new red();
//		System.out.println("查看Ipad是否继承自 Computer "+(lenovo instanceof Computer));
	}
}

class Pad extends Computer{
	Color color = new red();
}

class Lenovo extends Pad{
	
}