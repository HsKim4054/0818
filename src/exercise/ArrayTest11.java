//100 미만의 양의 정수들이 주어진다.
//입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
//그때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지
//작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
//입력: 10 55 3 63 85 61 85 0
//출력:
//0 : 1
//1 : 1
//5 : 1
//6 : 2
//8 : 2

package exercise;

import java.util.Scanner;

public class ArrayTest11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[10];
		int num = 0;
		System.out.print("입력:");
		
		while(true) {
			num = sc.nextInt();
			if(num == 0)
				break;
			cnt[num/10]++;
		}
		System.out.println("출력:");
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i] !=0)
				System.out.println(String.format("%d : %d",i,cnt[i]));
		}
	}
}
