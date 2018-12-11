package cn.dkc_javaHomeWork;
/*ʹ�ü�����
(1)����һ����ΪTestArray���࣬��main()����������array1��array2����������������int[]���͵����顣
(2)ʹ�ô�����{}����array1��ʼ��Ϊ8��������2,3,5,7,11,13,17,19��
(3)��ʾarray1�����ݡ�
(4)��ֵarray2��������array1���޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ(��array[0]=0,array[2]=2)����ӡ��array1��*/
public class Demo9 {
	public static void main(String[] args) {
		int []array1 = {2,3,5,7,11,13,17,19};
		int []array2 = new int[8];
		for(int i:array1) {
			System.out.print(i+" ");
		}
		System.out.println();
//		System.arraycopy(array1, 0, array2, 0, array1.length);
		for(int i = 0;i<array1.length;i++) {
			array2[i] = array1[i];
		}
		for(int i:array2) {
			System.out.print(i+" ");
		}
		for(int i = 0;i<array2.length;i++) {
			if(i%2==0) {
				array2[i] = i;
			}
		}
		System.out.println();
		for(int i:array2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:array1) {
			System.out.print(i+" ");
		}
	}
}
