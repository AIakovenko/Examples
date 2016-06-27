/**
 * 
 */
package example.velocity_examples;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 * Jun 26, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class SampleObject implements Sample{
	
	/* (non-Javadoc)
	 * @see example.velocity_examples.Sample#getContent()
	 */
	@Override
	public String getContent() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.addProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		StringWriter writer = new StringWriter();
		try {
			ve.init();
			VelocityContext context = new VelocityContext();
			context.put("title", "Object using examle");
			List<String> seasonList = new ArrayList<>(4);
			seasonList.add("winter");
			seasonList.add("spring");
			seasonList.add("summer");
			seasonList.add("autumn");
			
			context.put("seasonList", seasonList);
			context.put("seasons", new Year());
			
			Template template = ve.getTemplate("sample-object.vm", "utf-8");
			template.merge(context, writer);
			return writer.toString();
			
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
