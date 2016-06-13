/**
 * 
 */
package examples.springgwt.server;

import org.springframework.stereotype.Service;

import examples.springgwt.client.GreetingService;

/**
 * Jun 13, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greet(String name) {
		return "Hello " + name + "!" ;
	}
}
