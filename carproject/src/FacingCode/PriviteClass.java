package FacingCode;

public class PriviteClass {
	public static void main(String[] args) {
		GetNew getNew = new GetNew();
		//��������ڲ���Ĺ��췽��
		Outname method = getNew.returnNameClass();
		
		// ������Ե����ڲ���ķ���
		method.f();
	}
}
interface Outname{
	public void f();
}
class GetNew{
	private class name implements Outname{
		public name(String type) {
			System.out.println("�����ڲ���name�Ĺ��췽-----"+type);
		}
		
		public void f() {
			System.out.println("�����ڲ����еķ���");
		}
	}
	
	public name returnNameClass() {
		return new name("������һ���������ڷ���name��");
	}
	
	
}
