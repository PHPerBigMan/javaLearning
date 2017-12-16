package dec;

public enum Sumber implements SetParameter{
	WINTER{
		// 枚举类中 implements 接口，实现接口中的方法
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
