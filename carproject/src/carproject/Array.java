package carproject;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[][] = {{1,2,3},{2,3,4},{4,5,6}};
		int i ;
		int j;
		int count = 0;
		for(i=0;i<b.length;i++) {
			for(j=0;j<b[i].length;j++) {
//				System.out.print(b[i][j]);
				if(i == j) {
					count += b[i][j];
				}
			}
			if( j%3 ==0) {
//				System.out.println();
			}
			
		}
//		System.out.println(count);
		
//		for(int ii=0;ii<b.length;ii++) {
//			for (int ks : b[ii]) {
//				System.out.print(ks);
//			}
//			System.out.println(|);
//		}
		/*将手机号 13858126467 替换成  138****6467  */
		String[] mobile = {"1","3","8","5","8","1","2","6","4","6","7"};
		String star = "*";
		Arrays.fill(mobile,3,7,star);
		for (String k : mobile) {
//			System.out.print(k);
		}
		/*copyRange 后的新数组 不包括 toIndex 下标的元素*/
		int newArray[] = {3,2,0,6,8,1,1,9,9,4,0,3,0,9,7,6,1,7};
		int getNewArray[]  = Arrays.copyOfRange(newArray, 6, 14);
		for (int k : getNewArray) {
//			System.out.print(k);
		}
		
		int MaoPao[] = {1,3,5,2,11,22,14,17};
		int temp ;
		for(int m = 1;m<MaoPao.length;m++) {
			for(int n = 0;n<MaoPao.length-i;n++) {
				if(MaoPao[n] > MaoPao[n+1]) {
					temp = MaoPao[n];
					MaoPao[n] = MaoPao[n+1];
					MaoPao[n+1] = temp;
				}
			}
		}
		
		for (int k : MaoPao) {
			System.out.print(k+" ");
		}
	}
}
