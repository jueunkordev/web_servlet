package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class exam2 {
	public static void main(String[] args) {
		ex2_box ea = new ex2_box();
		ea.aaa();
		
	}
}

class ex2_box{
	ArrayList<Integer> user = null;
	Scanner sc = null;
	
	public ex2_box(){
		this.sc = new Scanner(System.in);
		this.user = new ArrayList<>();
	}
	
	public void aaa() {
		try {
			while(true) {
				System.out.print("숫자를 입력하세요 (1~46) : " );
				Integer no = this.sc.nextInt();
				if(no > 0 || no <= 46) {
					// 같은 숫자 확인
					if(this.user.contains(no)) {
						this.user.add(no);
					}
					System.out.println(no);
				}else {
					System.out.println("숫자는 1~46까지만 입력 가능");
				}
			}
			
		} catch (Exception e) {
			System.out.println("제발 숫자만 입력하세요");
			new ex2_box().aaa();
		}finally {
			this.sc.close();
		}
		
		
	}
}






