from pymongo import MongoClient

client = MongoClient('localhost', 27017)
db = client.TYIT239703
collection = db.MyCol

def update():
    try:
        name1 = input("\nEnter the name to update: \n")
        age1 = int(input("\nEnter the Age to update: \n"))

        # Use the update_one method to update a single document
        result = collection.update_one({"Name": name1}, {"$set": {"Age": age1}})

       
        print("\nRecord updated successfully\n")
        

    except Exception as e:
        print(str(e))

update()
