package carproject;

public abstract class Teacher {
	abstract public void teaching();
}


class MathTeacher extends Teacher{
	@Override
	public void teaching() {
		// TODO Auto-generated method stub
		System.out.println("�ҽ���ѧ��");
	}
}