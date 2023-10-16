from pymongo import MongoClient

client = MongoClient('localhost', 27017)
db = client.TYIT239703

def read():
    try:
        collection = db.MyCol  # Assign the collection to a variable
        documents = collection.find()  # Use find() to retrieve all documents

        print("\n All data from Employee data database \n")

        for document in documents:  # Iterate through the documents
            print(document)

    except Exception as e:  # Capture and print exceptions
        print(str(e))

read()

# Close the MongoDB client
client.close()
