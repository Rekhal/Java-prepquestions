package selenium;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

public class TestNGAnnotations {

	@Test(priority=2)
	public void test1(){
		System.out.println("This is test case1");
	}
	@Test(priority=1)
	public void test2(){
		System.out.println("This is testcase2");
		assertEquals("A", "A");
	}
	@Test(priority=1,dependsOnMethods="test2",alwaysRun=true)
	public void test3(){
		System.out.println("This is testcase3");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("This will execute before method");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("This will execute after method");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("This will execute before class");
	}
	@AfterClass
	public void afterclass(){
		System.out.println("This will execute after class");
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("This will execute before test");
	}
	@AfterTest
	public void aftertest(){
		System.out.println("This will execute after test");
	}
	@BeforeSuite
	public void beforesuite(){
		System.out.println("This will execute before suite");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("This will execute after suite");
	}
}


