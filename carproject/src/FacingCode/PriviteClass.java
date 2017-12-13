package FacingCode;

public class PriviteClass {
	public static void main(String[] args) {
		GetNew getNew = new GetNew();
		//这里调用内部类的构造方法
		Outname method = getNew.returnNameClass();
		
		// 这里可以调用内部类的方法
		method.f();
	}
}
interface Outname{
	public void f();
}
class GetNew{
	private class name implements Outname{
		public name(String type) {
			System.out.println("这是内部类name的构造方-----"+type);
		}
		
		public void f() {
			System.out.println("这是内部类中的方法");
		}
	}
	
	public name returnNameClass() {
		return new name("定义了一个方法用于返回name类");
	}
	
	
}
