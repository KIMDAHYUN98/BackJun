package part1;

import java.util.Scanner;

public class 막대기_1094 {
	
	
	// 문제 풀이 목표 : x가 주어졌을 때 몇 개의 막대를 풀로 붙여서 만들 수 있는지 구한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지민이가 원하는 막대 길이를 입력하시오(cm) : ");
		int length = sc.nextInt(); // 지민이가 원하는 막대 길이	
		int cnt = 0; // 풀로 붙이는 횟수
		int stick = 64; // 지민이가 가지고 있는 막대 길이
		
		while(length > 0) {
			if(stick > length) // 지민이가 가지고 있는 막대(stick) 길이가 원하는 막대 길이(length)보다 길면
				stick = stick / 2; // 지민이가 가지고 있는 막대 길이(stick)를 반으로 자른다
			else { // 지민이가 가지고 있는 막대 길이가 원하는 막대 길이보다 짧으면
				cnt++; // 풀로 붙이는 횟수를 하나 증가하고
				length = length - stick; // 원하는 막대 길이에다가 지민이 막대 길이를 빼준다.
			}
		}  
		
		System.out.println(cnt); // 풀로 붙이는 횟수 출력 = 막대 갯수
	}
}
