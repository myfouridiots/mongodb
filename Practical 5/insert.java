import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;
public class insert
{
    public static void main(String args[])
    {
        MongoClient mongo=new MongoClient("localhost",27017);
        System.out.println("Connected to the database successfully");
        MongoDatabase database=mongo.getDatabase("TYIT239669");
        MongoCollection<Document>Collection=database.getCollection("MyCol");
        System.out.println("Collection TYITCollection selected successfully");
        Document document=new Document();
        document.append("id",1);
        document.append("Name","Shrikant");
        document.append("RollNo",239669);
        document.append("Age",23);
        document.append("College","MCC");
        Collection.insertOne(document);
        System.out.println("Document inserted successfully");
    }
}