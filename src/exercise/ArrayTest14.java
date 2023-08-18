package exercise;

import java.util.Scanner;

/*
 * 입력 데이터 수 : 5
 * 95
 * 100
 * 85
 * 77
 * 60
 * 
 * 출력
 * 60 75 85 95 100
 */

public class ArrayTest14 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				int tmp=0;
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		/*for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				int tmp=0;
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		} 내가 한거, 강사님이 하신것은 오른쪽부터 정렬되고 내가 한것은 왼쪽부터 정렬됨
		*/
		System.out.println("출력");
		for(int i=0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
