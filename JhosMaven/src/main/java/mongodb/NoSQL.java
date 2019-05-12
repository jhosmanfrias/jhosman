package mongodb;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class NoSQL {

	
public static void main (String[] args) throws UnknownHostException {
	
	// Old version, uses Mongo
	//Mongo mongo_old = new Mongo("localhost", 27017);

	// Since 2.10.0, uses MongoClient
	MongoClient mongo = new MongoClient( "localhost" , 27017);
	
	DB db = mongo.getDB("database name");
	
	List<String> dbs = mongo.getDatabaseNames();
	
	for(String db1 : dbs){
		System.out.println(db1);
		db.getCollection("user");
	}
	
	DB db3 = mongo.getDB("local");
	Set<String> tables = db3.getCollectionNames();

	for(String coll : tables){
		System.out.println(coll);
	}
	
	/*
	DBCollection table = db.getCollection("user");
	BasicDBObject document = new BasicDBObject();
	document.put("name", "mkyong");
	document.put("age", 30);
	document.put("createdDate", new Date());
	table.insert(document);
	*/
	
}
	
}
