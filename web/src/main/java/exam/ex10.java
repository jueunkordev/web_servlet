package exam;

import java.util.Scanner;

public class ex10 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("[1. 휴대푠 인증 2. 이메일 인증] 선택 : ");
		new ex10().sec();
		
	}
	public void sec() {
		String part = this.sc.next();
		String result = null;
		if(part.equals("1")) {
			try {
				Integer hpno = this.sc.nextInt();
				System.out.println("휴대폰 번호를 입력하세요 (숫자만)");
				result = this.hp();
			} catch (Exception e) {
				System.out.println("숫자만 입력하셔야 합니다. 재실행합니다.");
				new ex10().main(null);
			}
			
		}
		else if(part.equals("2")) {
			System.out.println("이메일을 입력하세요");
			String useremail = this.sc.next();
			result = this.email(useremail);
		}
		else {
			new ex10().main(null);
		}
	}
}

abstract class ex10_box{
	Scanner sc = new Scanner(System.in);
	public String hp(Integer hpno) {
		String msg = "인증번호 발송";
		return msg;
	}
	public String email(String email) {
		String msg = "인증번호 발송";
		return msg;
	}
}




