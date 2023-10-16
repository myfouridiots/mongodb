<?php
   // connect to mongodb
   $m = new MongoClient();
   echo "Connection to database successfully";
	
   // select a database
   $db = $m->TYIT239665;
   echo "Database TYIT239665 selected";
   $collection = $db->mycol;
   echo "Collection selected succsessfully";
	
   $document = array( 
      "Name" => "Raj", 
      "Age" => 20, 
      "Dept" =>"TYIT",
      "RollNo" => 239665
   );
	
   $collection->insert($document);
   echo "Document inserted successfully";
?>