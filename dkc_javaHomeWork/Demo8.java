package cn.dkc_javaHomeWork;
//����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������Ȼ���������Ԫ�ص����ֵ����Сֵ��ƽ��ֵ����ֵ�������������

import java.util.Random;

public class Demo8 {
	public static void main(String[] args) {
		Random r = new Random();
		int []arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = r.nextInt(100);
		}
		for(int i:arr) {
			System.out.println(i+",");
		}
		System.out.println("���ֵ��"+printMax(arr));
		System.out.println("��Сֵ��"+printMin(arr));
		System.out.println("��ֵ��"+printAdd(arr));
		System.out.println("ƽ��ֵ��"+printAverage(arr));
	}
	private static int printMax(int []arr) {
		int max = 0;
		for(int i = 0;i<arr.length;i++) {
			if(max < arr[i])
				max = arr[i];
			
		}
		return max;
	}
	private static int printMin(int []arr) {
		int min = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(min > arr[i])
				min = arr[i];
		}
		return min;
	}
	private static int printAdd(int []arr) {
		int count = 0;
		for(int i = 1;i<arr.length;i++) {
			count += arr[i];
		}
		return count;
	}
	private static double printAverage(int []arr) {
		int score = printAdd(arr);
		double average = (double)score/arr.length;
		return average;
	}
}
