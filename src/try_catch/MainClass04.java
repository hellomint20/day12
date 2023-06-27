package try_catch;

import java.util.Scanner;

class TestClass04{
	public void test() {
		Scanner sc = new Scanner(System.in);
		int n1 =10, n2 =0;
		try {
			System.out.println(n1/n2);
			return;		//메소드 종료시키는 역할
		} catch (Exception e) {
			System.out.println("문제 발생!!!");
		} finally {		//무조건 실행됨 (return 있어도 실행됨)
			System.out.println("finally 실행");
			sc.close();		//닫아주는 역할을 함
		}
		System.out.println("다음 문장들 실행");
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test();
	}
}
