package snhu;


import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import ch.qos.logback.classic.*;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

public class MongoConnect {
	
	static Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
	static {
		root.setLevel(Level.INFO);
	}
	
	public static DB db = null;
	public static DBCollection coll = null;
	@SuppressWarnings("deprecation")
	public static void ConnectToDB() 
	{
		
		try {
				@SuppressWarnings("resource")
				MongoClient mongoClient = new MongoClient(new ServerAddress("localhost",27017));
				db = mongoClient.getDB("market");
				coll = db.getCollection("stocks");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

