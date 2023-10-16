<?php
   // connect to mongodb
   $m = new MongoClient();
   echo "Connection to database successfully";
	
   // select a database
   $db = $m->TYIT239665;
   echo "Database TYIT239665 selected";
   $collection = $db->mycol;
   echo "Collection selected succsessfully";

   // now update the document
   $collection->update(array("Name"=>"Raj"), 
      array('$set'=>array("Age"=>25)));
   echo "Document updated successfully";
	
   // now display the updated document
   $cursor = $collection->find();
	
   // iterate cursor to display title of documents
   echo "Updated document";
	
  // foreach ($cursor as $document) {
    //  echo $document["title"] . "<br>";
   //}
?>