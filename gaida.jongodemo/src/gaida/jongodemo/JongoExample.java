package gaida.jongodemo;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.Init;
import org.apache.felix.dm.annotation.api.Start;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * Example OSGi MongoDB + Jongo
 * @author gaida
 */
@Component
public class JongoExample {
	
	@Start
	public void start() {
		System.out.println("\n\n\n\n\n\ntest!\n\n\n\n\n\n\n");
		DB db = new MongoClient().getDB("test");

		Jongo jongo = new Jongo((DB) db);
		MongoCollection friends = jongo.getCollection("friends");
		
		Friend gaida = new Friend("gaida", 27);

		friends.save(gaida);
		
		Friend result = friends.findOne("{name: 'gaida'}").as(Friend.class);
		
		if (result != null) {
			System.out.println("It worked! name: " + result.getName());
		} else {
			System.out.println("It didn't work.");
		}
	}
}
