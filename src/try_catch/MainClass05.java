package try_catch;

class TestClass05{
	public void test1() throws InterruptedException {
		System.out.println("test111");
		test2();
	}
	public void test2() throws InterruptedException {
		System.out.println("test222");
		Thread.sleep(0);
	}
}

public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		TestClass05 t = new TestClass05();
		t.test1();
	}
}

//throws 는 try-catch 보다 코드는 깔끔해보임
//예외 전가 이기 때문에 호출 할때마다 throws를 써줘야 하는 불편함이 있음 