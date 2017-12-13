package FacingCode;

public class OutClass {
	// 外部类中实例化内部类对象
//	innerClass inner = new innerClass();
	// OutClass 是外部类
	class innerClass{
		// innerClass 是内部类
		public innerClass(String FirstName) {
			System.out.println(FirstName);
		}
		// 内部类中的属性
		String name = "hwy";
		
		public void Allname() {
			System.out.println("这是内部类的方法");
		}
	}
	
	public innerClass returnClass() {
		return new innerClass("洪文洋");
	}
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		//外部类主方法
		innerClass getName = outClass.returnClass();
		getName.Allname();
	}
}
