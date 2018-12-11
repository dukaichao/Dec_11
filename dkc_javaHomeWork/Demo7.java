package cn.dkc_javaHomeWork;
//�������
public class Demo7 {
	public static void main(String[] args) {
		int [][] arr = new int[10][10];
		for(int i = 0;i<10;i++) {
			
			for(int j = 0;j<=i;j++) {
				if(j == 0||i == j ){
					arr[i][j] = 1;
				}
				else
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		for(int i = 0;i<10;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
