/**
 * 
 */
package entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Jun 6, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
@Entity
@Table(name="test")
public class MyEntity {
	@Id
	private Integer id;
	
	@Basic
	private String value;
	
	public MyEntity(){}
	
	public MyEntity(Integer id, String value){
		this.id = id;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
