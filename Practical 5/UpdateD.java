import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;


public class UpdateD {
    public static void main(String[] args) {
       
            // Connect to the MongoDB server
            MongoClient mongo = new MongoClient("localhost", 27017);
            System.out.println("Connected to the database successfully");

            // Get the database
            DB db = mongo.getDB("TYIT239669");

            // Get the collection
            DBCollection col = db.getCollection("MyCol");

            // Create a query to find the document you want to update (e.g., where "id" is 1)
            BasicDBObject query = new BasicDBObject("id", 1);

            // Create an update object to specify the changes you want to make (e.g., set "AGE" to 27)
            BasicDBObject update = new BasicDBObject("$set", new BasicDBObject("Age", 27));

            // Update the document
            WriteResult result = col.update(query, update);


            // Close the MongoDB client
            mongo.close();
        
        }
    }

