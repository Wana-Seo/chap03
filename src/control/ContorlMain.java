package control;

import java.util.Scanner;

public class ContorlMain {
	
	public static void main(String[] args) {
		
		int score;
		String grade;
		
		do {
			// ��� ��� ���ǹ�
			Scanner sc = new Scanner(System.in);
			score = sc.nextInt();
			
			if (score == 0) {
				break;
			}
			
			if (score >= 90) {
				grade = "A���";
			}
			
			else if (score >= 80 && score < 90) {
				grade = "B���";
			}
			
			else if (score >= 70 && score < 80) {
				grade = "C���";
			}
			
			else if (score >= 60 && score < 70) {
				grade = "D���";
			}
			
			else {
				grade = "F���";
			}
			
			System.out.printf("%d ���� %s �Դϴ�.\n", score, grade);
			
		} while(true);
		
		System.out.println("���α׷� ����");
			
	}

}
