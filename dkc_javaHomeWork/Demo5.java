package cn.dkc_javaHomeWork;

import java.util.Scanner;

/*2.�Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ���
�ɼ�>=��߷�-10  �ȼ�Ϊ��A��   �ɼ�>=��߷�-20  �ȼ�Ϊ��B��
�ɼ�>=��߷�-30  �ȼ�Ϊ��C��   ����     �ȼ�Ϊ��D��
��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ���
*/
public class Demo5 {
	public static void main(String[] args) {
		int []arr = cinScore();
		printLevel(arr);
	}
	private static int printMaxScore(int []arr) {
		int max = 0;
		for(int i = 0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	private static int[] cinScore() {
		System.out.println("������ѧ��������");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n];
		System.out.println("������ѧ���ɼ���");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	private static void printLevel(int []arr) {
		int max = printMaxScore(arr);
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>=max-10) 
				System.out.println("��"+(i+1)+"ѧ���ɼ�Ϊ"+arr[i]+"�ȼ�ΪA");
			else if(arr[i]>=max-20)
				System.out.println("��"+(i+1)+"ѧ���ɼ�Ϊ"+arr[i]+"�ȼ�ΪB");
			else if(arr[i]>=max-30)
				System.out.println("��"+(i+1)+"ѧ���ɼ�Ϊ"+arr[i]+"�ȼ�ΪC");
			else
				System.out.println("��"+(i+1)+"ѧ���ɼ�Ϊ"+arr[i]+"�ȼ�ΪD");
		}
	}
}
