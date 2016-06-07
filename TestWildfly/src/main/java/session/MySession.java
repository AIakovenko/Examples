/**
 * 
 */
package session;

import javax.ejb.Local;

import entity.MyEntity;

/**
 * Jun 6, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
@Local
public interface MySession {
	MyEntity saveTest(MyEntity testEntity);

}
