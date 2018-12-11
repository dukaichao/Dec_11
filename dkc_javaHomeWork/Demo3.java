package cn.dkc_javaHomeWork;
import java.util.Random;
import java.util.Scanner;
/*
������
(1)������Pritimive�������ж���һ����3��Ԫ�ص�boolean���͵�����t��Ϊ���Ա����������Ԫ��δ��ֵ��
������Array1����Array1��main()�����д���Pritimive����d��������Ա����t������Ԫ��ֵ��
��ϰĿ�ģ�������������������鴴��ʱ���Զ���ֵ��*/
class pritimive{
	boolean []b = new boolean[3];

	public pritimive(boolean[] b) {
		super();
		this.b = b;
	}
	public void ptint() {
		for(boolean i:b) {
			System.out.println(i);
		}
	}
}
public class Demo3 {
	public static void main(String[] args) {
		/*toUpper();
		score();
		printSeason();
		Date();
		String str = getPlayerName();
		System.out.println(str);*/
		Random r = new Random();
		boolean []b = {r.nextBoolean(),r.nextBoolean(),r.nextBoolean()};
		pritimive p = new pritimive(b);
		p.ptint();
	}
	/*
	 ������
	(1)������Pritimive�������ж���һ����3��Ԫ�ص�boolean���͵�����t��Ϊ���Ա����������Ԫ��δ��ֵ��
	������Array1����Array1��main()�����д���Pritimive����d��������Ա����t������Ԫ��ֵ��
	��ϰĿ�ģ�������������������鴴��ʱ���Զ���ֵ��*/
//	������
	private static String getPlayerName() {
		System.out.println("���������:");
		Scanner s = new Scanner(System.in);
		int player = s.nextInt();
		if(player == 1)
			return "����";
		else if(player == 2)
			return "����";
		else if(player == 3)
			return "С��";
		else 
			return "û�������";
		
	}
//	������
	private static void Date() {
		int []arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner s = new Scanner(System.in);
		System.out.println("�������º���");
		int m = s.nextInt();
		int d = s.nextInt();
		for(int i = 0;i < m-1;i++) {
			if(m == 1) {
				d = d;
				break;
			}
			else {
				d += arr[i];
			}
		}
		System.out.println("����һ���"+d+"��");
	}
//	�ڶ���
	private static void score() {
		System.out.println("������ɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score > 60) {
			System.out.println("�ϸ�");
		}
		else {
			System.out.println("���ϸ�");
		}
	}
//	������
	private static void printSeason() {
		System.out.println("�������·ݣ�");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month+"���Ƕ���");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month+"���Ǵ���");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"�����ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"�����＾��");
			break;
		}
	}
//	��һ��
	private static void toUpper() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("������97-122��");
			int i = sc.nextInt();
			char c = (char) i;
			System.out.println(c);
			switch(c) {
			case 'a':
				System.out.println(c+"��дΪ��"+(c-32));
				break;
			case 'b':
				System.out.println(c+"��дΪ��"+(c-32));
				break;
			case 'c':
				System.out.println(c+"��дΪ��"+(c-32));
				break;
			case 'd':
				System.out.println(c+"��дΪ��"+(c-32));
				break;
			case 'e':
				System.out.println(c+"��дΪ��"+(c-32));
				break;
			default:
				System.out.println("other");
			}
			
		}
	}
}