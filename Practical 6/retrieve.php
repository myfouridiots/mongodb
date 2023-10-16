<?php
   // connect to mongodb
   $m = new MongoClient();
   echo "Connection to database successfully";
	
   // select a database
   $db = $m->TYIT239665;
   echo "Database TYIT239665 selected";
   $collection = $db->mycol;
   echo "Collection selected succsessfully";

   $cursor = $collection->find();
   // iterate cursor to display title of documents
	
   foreach ($cursor as $document) {
      echo "<br>". $document["Name"] . "<br>";
      echo "<br>". $document["Age"] . "<br>";
      echo "<br>". $document["Dept"] . "<br>";
      echo "<br>". $document["RollNo"] . "<br>";
   }
