package cn.dkc_javaHomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 ������Student�������������ԣ�ѧ��number(int)���꼶state(int)���ɼ�score(int)������20��ѧ������ѧ��Ϊ1��20��
 �꼶�ͳɼ����������ȷ������ӡ��3�꼶(stateֵΪ3����ѧ����Ϣ��
��ʾ�������������Math.randon()������ֵ����double;  
	 ��������ȡ����Math.round()������ֵ����long��
*/
class Student{
	int number;
	int state;
	int score;
	public Student() {}
	public Student(int number, int state, int score) {
		super();
		this.number = number;
		this.state = state;
		this.score = score;
	}
	@Override
	public String toString() {
		return "[number:" + number + " state:" + state + " score:" + score + "]";
	}
	
	
}
public class Demo6 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Student> a = new ArrayList<Student>();
		for(int i = 0;i<20;i++) {
			a.add(new Student((i+1),r.nextInt(5)+1,r.nextInt(50)+50));
		}
		Iterator<Student> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(int i = 0;i<20;i++) {
			if(a.get(i).state == 3)
				System.out.println(a.get(i));
		}
	}

}
