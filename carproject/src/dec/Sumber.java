package dec;

public enum Sumber implements SetParameter{
	WINTER{
		// ö������ implements �ӿڣ�ʵ�ֽӿ��еķ���
		@Override
		public int getSum(int array[]) {
			// TODO Auto-generated method stub
			for(int i = 0;i<array.length;i++) {
				sum += i;
			}
			return sum;
		}
	};
	int sum;
}
