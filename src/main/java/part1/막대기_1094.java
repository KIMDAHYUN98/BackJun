package part1;

import java.util.Scanner;

public class �����_1094 {
	
	
	// ���� Ǯ�� ��ǥ : x�� �־����� �� �� ���� ���븦 Ǯ�� �ٿ��� ���� �� �ִ��� ���Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����̰� ���ϴ� ���� ���̸� �Է��Ͻÿ�(cm) : ");
		int length = sc.nextInt(); // �����̰� ���ϴ� ���� ����	
		int cnt = 0; // Ǯ�� ���̴� Ƚ��
		int stick = 64; // �����̰� ������ �ִ� ���� ����
		
		while(length > 0) {
			if(stick > length) // �����̰� ������ �ִ� ����(stick) ���̰� ���ϴ� ���� ����(length)���� ���
				stick = stick / 2; // �����̰� ������ �ִ� ���� ����(stick)�� ������ �ڸ���
			else { // �����̰� ������ �ִ� ���� ���̰� ���ϴ� ���� ���̺��� ª����
				cnt++; // Ǯ�� ���̴� Ƚ���� �ϳ� �����ϰ�
				length = length - stick; // ���ϴ� ���� ���̿��ٰ� ������ ���� ���̸� ���ش�.
			}
		}  
		
		System.out.println(cnt); // Ǯ�� ���̴� Ƚ�� ��� = ���� ����
	}
}
