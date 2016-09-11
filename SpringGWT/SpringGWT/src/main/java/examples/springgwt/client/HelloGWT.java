/**
 * 
 */
package examples.springgwt.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Jun 13, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class HelloGWT implements EntryPoint{
	
	@Override
	public void onModuleLoad() {
		
		ContentDispatcher dispatcher = new ContentDispatcher(new FilterContent());
	    
	    dispatcher.setContent(ContentDispatcher.TAG_ID_CONTENT);
	}

}
