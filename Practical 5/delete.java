import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;
import com.mongodb.client.model.Filters;

public class delete
{
	public static void main(String args[])
	{
		MongoClient mongo=new MongoClient("localhost",27017);
        System.out.println("Connected to the database successfully");
        MongoDatabase database=mongo.getDatabase("TYIT239703");
		MongoCollection<Document>Collection=database.getCollection("TYITCollection");
		System.out.println("Collection TYITCollection selected successfully");
		
		Collection.deleteOne(Filters.eq("id",1));
		System.out.println("Document deleted successfully");
	}
}
