/**
 * 
 */
package examples.springgwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Jun 13, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public interface GreetingServiceAsync {
	void greet(String name, AsyncCallback<String> callback);
}
