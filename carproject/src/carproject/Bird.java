package carproject;

public abstract class Bird extends Animal{
	String feather ;//羽毛
	
	public Bird(String feather) {
		this.feather = feather;
		System.out.println("这是我创建的一个鸟类");
	}
	
	public void growFeather() {
		System.out.println("长满了"+feather+"的羽毛");
	}
	
	public abstract void move();
	
	public void eat() {
		System.out.println("都是用嘴巴吃饭的");
	}
}
