package FacingCode;

public class In {
	InIN getClass = new InIN();
	class InIN{
		//成员内部类
		int a = 10; 
		
		public int Count() {
			return 12;
		}
	}
	
	public static void main(String[] args) {
//		In.InIN in = ;
		In in = new In();
//		in.getClass.a = 20;
		// 调用 成员类的属性
		System.out.println(in.getClass.a);
		System.out.println(in.getClass.Count());
	}
}
