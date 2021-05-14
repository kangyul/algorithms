package p0514;

import java.util.Scanner;

public class Ex0514_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 10명의 학생 성적을 처리하는 프로그램을 구현하시오.
		// 1. 학생 정보 입력
		// 2. 학생 정보 수정
		// 3. 학생 정보 검색
		// 4. 학생 정보 출력
		// 0. 프로그램 종료
		
		// Variables
		String[] name = new String[10]; // 학생 이름 
		int[][] score = new int[10][4]; // 국어,영어,수학,합계
		double[] avg = new double[4]; // 평균
		int option = 0; // 0~4까지의 옵션 
		String[] subject = {"국어", "영어", "수학"};
		int count = 0; // 학생 수 확인
		String check = ""; // 
		int indexU = 0; // index for Updating and Searching 
		int indexS = 0;
		int subjectNum = 0; // index for certain subject
		// Variables
		
		
		System.out.println("[학생 성적 정보 관리 프로그램]");
		
		loop1: while(true) {
			System.out.println("==============");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 수정");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("==============");
			
			System.out.print("옵션 입력: ");
			option = in.nextInt();
			
			switch (option) {
			case 1: 
				System.out.println("[1. 학생 정보 입력]");
				
				for(int i=count; i<count+name.length; i++) {
					System.out.print("<학생 이름 입력 / 0. 옵션 메뉴로 이동>: ");
					check = in.next();
					if (check.equals("0")) {
						System.out.println("옵션 메뉴로 이동합니다.");
						break;
					}
					name[i] = check;
					for(int j=0; j<score[i].length-1; j++) {
						System.out.print("<" + subject[j]);
						System.out.print("점수 입력>: ");
						score[i][j] = in.nextInt();
					}
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					avg[i] = score[i][3] / 3.0;
					
					count++;
				}
				
				System.out.println("학생 정보가 성공적으로 입력되었습니다.");
				
				break;
			
			case 2:
				System.out.println("[2. 학생 정보 수정]");
				System.out.print("<수정할 학생 이름 입력 / 0. 옵션 메뉴로 이동>: ");
				check = in.next();
				
				if (check.equals("0")) {
					System.out.println("옵션 메뉴로 이동합니다.");
					break;
				} 
				
				indexU = -1;
				
				for(int i=0; i<count; i++) {
					if(check.equals(name[i])) {
						indexU = i;
					}
				}
				
				int newScore = 0; 
				
				if(indexU == -1) {
					System.out.println(check + " 학생은 존재하지 않습니다.");
					break;
					
				} else {
					System.out.println("수정할 과목 선택");
					System.out.println("0. 국어 1. 영어 2. 수학");
					subjectNum = in.nextInt();
					System.out.println(check + " 학생의 현재 " + subject[subjectNum] + " 점수는 " + score[indexU][subjectNum]);
					System.out.println("새로운 점수 입력: ");
					newScore = in.nextInt();
					
					score[indexU][subjectNum] = newScore;
					score[indexU][3] = score[indexU][0]+score[indexU][1]+score[indexU][2];
					avg[indexU] = score[indexU][3] / 3.0;
					
					System.out.println("점수를 업데이트 했습니다.");				

				}
				
				break;
			
			case 3:
				System.out.println("[3. 학생 정보 검색");
				System.out.print("<검색할 학생 이름 입력 / 0. 옵션 메뉴로 이동>: ");
				check = in.next();
				
				if (check.equals("0")) {
					System.out.println("옵션 메뉴로 이동합니다.");
					break;
				} 
				
				indexS = -1;
				
				for(int i=0; i<count; i++) {
					if(check.equals(name[i])) {
						indexS = i;
					}
				}
				
				if(indexS == -1) {
					System.out.println(check + " 학생은 존재하지 않습니다.");
					break;
					
				} else {
					System.out.println("검색할 과목 선택");
					System.out.println("0. 국어 1. 영어 2. 수학");
					subjectNum = in.nextInt();
					System.out.println(check + " 학생의 현재 " + subject[subjectNum] + " 점수는 " + score[indexS][subjectNum]);
				}
				
				
				
				break;

			case 4:
				System.out.println("[4. 학생 정보 출력]");
				
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("----------------------------------------------");
				
				for(int i=0; i<count; i++) {
					System.out.print(name[i] + "\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t", score[i][j]);
					}
					System.out.printf("%.2f\n", avg[i]);
				}
				
				break;

			case 0:
				System.out.println("프로그램이 종료됩니다.");
				
				break loop1;

			default:
				System.out.println("[해당 옵션은 존재하지 않습니다.]");
				break;
			} // switch
			
		} // while
 		
	} // main

} // class
