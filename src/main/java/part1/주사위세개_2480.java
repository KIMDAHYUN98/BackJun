package part1;

import java.util.Scanner;

public class �ֻ�������_2480 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int result = 0;
		
		if(n1 == n2 && n2 == n3 && n1 == n3) // ���� �� 3���� ���� ���
			result = 10000 + n1 * 1000;
		else if(n1 == n2 || n1 == n3) // ���� �� 2�� ���� ���
			result = 1000 + n1 * 100;
		else if(n2 == n3) // ���� �� 2�� ���� ���
			result = 1000 + n2 * 100; 
		else // ��� �ٸ� ��
			result = Math.max(n1, Math.max(n2, n3)) * 100; // �� �� ���� ū ��
		
		System.out.println(result);
		
		sc.close();
	}
}
