package exercise;
//규칙은 첫 번째 행은 모두 1로 초기화 하고 다음 행부터는 바로 위의 값과 바로 왼쪽의 값을 더한 것이다.
public class ArrayTest13 {

	public static void main(String[] args) {
		int[] arr[] = new int[5][6]; 
		for(int i=0; i<arr[0].length;i++) {
			arr[0][i] = 1;
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=1; j<arr[0].length;j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}