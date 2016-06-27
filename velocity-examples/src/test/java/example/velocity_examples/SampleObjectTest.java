/**
 * 
 */
package example.velocity_examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Jun 27, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class SampleObjectTest {

	Sample sample;
	
	@Test
	public void test() {
		sample = new SampleObject();
		String content = sample.getContent();
		assertNotNull(content);
		assertTrue(content.contains("Object using examle"));
	}

}
