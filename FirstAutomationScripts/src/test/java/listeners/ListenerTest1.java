package listeners;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(listeners.CustomListeners.class)
public class ListenerTest1 {

	@Test
	void test1() {
		System.out.println("this is test 1");
		Assert.assertTrue(true);
	}
	
	@Test
	void test2() {
		System.out.println("this is test 2");
		Assert.assertTrue(false);
	}
	
	@Test
	void test3() {
		System.out.println("this is test 3");
		throw new SkipException("this is exception...");
	}
}
