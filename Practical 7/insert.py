from pymongo import MongoClient

client = MongoClient('localhost', 27017)
db = client.TYIT239703
collection = db.MyCol

def insert():
    try:
        name1 = input("Enter the name: ")
        age1 = int(input("Enter the Age: "))
        
        # Use insert_one to insert a single document
        result = collection.insert_one({
            "Name": name1,
            "Age": age1
        })

        print("Inserted data successfully." )
    except Exception as e:
        print(str(e))

insert()
