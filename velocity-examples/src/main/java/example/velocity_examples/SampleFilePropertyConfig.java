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

/**
 * Jun 27, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class SampleFilePropertyConfig implements Sample{
	
	/* (non-Javadoc)
	 * @see example.velocity_examples.Sample#getContent()
	 */
	@Override
	public String getContent() {
		try{
			VelocityEngine ve = new VelocityEngine("velocity.properties");
			ve.init();
			VelocityContext context = new VelocityContext();
			
			StringWriter writer = new StringWriter();
			
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
