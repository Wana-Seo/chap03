package control;

import java.util.Scanner;

/*
 * 0.���� 1.�簢�� 2.�ﰢ��
 * 
 * 
 * 
 */
public class MenuArea {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu;
		String result = null;

		do {
			
			menu = sc.nextInt();
		
			if (menu == 0) {
				System.out.println("Exit Programm");
				break;
			}
			
			else if (menu == 1) {
				result = "�簢��";
			}
			
			else if (menu == 2) {
				result = "�ﰢ��";
			}
			
			else {
				System.out.println("�߸��� �Է°��Դϴ�.");
				continue;
			}
			
			System.out.println("result : " + result);
			
		} while (true);
		
	
	}

}
