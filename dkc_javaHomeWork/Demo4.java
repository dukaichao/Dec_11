package cn.dkc_javaHomeWork;

import java.util.Random;

/*������
(1)������Pritimive�������ж���һ����3��Ԫ�ص�boolean���͵�����t��Ϊ���Ա����������Ԫ��δ��ֵ��
������Array1����Array1��main()�����д���Pritimive����d��������Ա����t������Ԫ��ֵ��
��ϰĿ�ģ�������������������鴴��ʱ���Զ���ֵ��*/
class pritimive1{
	boolean []b = new boolean[3];

	public pritimive1(boolean[] b) {
		super();
		this.b = b;
	}
	public void ptint() {
		for(boolean i:b) {
			System.out.println(i);
		}
	}
}
public class Demo4 {
	public static void main(String[] args) {
		Random r = new Random();
		boolean []b = {r.nextBoolean(),r.nextBoolean(),r.nextBoolean()};
		pritimive1 p = new pritimive1(b);
		p.ptint();
	}
}