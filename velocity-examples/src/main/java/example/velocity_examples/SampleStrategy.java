/**
 * 
 */
package example.velocity_examples;

/**
 * Jun 26, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class SampleStrategy {
	
	private Sample sample;
	
	public SampleStrategy(Sample sample) {
		this.sample = sample;
	}
	
	public String getContent(){
		return sample.getContent();
	}

}
