/**
 * 
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.MyEntity;
import session.MySession;

/**
 * Jun 6, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */

@Stateless
public class MyBean implements MySession {
	
	@PersistenceContext(unitName = "ibeaconDB")
	private EntityManager entityManager;
	

	@Override
	public MyEntity saveTest(MyEntity testEntity) {
		MyEntity result = entityManager.merge(testEntity);
		return result;
	}

}
