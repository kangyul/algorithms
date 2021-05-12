import java.util.Scanner;

public class Ex0512_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 1. 6개 입력받아 출력
		int[] input = new int[6];
		for(int i=0; i<input.length; i++) {
			System.out.print((i+1)+"번째 로또 번호 입력:");
			input[i] = in.nextInt();
		}
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}
		
		//2. 로또 번호 배열 생성
		int[] ball = new int[45];
		
		//3. 로또번호 순차적으로 번호 넣기
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		// 4. 로또번호 섞기
		
		int temp=0;
		for(int i=0; i<200; i++) {
			int index = (int)(Math.random()*45);
			temp = ball[index];
			ball[index] = ball[0];
			ball[0] = temp;
		}
		
		// 5. 로또번호 출력하기
		System.out.println("<로또 번호>");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i] + "   ");
		}
		
		// 6. 로또 번호 확인하기
		int count = 0;
		int[] correct = new int[6];
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(input[i] == ball[j]) {
					correct[count] = input[i];
					count++;
				}
			}
		}
		
		// 7. 맞은 로또 번호 출력하기
		
		System.out.println("맞은 개수: " + count);
		
		System.out.println("<맞은 로또 번호>");
		for(int i=0; i<count; i++) {
			System.out.println(correct[i] + "   ");
		}
		

	}

}
