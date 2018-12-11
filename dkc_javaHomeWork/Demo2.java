package cn.dkc_javaHomeWork;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 	1.������дHelloJava���򣬲����ϱ�Ҫ��ע�͡�
2.�����˵Ļ�����Ϣ���������Ա𡢼��ᡢסַ����ӡ������̨�������������Ϣ�ֱ�ռһ�С�
3.���\n(����)��\t(�Ʊ��)���ո���ڿ���̨��ӡ������ͼ��ʾ��Ч����

4.�Ӽ�������С������ĩ�ɼ���
���ɼ�Ϊ100��ʱ������һ��BMW��
���ɼ�Ϊ��80��99]ʱ������һ��̨iphone5s��
���ɼ�Ϊ[60,80]ʱ������һ���ο��飻
����ʱ��ʲô����Ҳû�С�
5.��д�����ɼ����������������ֱ�������num1��num2��num3�������ǽ�������(ʹ�� if-else if-else),���Ҵ�С�������
6.��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���
 */
public class Demo2 {
	public static void main(String[] args) {
		//Score();
		
		/*int []arr = {1,2,3,4,5,6};
		reserve(arr);*/
		
		/*date();
		SimpleDateFormat sdf = new SimpleDateFormat("D");
		String daytime = sdf.format(new Date());
		System.out.println("һ���"+daytime+"��");*/
		
//		test();
		
	/*	short  s = 5;
	      s = s-2;
	      
	      byte b = 3;
	       b = b + 4; 
	       
	        byte b = 5;
	       short s = 3;
	       short t = s + b;
			��ȷ
	       char c = 'a';
	       int  i = 5;
	       double d = .314;
	       double result = c+i+d;*/ 
	      
		System.out.println("��������Ϊ:"+str(3000,5,0));
		Change2(2, 3);
	}
	
	private static void test() {
		int x=0,y=1;
		if(++x==y-- & x++==1 || --y==0) {
			System.out.println("x="+x+",y="+y);
		}
		else
			System.out.println("y="+y+",x="+x);
	}

	private static void Change1(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a = "+a+",b = "+b);
	}
	
	private static void Change2(int x,int y) {
		x = x + y; 
		y = x - y; 
		x = x - y; 
		System.out.println("x = "+x+",y = "+y);
	}

	private static void Score() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ɼ���");
			int score = s.nextInt();
			if(score<0||score>100) {
				System.out.println("����������ɼ���");
			}
			else {
				if(score == 100) {
					System.out.println("����һ��BWM");
				}
				else if(score > 80) {
					System.out.println("����һ��̨iphone5s");
				}
				else if(score > 60) {
					System.out.println("����һ���ο���");
				}
				else {
					System.out.println("����Ϊ���ͷ��ɣ�");
				}
			}
		}
	}
	
	private static void reserve(int []arr) {
		for(int startIndex = 0,endIndex = arr.length-1;startIndex < endIndex;startIndex++,endIndex--) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		for(int i :arr) {
			System.out.print(i+",");
		}
	}
	
	private static void date() {
//		�����·�
		int []arr1 = {31,29,31,30,31,30,31,31,30,31,30,31};
//		ƽ���·�
		int []arr2 = {31,28,31,30,31,30,31,31,30,31,30,31};
//		�ж�
		System.out.println("������ݣ�");
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		System.out.println("�����·�");
		int m = s.nextInt();
		System.out.println("������");
		int d = s.nextInt();
		if(y%4 == 0&&y%100 != 0|| y%400==0) {
			System.out.println("������");
			if(m == 1) {
				d = d;
			}
			else {
				for(int i = 0;i<m-1;i++) {
					d += arr1[i];
				}
			}
			System.out.println(y+"-"+m+"-"+d+"��һ��ĵ�"+d+"��");
		}
		else {
			System.out.println("��ƽ��");
			if(m == 1) {
				d = d;
			}
			else {
				for(int i = 0;i<m-1;i++) {
					d += arr2[i];
				}
			}
			System.out.println(y+"-"+m+"-"+d+"��һ��ĵ�"+d+"��");
		}	
	}
	
	private static int str(int n,int m,int count) {
		
		if(n>=5) {
			count++;
			return str(n/2,m,count);
		}
		else
			return count;
	}
}
