package carproject;

public abstract class Bird extends Animal{
	String feather ;//��ë
	
	public Bird(String feather) {
		this.feather = feather;
		System.out.println("�����Ҵ�����һ������");
	}
	
	public void growFeather() {
		System.out.println("������"+feather+"����ë");
	}
	
	public abstract void move();
	
	public void eat() {
		System.out.println("��������ͳԷ���");
	}
}
