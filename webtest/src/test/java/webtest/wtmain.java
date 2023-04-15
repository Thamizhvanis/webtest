package webtest;

import org.testng.TestNG;

public class wtmain {

	public static void main(String[] args) {
	
		TestNG testNg = new TestNG();
		 testNg.setTestClasses(new Class[] {webtest.class});
			testNg.run();


	}

}
