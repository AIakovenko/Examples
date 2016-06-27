/**
 * 
 */
package example.velocity_examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Jun 26, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class SampleHtmlTest {

	private Sample sample;
	/**
	 * Test method for {@link example.velocity_examples.SampleHtml#getContent()}.
	 */
	@Test
	public void testGetContent() {
		sample = new SampleHtml();	
		String content = sample.getContent(); 
		assertNotNull(content);
		assertTrue(content.contains("Httml sample"));
	}

}
