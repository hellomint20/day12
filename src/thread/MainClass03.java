package thread;

import java.util.Scanner;
//run 메소드 이용하고 start로 호출한다
class A03 extends Thread{
	public void run() {	
		for(;;) {
			System.out.println("내용이 출력된다~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		A03 a = new A03();
		a.setDaemon(true); 		//main이 종료되면 같이 종료하는 명령어
		a.start();
		
		while(true) {
			System.out.println("문자열 입력 : ");
			str = sc.next();
			System.out.println("입력한 값 : "+str);
			if(str.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("메인 종료");
	}
}
