package exercise;

public class Ex5_12 {

	public static void main(String[] args) {
			// 3m 우물 바닥에 달팽이가 있다.
			// 달팽이는 낮동안 55cm 올라올 수 있다. 하지만 날이 지면 잠을 자야 한다.
			// 자는 동안 3cm 미끄러져 내려온다.
			// 달팽이가 우물 밖으로 나오는데 몇일이 걸릴까?
			// 반복문과 조건문을 이용하여 프로그램을 작성하시오.
		int depth = 3*100;
		int height = 0;
		final int up = 55;
		final int down = 3;
		int days = 1;
		
		while(true) {
			height += up;
			if(height>=depth) break;
			days++;
			height-=down;
		}
		System.out.println(days+"일 소요");
	}

}
