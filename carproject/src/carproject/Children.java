package carproject;

public class Children extends Father{
	
	public Children(String Home) {
		
//		super("���и������������㽭ʡ��");
		super(Home);
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
//		System.out.println();
		Father father = new Father("�㽭ʡ�����и�����1");
		father.GetHomeTown();
	}
}
