package login;

public class LoginTest {
	
	public void test()
	{
		System.out.println("This is new Test for Git repository");
	}

	private static void showMessage(){
		System.out.println("Test Passed without any error");
	}
	
	private static void showMessage2(){
		System.out.println("Test Passed");
	}
	
	private static void showMessage23(){
		System.out.println("Test Passed");
	}
	
	
	public static void main(String[] args) {
		LoginTest LT = new LoginTest();
		LT.test();
		showMessage();
		System.out.println("Test Passed Successfully");
		
	}
	
	
}
