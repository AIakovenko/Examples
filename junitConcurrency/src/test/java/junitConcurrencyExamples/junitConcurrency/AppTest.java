package junitConcurrencyExamples.junitConcurrency;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.mycila.junit.concurrent.Concurrency;
import com.mycila.junit.concurrent.ConcurrentJunitRunner;

/**
 * Unit test for simple App.
 */
@RunWith(ConcurrentJunitRunner.class)
@Concurrency(value = 2)
public class AppTest {
    
	@Test
	public void testKickStart1() throws Exception{
		App app = new App();
		app.kickStart(Thread.currentThread().toString());
		
		Thread.sleep(50_000);
	}
	
	@Test
	public void testKickStart2() throws Exception{
		App app = new App();
		app.kickStart(Thread.currentThread().toString());
		
		Thread.sleep(50_000);
	}
}
