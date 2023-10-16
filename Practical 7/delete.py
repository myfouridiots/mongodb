from pymongo import MongoClient

client = MongoClient('localhost', 27017)
db = client.TYIT239703

def delete():
    try:
        name1 = input("Enter Name: ")
        
        # Use the delete_one method to delete a single document
        result = db.MyCol.delete_one({"Name": name1})

       
        print("\nDeletion successful\n")
       

    except Exception as e:
        print(str(e))

delete()

# Close the MongoDB client
client.close()
