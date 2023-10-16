<?php
   // connect to mongodb
   $m = new MongoClient();
   echo "Connection to database successfully";
	
   // select a database
   $db = $m->TYIT239665;
   echo "Database TYIT239665 selected";
   $collection = $db->mycol;
   echo "Collection selected succsessfully";
   
   // now remove the document
   $collection->remove(array("Name"=>"Raj"));
   echo "Documents deleted successfully";
   
   // now display the available documents
   $cursor = $collection->find();
	
   // iterate cursor to display title of documents
   echo "Updated document";
	
   //foreach ($cursor as $document) {
     // echo $document["title"] . "\n";
   //}
?>