package cn.dkc_javaHomeWork;
//4�����룬����40g���ܳƳ�1--40g������������������4����

import java.util.ArrayList;

class FaMa{
	int count;
	ArrayList A = new ArrayList();
	ArrayList B = new ArrayList();
	FaMa(int count){
		if(count>0) {
			this.count = count;
		}
	}
	
	public void prtGroup() {
		int Left,Inserted,temp;
		Left = count;
		Inserted = 0;
		temp = Inserted*2+1;
		int index = 0;
		while(Left>0) {
			temp = Math.min(temp, Left);
			A.add(index,new Integer(temp));
			for(int i = Inserted + 1;i<=Inserted+temp;i++) {
				if(i<temp) {
					B.add(i-1,new String(temp+"-("+B.get(temp-i-1)+")"));
				}
				else if(i == temp) {
					B.add(i-1,Integer.toString(temp));
				}
				else if(i>temp) {
					B.add(i-1,new String(temp+"+("+B.get(i-temp-1)+")"));
				}
			}
			Inserted = Inserted + temp;
			Left = Left - temp;
			temp = Inserted*2 + 1;
			index++;
		}
		
		for(int i = 0;i<A.size();i++) {
			System.out.println("weight"+(i+1)+" = "+A.get(i));
		}
		
		for(int i = 0;i<B.size();i++) {
			System.out.println((i+1)+" = "+B.get(i));
		}
	}
}
public class Demo10 {
	public static void main(String[] args) {
		int count = 40;
		FaMa fm = new FaMa(count);
		fm.prtGroup();
	}
}
