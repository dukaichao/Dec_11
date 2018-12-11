package cn.dkc_javaHomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("��������Ҫ�Ƚ����ĸ�����������Ƚ�����");
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			a.add(s.nextInt());
		}
		for(int i = 1;i<a.size();i++) {
			for(int j = 0;j<a.size()-i;j++) {
				if(a.get(j)<a.get(j+1)) {
					int temp = a.get(j);
					int temp1 = a.get(j+1);
					a.set(j, temp1);
					a.set(j+1, temp);
				}
			}
		}
		for(int i = 0;i<a.size();i++) {
			if(i < a.size()-1) {
				System.out.print(a.get(i)+">");
			}
			else
				System.out.println(a.get(i));
		}
	}
	/*public static void CompareThree() {
		
		System.out.println("��������������");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		if(Max(num1,num2)) {
			if(Max(num3,num1)) {
				System.out.println(num3+">"+num1+">"+num2);
			}
			else if(Max(num2,num3)) {
				System.out.println(num1+">"+num2+">"+num3);
			}
			else {
				System.out.println(num1+">"+num3+">"+num2);
			}
		}
		else {
			if(Max(num3,num2)) {
				System.out.println(num3+">"+num2+">"+num1);
			}
			else if(Max(num1,num3)) {
				System.out.println(num2+">"+num1+">"+num3);
			}
			else {
				System.out.println(num2+">"+num3+">"+num1);
			}
		}
	}
	public static boolean  Max(int x,int y) {
		if(x>y)  return true;
		else return false;
	}*/
}
