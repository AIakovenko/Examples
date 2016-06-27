/**
 * 
 */
package example.velocity_examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 * Jun 26, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class SampleHtml implements Sample{

	/* (non-Javadoc)
	 * @see example.velocity_examples.Sample#getContent()
	 */
	public String getContent(){
		String content = "";
		try(StringWriter writer = new StringWriter()){
			VelocityEngine ve = new VelocityEngine();
			ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
			ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
			ve.init();
			VelocityContext context = new VelocityContext();
			context.put("title", "Httml sample");
			context.put("text", "This is the exaple of using velocity tamlate.");
			Template template = ve.getTemplate("sample-html.vm", "utf-8");
			template.merge(context, writer);
			content = writer.toString();
		} catch (Exception e){
			e.printStackTrace();
		}		
		return content;
	}
	
	

}
