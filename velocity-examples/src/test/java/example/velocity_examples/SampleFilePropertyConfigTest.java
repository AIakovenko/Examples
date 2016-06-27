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
public class SampleFilePropertyConfigTest {
	
	Sample sample;

	/**
	 * Test method for {@link example.velocity_examples.SampleFilePropertyConfig#getContent()}.
	 */
	@Test
	public void testGetContent() {
		sample = new SampleObject();
		String content = sample.getContent();
		assertNotNull(content);
		assertTrue(content.contains("Object using examle"));
	}

}
