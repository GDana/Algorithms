package testCode;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	int hello[] = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10 };
		int a = 72;
		long b = 9223372036854775807l;
		
			// System.out->ǥ�������ġ(�����,������),System.in(ǥ���Է���ġ->Ű����)
			System.out.println(a);// 72
			System.out.println(hello);// hello�迭�� ������ġ�� ���
			// ������Ҷ� Ư�� ���->����(������ ���念��)->������� �����ͽ���->�����ͼ�������� ����
			System.out.write(a);// H, int��
			System.out.flush();// ���ۿ� �������� ���� �ٷιٷ� ����϶�
//			System.out.write(hello);// ������Ҷ����� �ݵ�� ����ó���� �ؾ� �ȴ�.
//			System.out.write(b);
		
    }
}

