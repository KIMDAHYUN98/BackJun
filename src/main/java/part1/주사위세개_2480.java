package part1;

import java.util.Scanner;

public class 주사위세개_2480 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int result = 0;
		
		if(n1 == n2 && n2 == n3 && n1 == n3) // 같은 눈 3개가 나올 경우
			result = 10000 + n1 * 1000;
		else if(n1 == n2 || n1 == n3) // 같은 눈 2개 나올 경우
			result = 1000 + n1 * 100;
		else if(n2 == n3) // 같은 눈 2개 나올 경우
			result = 1000 + n2 * 100; 
		else // 모두 다른 눈
			result = Math.max(n1, Math.max(n2, n3)) * 100; // 그 중 가장 큰 눈
		
		System.out.println(result);
		
		sc.close();
	}
}
