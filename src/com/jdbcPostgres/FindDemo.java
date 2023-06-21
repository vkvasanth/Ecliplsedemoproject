package com.jdbcPostgres;

import java.util.List;

public class FindDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
MongoClient connection =MongoClient.crete("mongodb://localhost:27017");
System.out.println("vonnected successfull");
MongoDatabase database=connection.getDatabase("fsd1");
MongoCollection <Document> collection=database.getCollection("employee");
MongoCursor cursor = collection.find().cursor();
while(cursor.hasnext())
{
	Document doc = cursor.next();
	System.out.println(doc.values());
}
}catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}

}
