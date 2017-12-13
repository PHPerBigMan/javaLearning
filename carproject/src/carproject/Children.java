package carproject;

public class Children extends Father{
	
	public Children(String Home) {
		
//		super("州市富阳区场口镇浙江省杭");
		super(Home);
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
//		System.out.println();
		Father father = new Father("浙江省杭州市富阳区1");
		father.GetHomeTown();
	}
}
