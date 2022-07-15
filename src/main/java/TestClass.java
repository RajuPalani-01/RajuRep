import org.testng.annotations.Test;

public class TestClass {
	@Test(priority = 2)
	private void tc1() {
		System.out.println("Method 1");
	}
	@Test(priority = -1)
	private void tc2() {
		System.out.println("Method 2");
	}
	@Test(priority = 0)
	private void tc3() {
		System.out.println("Method 3");
	}
	@Test(priority = -5)
	private void tc4() {
		System.out.println("Method 4");
	}

}
