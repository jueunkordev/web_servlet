package exam;

import java.util.Random;
import java.util.Scanner;

// Random : 자동으로 PC 생성하는 원리 => 기본 소수점
// Math.random()
// 난수 선언 시 클래스 VS 함수
public class exam1 {

	public static void main(String[] args) {
		/*for(int i=0; i<5; i++) {
			double rd = Math.random();
			char word = (char)((rd*26)+97);
			System.out.println(word);*/
		
		  Random rand = new Random();
		  Scanner sc = new Scanner(System.in);
		  System.out.print("숫자 하나를 입력하세요 : ");
		  int no = sc.nextInt();
		  for(int f=0; f<no; f++) {
			 int free = rand.nextInt(99);
			 System.out.println(free);
		}
		sc.close();
		
		
	}

}







