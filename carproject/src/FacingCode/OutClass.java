package FacingCode;

public class OutClass {
	// �ⲿ����ʵ�����ڲ������
//	innerClass inner = new innerClass();
	// OutClass ���ⲿ��
	class innerClass{
		// innerClass ���ڲ���
		public innerClass(String FirstName) {
			System.out.println(FirstName);
		}
		// �ڲ����е�����
		String name = "hwy";
		
		public void Allname() {
			System.out.println("�����ڲ���ķ���");
		}
	}
	
	public innerClass returnClass() {
		return new innerClass("������");
	}
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		//�ⲿ��������
		innerClass getName = outClass.returnClass();
		getName.Allname();
	}
}
