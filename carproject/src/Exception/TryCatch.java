package Exception;

public class TryCatch {
	public static void main(String[] args) {
		String name = "money";
		if(!name.equals("human")) {
			try {
				throw new NohumanException("�ⲻ�����డ");
			} catch (NohumanException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
