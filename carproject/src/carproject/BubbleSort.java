package carproject;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int MaoPao[] = {21,2,22,14,12,10,99,70,20,0}; 
		bubbleSort.sort(MaoPao);
	}

	/*����ð������*/
	public void sort(int MaoPao[]) {
		for(int i = 1 ; i < MaoPao.length ;i++){
			for(int j = 0; j< MaoPao.length - i;j++) {
				if(MaoPao[j] < MaoPao[j+1]) {
					int temp = MaoPao[j];
					MaoPao[j] = MaoPao[j+1];
					MaoPao[j+1] = temp;
				}
			}
		}
		print(MaoPao);
	}
	/*�����ӡ*/
	public void print(int MaoPao[]) {
		for (int i : MaoPao) {
			System.out.print(i+" ");
		}
	}
}
