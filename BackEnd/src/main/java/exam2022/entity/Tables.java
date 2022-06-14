package exam2022.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data7")
public class Tables {
	@Id
	@GeneratedValue
	Long id;
	String title11;
	Long age;
	
	public Tables() {
		
	}
	
	public Tables(Long id, String title11, Long age) {
		this.id = id;
		this.title11 = title11;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle11() {
		return title11;
	}

	public void setTitle11(String title11) {
		this.title11 = title11;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "{\"id\": \""+id+"\", \"title11\": \""+title11+"\", \"age\": \""+age+"\"}";
	}
	
	
}