package gaida.jongodemo;

import org.jongo.marshall.jackson.oid.MongoId;

/**
 * Just a test class.
 * @author gaida
 */
public class Friend {
	
    @MongoId
    private String key;
    
    private String name;
    
    private int age;
    
    public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
