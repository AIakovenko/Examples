/**
 * 
 */
package examples.springgwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Jun 13, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
@RemoteServiceRelativePath("springGwtServices/greetingService")
public interface GreetingService extends RemoteService{
	String greet(String name);
}
